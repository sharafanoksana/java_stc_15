CREATE TABLE book
(
    id    SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    pages INT          NOT NULL
);

CREATE TABLE company
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(100),
    inn  VARCHAR(12) NOT NULL UNIQUE
);

CREATE TABLE person
(
    id      SERIAL PRIMARY KEY,
    surname VARCHAR(20) NOT NULL,
    name    VARCHAR(30)
);

CREATE TABLE type_operation
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(9)
);

CREATE TABLE operation
(
    id                SERIAL PRIMARY KEY,
    person_id         INT       NOT NULL UNIQUE,
    created_at        TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    book_id           INT       NOT NULL,
    type_operation_id INT       NOT NULL
);

CREATE TABLE for_whom
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE book_theme
(
    id    SERIAL PRIMARY KEY,
    title VARCHAR(250) NOT NULL UNIQUE
);

CREATE TABLE for_whom_book_theme
(
    id            SERIAL PRIMARY KEY,
    book_id       INT NOT NULL,
    for_whom_id   INT NOT NULL,
    book_theme_id INT NOT NULL
);

-- создаем связь один ко многим
ALTER TABLE book
    ADD COLUMN company_id INT;
ALTER TABLE book
    ADD CONSTRAINT company_to_book FOREIGN KEY (company_id) REFERENCES company (id);



CREATE TABLE author
(
    id      SERIAL PRIMARY KEY,
    name    VARCHAR(30),
    surname VARCHAR(30)
);

CREATE TABLE book_author
(
    id        SERIAL PRIMARY KEY,
    author_id INT,
    book_id   INT
);

ALTER TABLE book_author
    ADD CONSTRAINT book_author_to_author FOREIGN KEY (author_id) REFERENCES author (id);
ALTER TABLE book_author
    ADD CONSTRAINT book_author_to_book FOREIGN KEY (book_id) REFERENCES book (id);

ALTER TABLE operation
    ADD CONSTRAINT operation_to_book FOREIGN KEY (book_id) REFERENCES book (id);
ALTER TABLE operation
    ADD CONSTRAINT operation_to_person FOREIGN KEY (person_id) REFERENCES person (id);
ALTER TABLE operation
    ADD CONSTRAINT operation_to_type_operation FOREIGN KEY (type_operation_id)
        REFERENCES type_operation (id);

ALTER TABLE for_whom_book_theme
    ADD CONSTRAINT for_whom_book_theme_to_for_whom FOREIGN KEY (for_whom_id)
        REFERENCES for_whom (id);
ALTER TABLE for_whom_book_theme
    ADD CONSTRAINT for_whom_book_theme_to_book_theme FOREIGN KEY (book_theme_id)
        REFERENCES book_theme (id);
ALTER TABLE for_whom_book_theme
    ADD CONSTRAINT for_whom_book_theme_to_book FOREIGN KEY (book_id)
        REFERENCES book (id);

ALTER TABLE operation
    DROP CONSTRAINT operation_person_id_key;

CREATE UNIQUE INDEX author_name_surname_uindex ON author (name, surname);
CREATE UNIQUE INDEX company_name_inn_uindex ON company (name, inn);



-- INSERT INTO company (name, inn) VALUES ('Махаон', '1563379');
-- INSERT INTO company (name, inn) VALUES ('Лира', '46481-15');

