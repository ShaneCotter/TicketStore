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
  date                          timestamp,
  title                         varchar(255),
  constraint pk_event primary key (event_id)
);
create sequence event_seq;

<<<<<<< HEAD
create table event_category (
  event_id                      bigint not null,
  cat_id                        bigint,
  constraint pk_event_category primary key (event_id)
);
create sequence event_category_seq;

create table order (
  order_id                      bigint not null,
  user_id                       bigint,
  order_date                    timestamp,
  total_cost                    double,
=======
create table order (
  order_id                      bigint not null,
  order_date                    varchar(255),
  total_cost                    double,
  user_id                       bigint,
>>>>>>> dff9eed82aae26005759f96140f8b9bb449d60b0
  constraint pk_order primary key (order_id)
);
create sequence order_seq;

<<<<<<< HEAD
create table order_ticket (
  ticket_id                     bigint not null,
  order_id                      bigint,
  quantity                      integer,
  cost                          double,
  constraint pk_order_ticket primary key (ticket_id)
);
create sequence order_ticket_seq;

create table ticket (
  ticket_id                     bigint not null,
  event_id                      bigint,
  ticket_type                   varchar(255),
  quantity                      integer,
  price                         double,
=======
create table ticket (
  ticket_id                     bigint not null,
  ticket_type                   varchar(255),
  qty                           integer,
  price                         double,
  event_id                      bigint,
>>>>>>> dff9eed82aae26005759f96140f8b9bb449d60b0
  constraint pk_ticket primary key (ticket_id)
);
create sequence ticket_seq;

create table user (
  user_id                       bigint not null,
  role                          varchar(255),
  username                      varchar(255),
  email                         varchar(255),
  address1                      varchar(255),
  address2                      varchar(255),
  town                          varchar(255),
  city                          varchar(255),
  security_ans                  varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (user_id)
);
create sequence user_seq;

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

<<<<<<< HEAD
drop table if exists event_category;
drop sequence if exists event_category_seq;

drop table if exists order;
drop sequence if exists order_seq;

drop table if exists order_ticket;
drop sequence if exists order_ticket_seq;

=======
drop table if exists order;
drop sequence if exists order_seq;

>>>>>>> dff9eed82aae26005759f96140f8b9bb449d60b0
drop table if exists ticket;
drop sequence if exists ticket_seq;

drop table if exists user;
drop sequence if exists user_seq;

drop table if exists event_category;
drop sequence if exists event_category_seq;

drop table if exists order_ticket;
drop sequence if exists order_ticket_seq;

