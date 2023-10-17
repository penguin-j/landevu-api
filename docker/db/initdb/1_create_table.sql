-- テーブル作成
create table area (area_id char(10) primary key, area_name varchar(10) not null);
create table spot (spot_id char(10) primary key, spot_name varchar(100) not null, area_id char(10) not null, longitude numeric not null, latitude numeric not null);