-- INSERT INTO book (title, pages, company_id) VALUES ('Война и мир' , 9000, 1);
-- INSERT INTO book (title, pages, company_id) VALUES ('Властелин колец', 6512, 2);
-- INSERT INTO book (title, pages, company_id) VALUES ('Песнь льда и пламени', 7524, 1);
-- INSERT INTO book (title, pages, company_id) VALUES ('Колобок', 14,1);
-- INSERT INTO book (title, pages, company_id) VALUES ('Пленники астероида', 480, 2);
-- INSERT INTO book (title, pages, company_id) VALUES ('Коза дереза', 15, 2);
-- INSERT INTO book (title, pages, company_id) VALUES ('Каренина', 900, 1);
--
-- INSERT INTO author (name, surname) VALUES ('Кир', 'Булычев');
-- INSERT INTO author (name, surname) VALUES ('Александр', 'Пушкин');
-- INSERT INTO author (name, surname) VALUES ('Лев', 'Толстой');
-- INSERT INTO author (name, surname) VALUES ('', 'народ');
-- INSERT INTO author (name, surname) VALUES ('Джон', 'Толкиен');
-- INSERT INTO author (name, surname) VALUES ('Джордж', 'Мартин');
--
-- INSERT INTO book_author(author_id, book_id) VALUES (1, 5);
-- INSERT INTO book_author(author_id, book_id) VALUES (3, 1);
-- INSERT INTO book_author(author_id, book_id) VALUES (4, 4);
-- INSERT INTO book_author(author_id, book_id) VALUES (5, 2);
-- INSERT INTO book_author(author_id, book_id) VALUES (6, 3);
-- INSERT INTO book_author(author_id, book_id) VALUES (3, 12);
-- INSERT INTO book_author(author_id, book_id) VALUES (4, 11);
--
-- DELETE FROM book_author;
-- DELETE FROM author;
-- DELETE FROM book;
-- DELETE FROM company;
INSERT INTO type_operation (name)
VALUES ('Создана');
INSERT INTO type_operation (name)
VALUES ('Взята');
INSERT INTO type_operation (name)
VALUES ('Возвращена');
INSERT INTO type_operation (name)
VALUES ('Списана');

INSERT INTO person (surname, name)
VALUES ('Шарафан', 'Оксана');
INSERT INTO person (surname, name)
VALUES ('Иванов', 'Иван');
INSERT INTO person (surname, name)
VALUES ('Сидоров', 'Илья');
INSERT INTO person (surname, name)
VALUES ('Подворчан', 'Макар');
INSERT INTO person (surname, name)
VALUES ('Александрова', 'Мария');


INSERT INTO company (name, inn)
VALUES ('Эксмо', 'ISBN: 978-5-699-54574-2');
INSERT INTO author (name, surname)
VALUES ('Кэтти', 'Сьерра ');
INSERT INTO book_theme (title)
VALUES ('Java');
INSERT INTO for_whom (name)
VALUES ('Java-разработчик');
INSERT INTO book (title, pages, company_id)
VALUES ('Изучаем Java', 720, 5);
INSERT INTO book_author (author_id, book_id)
VALUES (8, 16);
INSERT INTO for_whom_book_theme (book_id, for_whom_id, book_theme_id)
VALUES (16, 1, 1);

INSERT INTO company (name, inn)
VALUES ('Питер', 'ISBN: 978-5-4461-0106-1');
INSERT INTO author (name, surname)
VALUES ('Эрик', 'Фримен ');
INSERT INTO book_theme (title)
VALUES ('Патеерны');
INSERT INTO for_whom (name)
VALUES ('Разработчикам');
INSERT INTO book (title, pages, company_id)
VALUES ('Паттерны проектирования', 656, 6);
INSERT INTO book_author (author_id, book_id)
VALUES (9, 17);
INSERT INTO for_whom_book_theme (book_id, for_whom_id, book_theme_id)
VALUES (17, 2, 2);

INSERT INTO company (name, inn)
VALUES ('Питер', 'ISBN: 978-5-496-01257-7');
--INSERT INTO author (name, surname) VALUES ('Эрик', 'Фримен ');
INSERT INTO book_theme (title)
VALUES ('JavaScript');
INSERT INTO for_whom (name)
VALUES ('JavaScript');
INSERT INTO book (title, pages, company_id)
VALUES ('Изучаем программирование на JavaScript', 640, 6);
INSERT INTO book_author (author_id, book_id)
VALUES (9, 19);
INSERT INTO for_whom_book_theme (book_id, for_whom_id, book_theme_id)
VALUES (19, 3, 3);

