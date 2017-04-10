# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  cat_id                        bigint not null,
  name                          varchar(255),
  constraint pk_category primary key (cat_id)
);
create sequence category_seq;

create table contact (
  id                            bigint not null,
  first_name                    varchar(255),
  last_name                     varchar(255),
  email                         varchar(255),
  phone                         integer,
  message                       varchar(255),
  constraint pk_contact primary key (id)
);
create sequence contact_seq;

create table event (
  id                            bigint not null,
  event_name                    varchar(255),
  time                          varchar(255),
  location                      varchar(255),
  date                          varchar(255),
  title                         varchar(255),
  category_cat_id               bigint,
  constraint pk_event primary key (id)
);
create sequence event_seq;

create table order_ticket (
  ticket_id                     bigint not null,
  order_id                      bigint,
  qty                           integer,
  cost                          double,
  constraint pk_order_ticket primary key (ticket_id)
);
create sequence order_ticket_seq;

create table ticket (
  ticket_id                     bigint not null,
  ticket_type                   varchar(255),
  quantity                      integer,
  price                         double,
  event_id                      bigint,
  constraint pk_ticket primary key (ticket_id)
);
create sequence ticket_seq;

create table user (
  email                         varchar(255) not null,
  role                          varchar(255),
  name                          varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (email)
);

alter table event add constraint fk_event_category_cat_id foreign key (category_cat_id) references category (cat_id) on delete restrict on update restrict;
create index ix_event_category_cat_id on event (category_cat_id);

alter table ticket add constraint fk_ticket_event_id foreign key (event_id) references event (id) on delete restrict on update restrict;
create index ix_ticket_event_id on ticket (event_id);


# --- !Downs

alter table event drop constraint if exists fk_event_category_cat_id;
drop index if exists ix_event_category_cat_id;

alter table ticket drop constraint if exists fk_ticket_event_id;
drop index if exists ix_ticket_event_id;

drop table if exists category;
drop sequence if exists category_seq;

drop table if exists contact;
drop sequence if exists contact_seq;

drop table if exists event;
drop sequence if exists event_seq;

drop table if exists order_ticket;
drop sequence if exists order_ticket_seq;

drop table if exists ticket;
drop sequence if exists ticket_seq;

drop table if exists user;

