# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table event (
  event_id                      bigint not null,
  event_name                    varchar(255),
  description                   varchar(255),
  time                          varchar(255),
  location                      varchar(255),
  date                          timestamp,
  constraint pk_event primary key (event_id)
);
create sequence event_seq;


# --- !Downs

drop table if exists event;
drop sequence if exists event_seq;

