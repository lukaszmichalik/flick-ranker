CREATE TABLE comments_db.comments (
    id SERIAL NOT NULL,
    content TEXT,
    author_id INTEGER,
    ranking_id INTEGER,
    date DATE,
    PRIMARY KEY (id)
);
