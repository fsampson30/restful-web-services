insert into user_details(id,birth_date,name) values (10001,current_date(),'Flavio Sampson');
insert into user_details(id,birth_date,name) values (10002,current_date(),'Fernanda Sampson');
insert into user_details(id,birth_date,name) values (10003,current_date(),'Natalia Sampson');

insert into post(id,description,user_id) values (20001,'I want to learn AWS',10001);
insert into post(id,description,user_id) values (20002,'I want to devops',10001);
insert into post(id,description,user_id) values (20003,'I want to google cloud',10002);