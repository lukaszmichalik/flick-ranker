CREATE TABLE placements_db.placements (
    id SERIAL NOT NULL,
    standing INTEGER,
    ranking_id INTEGER,
    movie_id INTEGER,
    description TEXT,
    PRIMARY KEY (id)
);
