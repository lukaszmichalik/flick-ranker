CREATE TABLE users_db.users (
    id SERIAL NOT NULL,
    name TEXT NOT NULL,
    email TEXT NOT NULL UNIQUE,
    username TEXT NOT NULL UNIQUE,
    dob DATE,
    PRIMARY KEY (id)
);