INSERT INTO company (name, inn)
VALUES ('Эксмо', 'ISBN: 978-5-04-101286-1');
INSERT INTO author (name, surname)
VALUES ('Джон ', 'Дакетт ');
INSERT INTO book_theme (title)
VALUES ('HTML и CSS');
INSERT INTO for_whom (name)
VALUES ('Web-дизайнерам');
INSERT INTO book (title, pages, company_id)
VALUES ('HTML и CSS. Разработка и дизайн веб-сайтов', 480, 5);
INSERT INTO book_author (author_id, book_id)
VALUES (11, 20);
INSERT INTO book_author (author_id, book_id)
VALUES (11, 16);
INSERT INTO for_whom_book_theme (book_id, for_whom_id, book_theme_id)
VALUES (20, 4, 4);

INSERT INTO company (name, inn)
VALUES ('Сам Издат', '000000');



-- DELETE FROM book WHERE id = 18;
--DELETE FROM author WHERE id = 10;

INSERT INTO operation (person_id, book_id, type_operation_id)
VALUES (1, 16, 1);
INSERT INTO operation (person_id, book_id, type_operation_id)
VALUES (2, 16, 2);
INSERT INTO operation (person_id, book_id, type_operation_id)
VALUES (2, 16, 3);
INSERT INTO operation (person_id, book_id, type_operation_id)
VALUES (1, 17, 1);

INSERT INTO operation (person_id, book_id, type_operation_id)
VALUES (2, 17, 2);
INSERT INTO operation (person_id, book_id, type_operation_id)
VALUES (2, 16, 2);
INSERT INTO operation (person_id, book_id, type_operation_id)
VALUES (2, 19, 1);
INSERT INTO operation (person_id, book_id, type_operation_id)
VALUES (2, 20, 1);
INSERT INTO operation (person_id, book_id, type_operation_id)
VALUES (2, 17, 3);
INSERT INTO operation (person_id, book_id, type_operation_id)
VALUES (2, 16, 3);
INSERT INTO operation (person_id, book_id, type_operation_id)
VALUES (2, 19, 2);
INSERT INTO operation (person_id, book_id, type_operation_id)
VALUES (2, 20, 2);


SELECT b.*
FROM book b
WHERE b.pages >= 400
  AND b.company_id = 2
ORDER BY b.id DESC
LIMIT 1 OFFSET 1
;

SELECT *
FROM book b
         INNER JOIN book_author ba ON b.id = ba.book_id
         INNER JOIN author a ON ba.author_id = a.id
;

SELECT *
FROM author a
         INNER JOIN book_author ba ON a.id = ba.author_id
         INNER JOIN book b ON ba.book_id = b.id
;

SELECT *
FROM book b
         INNER JOIN company c ON b.company_id = c.id
;

SELECT *
FROM company c
         LEFT JOIN book b ON c.id = b.company_id
;

SELECT *
FROM book b
         RIGHT JOIN company c ON b.company_id = c.id
;

SELECT c.name || ' ' || b.title AS book_and_company
FROM company c
         LEFT JOIN book b ON c.id = b.company_id
;

SELECT *
FROM book b
         LEFT OUTER JOIN company c ON b.company_id = c.id
;

SELECT COUNT(b.id) AS oksana,
       sum(b.id)   AS maxim,
       max(b.id)
FROM book b
;

SELECT a.id, a.surname, b.id, b.title
FROM author a
         INNER JOIN book_author ba ON ba.author_id = a.id
         INNER JOIN book b ON ba.book_id = b.id
;

SELECT c.id, c.name, COUNT(b.id)
FROM book b
         INNER JOIN company c ON b.company_id = c.id
GROUP BY c.id, c.name
;

SELECT p.surname, COUNT(b.id)
FROM person p
         INNER JOIN operation o ON p.id = o.person_id
         INNER JOIN type_operation tp ON tp.id = o.type_operation_id
         INNER JOIN book b ON b.id = o.book_id
WHERE tp.id = 1 --and p.surname='Сидоров'
  AND o.created_at > '2018-03-12'
GROUP BY p.id
;