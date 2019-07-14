create table book (
                      id serial primary key,
                      title varchar(255) not null ,
                      pages int not null);

CREATE TABLE company (
                         id  SERIAL PRIMARY KEY,
                         name VARCHAR(100),
                         inn VARCHAR(12) NOT NULL UNIQUE
);

-- создаем связь один ко многим
ALTER TABLE book ADD COLUMN company_id int;
ALTER TABLE book ADD CONSTRAINT company_to_book foreign key (company_id) REFERENCES company (id);


create table author (
                        id serial primary key ,
                        name varchar(30),
                        surname varchar(30)
);

CREATE TABLE book_author (
                             id serial PRIMARY KEY ,
                             author_id int,
                             book_id int
);

ALTER TABLE book_author ADD CONSTRAINT book_author_to_author FOREIGN KEY (author_id) REFERENCES author (id);
ALTER TABLE book_author ADD CONSTRAINT book_author_to_book FOREIGN KEY (book_id) references book (id);



INSERT INTO company (name, inn) VALUES ('Махаон', '1563379');
INSERT INTO company (name, inn) VALUES ('Лира', '46481-15');

insert into book (title, pages, company_id) VALUES ('Война и мир' , 9000, 1);
insert into book (title, pages, company_id) VALUES ('Властелин колец', 6512, 2);
insert into book (title, pages, company_id) VALUES ('Песнь льда и пламени', 7524, 1);
insert into book (title, pages, company_id) VALUES ('Колобок', 14,1);
insert into book (title, pages, company_id) VALUES ('Пленники астероида', 480, 2);
insert into book (title, pages, company_id) values ('Коза дереза', 15, 2);
insert into book (title, pages, company_id) values ('Каренина', 900, 1);

insert into author (name, surname) VALUES ('Кир', 'Булычев');
INSERT INTO author (name, surname) VALUES ('Александр', 'Пушкин');
INSERT INTO author (name, surname) VALUES ('Лев', 'Толстой');
INSERT INTO author (name, surname) VALUES ('', 'народ');
INSERT INTO author (name, surname) VALUES ('Джон', 'Толкиен');
INSERT INTO author (name, surname) VALUES ('Джордж', 'Мартин');


INSERT INTO book_author(author_id, book_id) values (1, 5);
INSERT INTO book_author(author_id, book_id) values (3, 1);
INSERT INTO book_author(author_id, book_id) values (4, 4);
INSERT INTO book_author(author_id, book_id) values (5, 2);
INSERT INTO book_author(author_id, book_id) values (6, 3);
insert into book_author(author_id, book_id) values (3, 12);
insert into book_author(author_id, book_id) values (4, 11);

select b.*
from book b
where b.pages >= 400 and b.company_id=2
order by b.id desc
limit 1 offset 1
;