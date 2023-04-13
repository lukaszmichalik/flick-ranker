-- users inserts
INSERT INTO users_db.users VALUES(101,'Marek Nowak','marek@test.pl','Mareczek','1998-08-13');
INSERT INTO users_db.users VALUES(102,'Mirosław Kowalski','miro@test.pl','miro','1988-01-19');
INSERT INTO users_db.users VALUES(103,'Tomasz Malinowski','tomasz@test.pl','tom','1968-11-09');

-- rankings inserts
INSERT INTO rankings_db.rankings
VALUES(101,'Top 3 Movies of 2022',3,0,'This is ranking of the best movies that premiered in 2022.',101);
INSERT INTO rankings_db.rankings
VALUES(102,'My favorite tv shows of 2022',4,2,'I just came up with a ranking of my favorite shows last (2022).',101);
INSERT INTO rankings_db.rankings
VALUES(103,'Top 3 comic book movies of all time',3,1,'This is a ranking of best 3 comic book movies ever made.',102);

-- placements inserts
INSERT INTO placements_db.placements VALUES (101,1,101,76600,'Avatar 2 was my favorite one last year.','movie');
INSERT INTO placements_db.placements VALUES (102,2,101,414906,'The Batman is close second.','movie');
INSERT INTO placements_db.placements VALUES (103,3,101,965150,'Aftersun was heartbreaking.','movie');

INSERT INTO placements_db.placements
VALUES (104,1,102,119051,'Wednesday took me of guard. This is such an entertaining show that it has to be number 1. I have never expected this show to be so good','tv');
INSERT INTO placements_db.placements
VALUES (105,2,102,94997,'House of The Dragon just reminded me of Game of Thrones and brought back those great world of Westeros.','tv');
INSERT INTO placements_db.placements
VALUES (106,3,102,66732,'Stranger Things season 4 was the worst one of all seasons so far, at least for me. Either way is still find it entertaining and worth watching','tv');
INSERT INTO placements_db.placements
VALUES (107,4,102,83867,'Andor is just the greatest Star Wars we have ever got to see.','tv');
INSERT INTO placements_db.placements
VALUES (108,5,102,73107,'Barry is just great TV. Bill Hader is exceptional actor.','tv');

INSERT INTO placements_db.placements
VALUES (109,1,103,271110,'This is first movie that introduced hero battle, it has greatly developed characters.','movie');
INSERT INTO placements_db.placements
VALUES (110,2,103,263115,'Logan is just such a moving variation on Wolverine character.','movie');
INSERT INTO placements_db.placements
VALUES (111,3,103,155,'This is just comic movie classic.','movie');

-- comments inserts
INSERT INTO comments_db.comments VAlUES (101,'Your ranking is just completely wrong.',101,103,'2023-04-12');
INSERT INTO comments_db.comments VAlUES (102,'I would make exactly the same list.',102,101,'2023-04-11');
INSERT INTO comments_db.comments VAlUES (103,'I think Avatar was awful.',103,101,'2023-04-10');
INSERT INTO comments_db.comments VAlUES (104,'The Dark Night is overrated.',103,103,'2023-04-09');
