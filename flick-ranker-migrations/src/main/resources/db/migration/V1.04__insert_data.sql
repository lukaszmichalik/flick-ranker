-- users inserts
INSERT INTO users_db.users
VALUES(101,'Marek Nowak','marek@test.pl','Mareczek','1998-08-13');

-- rankings inserts
INSERT INTO rankings_db.rankings
VALUES(101,'Top 3 Movies of 2022',3,0,'This is ranking of the best movies that premiered in 2022',101);

-- placements inserts
INSERT INTO placements_db.placements VALUES (101,1,101,76600,'Avatar 2 was my favorite one last year.','movie');
INSERT INTO placements_db.placements VALUES (102,2,101,414906,'The Batman is close second.','movie');
INSERT INTO placements_db.placements VALUES (103,3,101,965150,'Aftersun was heartbreaking.','movie');