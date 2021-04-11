CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

SELECT uuid_generate_v1();
INSERT INTO users (id, last_name, first_name, middle_name, birth_date) VALUES
(uuid_generate_v1(), 'Nikolaev-Axenov', 'Ivan', 'Sergeevich', '15.06.2001'),
(uuid_generate_v1(), 'Ivanov', 'Ivan', 'Ivanovich', '01.01.2000');

SELECT uuid_generate_v1();
INSERT INTO posts (id, text, creation_date) VALUES
(uuid_generate_v1(), 'Hello!', '2021-04-11T01:31:51.442195'),
(uuid_generate_v1(), 'World!', '2021-04-11T01:31:51.442195');