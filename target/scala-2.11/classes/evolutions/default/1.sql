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
  description                   varchar(255),
  time                          varchar(255),
  location                      varchar(255),
  date                          timestamp,
  title                         varchar(255),
  price                         double,
  constraint pk_event primary key (event_id)
);
create sequence event_seq;

create table user (
  user_id                       bigint not null,
  role                          varchar(255),
  username                      varchar(255),
  email                         varchar(255),
  address1                      varchar(255),
  address2                      varchar(255),
  town                          varchar(255),
  city                          varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (user_id)
);
create sequence user_seq;


# --- !Downs

drop table if exists category;
drop sequence if exists category_seq;

drop table if exists event;
drop sequence if exists event_seq;

drop table if exists user;
drop sequence if exists user_seq;

