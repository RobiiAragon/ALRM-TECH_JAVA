create table if not exists `user` (
    `id` int(11) not null auto_increment,
    `name` varchar(255) not null,
    `email` varchar(255) not null,
    `password` varchar(255) not null,
    `created_at` timestamp not null default current_timestamp,
    `updated_at` timestamp not null default current_timestamp on update current_timestamp,
    primary key (`id`)
) engine=InnoDB default charset=utf8mb4;


create table if not exists `catalogo` (
    `id` int(11) not null auto_increment,
    `name` varchar(255) not null,
    `description` varchar(255) not null,
    `created_at` timestamp not null default current_timestamp,
    `updated_at` timestamp not null default current_timestamp on update current_timestamp,
    primary key (`id`)
) engine=InnoDB default charset=utf8mb4;

create table if not exists `procesadores` (
    `id` int(11) not null auto_increment,
    `marca` varchar(255) not null,
    `generacion` varchar(255) not null,
    `gama` varchar(255) not null,
    `modificador` varchar(255) not null,
    `description` varchar(255) not null,
    `created_at` timestamp not null default current_timestamp,
    `updated_at` timestamp not null default current_timestamp on update current_timestamp,
    primary key (`id`)
) engine=InnoDB default charset=utf8mb4;

create table if not exists `motherboards` (
    `id` int(11) not null auto_increment,
    `name` varchar(255) not null,
    `marca` varchar(255) not null,
    `modelo` varchar(255) not null,
    `tamaño` varchar(255) not null,
    `description` varchar(255) not null,
    `created_at` timestamp not null default current_timestamp,
    `updated_at` timestamp not null default current_timestamp on update current_timestamp,
    primary key (`id`)
) engine=InnoDB default charset=utf8mb4;

create table if not exists `RAMs` (
    `id` int(11) not null auto_increment,
    `name` varchar(255) not null,
    `DDR` varchar(255) not null,
    `description` varchar(255) not null,
    `created_at` timestamp not null default current_timestamp,
    `updated_at` timestamp not null default current_timestamp on update current_timestamp,
    primary key (`id`)
) engine=InnoDB default charset=utf8mb4;

create table if not exists `almacenamientos` (
    `id` int(11) not null auto_increment,
    `name` varchar(255) not null,
    `tipoMemoria` varchar(255) not null,
    `description` varchar(255) not null,
    `created_at` timestamp not null default current_timestamp,
    `updated_at` timestamp not null default current_timestamp on update current_timestamp,
    primary key (`id`)
) engine=InnoDB default charset=utf8mb4;