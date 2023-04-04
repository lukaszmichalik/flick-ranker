CREATE SCHEMA IF NOT EXISTS users_db;
CREATE TABLE users_db.users (
    id serial not null,
    name text not null,
    email text not null unique,
    username text not null unique,
    dob DATE
);
