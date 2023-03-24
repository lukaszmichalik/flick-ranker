CREATE SCHEMA IF NOT EXISTS users_db;
CREATE TABLE users_db.users (
    id serial not null,
    name text,
    username text,
    dob Date
);
