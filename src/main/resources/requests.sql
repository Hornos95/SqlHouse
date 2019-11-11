CREATE TABLE house(
    id INTEGER PRIMARY KEY AUTOINCREMENT ,
    price INTEGER NOT NULL CHECK ( price > 0 ) ,
    rooms INTEGER NOT NULL CHECK ( rooms >=0 ) ,
    district TEXT NOT NULL ,
    underground TEXT NOT NULL );

INSERT INTO house( price, rooms, district, underground)
VALUES (1500000 , 1, 'Московский', 'Козья слабода'),
       (2000000, 2, 'Новосавиновский', 'Яшлек'),
       (3000000, 2, 'Московский', 'Козья слабода'),
       (5000000, 1, 'Вахитовский', 'Кремлевская'),
       (2000000, 1, 'Новосавиновский', 'Яшлек');
select * from house
