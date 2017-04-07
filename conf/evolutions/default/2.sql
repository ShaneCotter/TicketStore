# --- !Ups
Insert into category(cat_id,name) values(1,'Music');
Insert into category(cat_id,name) values(2,'Sports');
Insert into category(cat_id,name) values(3,'Comedy');
Insert into category(cat_id,name) values(4,'Theatre');
Insert into category(cat_id,name) values(5,'Racing');

Insert into event (id,event_name,time,location,date,title,category_cat_id) values (1,'Ed Sheeran','8pm','3 Arena','27th June','Devide Tour',1);
Insert into event (id,event_name,time,location,date,title,category_cat_id) values (2,'Coldplay','7pm','02 Arena','27th June','Tour',1);
Insert into event (id,event_name,time,location,date,title,category_cat_id) values (3,'Motor Sport','2pm','Mondello Park','27th June','Racing Ireland',5);

Insert into ticket values (1,'Standing',10,100,1);
Insert into ticket values (2,'Seated',10,50,1);

Insert into user(email,role,name,password) values('shane@tc.ie','admin','shane','shane');
Insert into user(email,role,name,password) values('jay@tc.ie','admin','jay','jay');
Insert into user(email,role,name,password) values('matthew@tc.ie','admin','matthew','matthew');


