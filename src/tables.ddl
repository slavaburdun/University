CREATE TABLE professor
(
    id INT PRIMARY KEY NOT NULL,
    name VARCHAR(50) NOT NULL
);
CREATE TABLE subject
(
    id INT PRIMARY KEY NOT NULL,
    name VARCHAR(50) NOT NULL,
    day VARCHAR(10) NOT NULL,
    audience VARCHAR(10) NOT NULL,
    id_Professor INT NOT NULL
);
CREATE UNIQUE INDEX unique_id ON professor (id);
ALTER TABLE subject ADD FOREIGN KEY (id_Professor) REFERENCES professor (id);
CREATE UNIQUE INDEX unique_id ON subject (id);
