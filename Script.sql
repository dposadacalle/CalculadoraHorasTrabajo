drop table if exists servicios;

create table servicios 
(
	id bigint not null auto_increment, 
    fecha_fin datetime(6), 
    fecha_inicio datetime(6), 
    ident_servicio varchar(30), 
    ident_tecnico varchar(30), 
    primary key (id)
) engine=InnoDB;