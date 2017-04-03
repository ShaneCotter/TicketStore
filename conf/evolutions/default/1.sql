# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  cat_id                        bigint not null,
  cat_name                      varchar(255),
  constraint pk_category primary key (cat_id)
);
create sequence category_seq;

create table event (
  event_id                      bigint not null,
  event_name                    varchar(255),
  time                          varchar(255),
  location                      varchar(255),
  date                          varchar(255),
  title                         varchar(255),
  constraint pk_event primary key (event_id)
);
create sequence event_seq;

create table ticket (
  ticket_id                     bigint not null,
  ticket_type                   varchar(255),
  quantity                      integer,
  price                         double,
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

create table event_category (
  event_id                      bigint not null,
  cat_id                        bigint,
  constraint pk_event_category primary key (event_id)
);
create sequence event_category_seq;

create table order_ticket (
  ticket_id                     bigint not null,
  order_id                      bigint,
  qty                           integer,
  cost                          double,
  constraint pk_order_ticket primary key (ticket_id)
);
create sequence order_ticket_seq;


# --- !Downs

drop table if exists category;
drop sequence if exists category_seq;

drop table if exists event;
drop sequence if exists event_seq;

drop table if exists ticket;
drop sequence if exists ticket_seq;

drop table if exists user;

drop table if exists event_category;
drop sequence if exists event_category_seq;

drop table if exists order_ticket;
drop sequence if exists order_ticket_seq;

