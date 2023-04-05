CREATE TABLE rankings_db.rankings (
    id SERIAL NOT NULL,
    title TEXT NOT NULL,
    no_of_placements INTEGER,
    no_of_likes INTEGER,
    description TEXT,
    author_id INTEGER,
    PRIMARY KEY (id)
);
