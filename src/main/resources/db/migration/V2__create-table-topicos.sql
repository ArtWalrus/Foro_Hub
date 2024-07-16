create table topicos (
    id bigint not null auto_increment primary key,
    titulo varchar(100) not null unique,
    mensaje varchar(500) not null unique,
    fecha varchar(100) not null,
    estatus boolean not null,
    autor int not null,
    curso varchar(100) not null
);