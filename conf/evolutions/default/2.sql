# --- !Ups
Insert into category(cat_id,name) values(1,'Music');
Insert into category(cat_id,name) values(2,'Sports');
Insert into category(cat_id,name) values(3,'Comedy');
Insert into category(cat_id,name) values(4,'Theatre');
Insert into category(cat_id,name) values(5,'Racing');


Insert into event (id,event_name,time,location,date,title,category_cat_id) values (1,'Ed Sheeran','20:00','3Arena','14th April 2017','Divide Tour',1);
Insert into event (id,event_name,time,location,date,title,category_cat_id) values (2,'Coldplay','19:00','Croke Park','8th July 2017','Head Full of Dreams Tour',1);
Insert into event (id,event_name,time,location,date,title,category_cat_id) values (3,'European Grand Prix','12:00','Mondello Park','27th June 2017','Racing Ireland',5);
Insert into event (id,event_name,time,location,date,title,category_cat_id) values (4,'Al Porter','20:00','Bord Gais Energy Theatre','27th November 2017','Al Porter At Large',3);
Insert into event (id,event_name,time,location,date,title,category_cat_id) values (5,'The 1975','16:00','Malahide Castle','17th June 2017','The 1975 @ Malahide Castle',1);
Insert into event (id,event_name,time,location,date,title,category_cat_id) values (6,'Bruno Mars','20:00','3Arena','29th April 2017','24k Magic World Tour',1);
Insert into event (id,event_name,time,location,date,title,category_cat_id) values (7,'BAMMA 30','17:00','3Arena','7th July 2017','BAMMA Returns #GetReady',2);
Insert into event (id,event_name,time,location,date,title,category_cat_id) values (8,'Liverpool vs. Sydney FC','17:00','ANZ Stadium','31st May 2017','End-of-Season Friendly',2);
Insert into event (id,event_name,time,location,date,title,category_cat_id) values (9,'UFC 214','21:00', 'Honda Center, Anaheim, CA','29th July 2017','UFC 214',2);
Insert into event (id,event_name,time,location,date,title,category_cat_id) values (10,'Ricky Gervais','19:30','3Arena','24th June 2017','Humanity',3);
Insert into event (id,event_name,time,location,date,title,category_cat_id) values (11,'Not Dead Enough','14:30','Bord Gais Energy Theatre','21st May 2017','Peter James Not Dead Enough',4);
Insert into event (id,event_name,time,location,date,title,category_cat_id) values (12,'Irish Cross Country','08:00','Ballina, Co. Mayo','27th July 2017','Motorsport',5);

Insert into ticket values (1,'Standing',10,100,1);
Insert into ticket values (2,'Seated',10,50,1);
Insert into ticket values (3,'Standing',0,50,2);
Insert into ticket values (4,'Seated',10,50,2);
Insert into ticket values (5,'Day Pass',10,70,3);
Insert into ticket values (6,'VIP Pass',20,100,3);
Insert into ticket values (7,'Concession',10,35.50,4);
Insert into ticket values (14,'Back Stage',10,100,4);
Insert into ticket values (8,'Standing',10,50,5);
Insert into ticket values (15,'Front Standing',10,75,5);
Insert into ticket values (9,'Seated',10,50,6);
Insert into ticket values (10,'Standing',0,50,6);
Insert into ticket values (11,'Ring-side',10,50,7);
Insert into ticket values (16,'Standard',10,35,7);
Insert into ticket values (12,'Pitch side',10,50,8);
Insert into ticket values (13,'Seated',10,50,8);
Insert into ticket values (17,'Ringside',10,1000,9);
Insert into ticket values (18,'Concession',10,40,10);
Insert into ticket values (19,'Concession',10,50,11);
Insert into ticket values (20,'Weekend Pass',10,50,12);

Insert into user(email,role,name,password) values('shane@tc.ie','admin','shane','shane');
Insert into user(email,role,name,password) values('jay@tc.ie','admin','jay','jay');
Insert into user(email,role,name,password) values('matthew@tc.ie','admin','matthew','matthew');
