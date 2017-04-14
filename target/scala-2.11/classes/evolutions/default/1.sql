# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table basket (
  id                            bigint not null,
  user_email                    varchar(255),
  constraint uq_basket_user_email unique (user_email),
  constraint pk_basket primary key (id)
);
create sequence basket_seq;

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
  read                          boolean,
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

create table order_item (
  id                            bigint not null,
  order_id                      bigint,
  basket_id                     bigint,
  ticket_ticket_id              bigint,
  quantity                      integer,
  price                         double,
  constraint pk_order_item primary key (id)
);
create sequence order_item_seq;

create table shop_order (
  id                            bigint not null,
  order_date                    timestamp,
  user_email                    varchar(255),
  proccessed                    boolean,
  constraint pk_shop_order primary key (id)
);
create sequence shop_order_seq;

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

alter table basket add constraint fk_basket_user_email foreign key (user_email) references user (email) on delete restrict on update restrict;

alter table event add constraint fk_event_category_cat_id foreign key (category_cat_id) references category (cat_id) on delete restrict on update restrict;
create index ix_event_category_cat_id on event (category_cat_id);

alter table order_item add constraint fk_order_item_order_id foreign key (order_id) references shop_order (id) on delete restrict on update restrict;
create index ix_order_item_order_id on order_item (order_id);

alter table order_item add constraint fk_order_item_basket_id foreign key (basket_id) references basket (id) on delete restrict on update restrict;
create index ix_order_item_basket_id on order_item (basket_id);

alter table order_item add constraint fk_order_item_ticket_ticket_id foreign key (ticket_ticket_id) references ticket (ticket_id) on delete restrict on update restrict;
create index ix_order_item_ticket_ticket_id on order_item (ticket_ticket_id);

alter table shop_order add constraint fk_shop_order_user_email foreign key (user_email) references user (email) on delete restrict on update restrict;
create index ix_shop_order_user_email on shop_order (user_email);

alter table ticket add constraint fk_ticket_event_id foreign key (event_id) references event (id) on delete restrict on update restrict;
create index ix_ticket_event_id on ticket (event_id);


# --- !Downs

alter table basket drop constraint if exists fk_basket_user_email;

alter table event drop constraint if exists fk_event_category_cat_id;
drop index if exists ix_event_category_cat_id;

alter table order_item drop constraint if exists fk_order_item_order_id;
drop index if exists ix_order_item_order_id;

alter table order_item drop constraint if exists fk_order_item_basket_id;
drop index if exists ix_order_item_basket_id;

alter table order_item drop constraint if exists fk_order_item_ticket_ticket_id;
drop index if exists ix_order_item_ticket_ticket_id;

alter table shop_order drop constraint if exists fk_shop_order_user_email;
drop index if exists ix_shop_order_user_email;

alter table ticket drop constraint if exists fk_ticket_event_id;
drop index if exists ix_ticket_event_id;

drop table if exists basket;
drop sequence if exists basket_seq;

drop table if exists category;
drop sequence if exists category_seq;

drop table if exists contact;
drop sequence if exists contact_seq;

drop table if exists event;
drop sequence if exists event_seq;

drop table if exists order_item;
drop sequence if exists order_item_seq;

drop table if exists shop_order;
drop sequence if exists shop_order_seq;

drop table if exists ticket;
drop sequence if exists ticket_seq;

drop table if exists user;

