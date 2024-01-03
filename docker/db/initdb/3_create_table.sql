-- テーブル作成
create table landevu.areas (
    area_id char(10) primary key,
    area_name varchar(10) not null
);
create table landevu.spots (
    spot_id char(10) primary key,
    spot_name varchar(100) not null,
    area_id char(10) not null,
    longitude numeric not null,
    latitude numeric not null,
    foreign key (area_id) references landevu.areas(area_id)
);
create table landevu.train_lines (
    train_line_id char(5) primary key,
    train_line_name varchar(100) not null
);
create table landevu.stations (
    station_id char(8) primary key,
    station_name varchar(100) not null,
    train_line_id char(5),
    area_id char(10),
    foreign key (train_line_id) references landevu.train_lines(train_line_id),
    foreign key (area_id) references landevu.areas(area_id)
);