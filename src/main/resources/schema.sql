create table stocks
(
   id integer not null,
   name varchar(255) not null,
   currentPrice float,
   createDate Date,
   lastUpdate Date,
   primary key(id)
);