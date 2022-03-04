INSERT INTO regiones (nombre) VALUES ('Europa');
INSERT INTO regiones (nombre) VALUES ('Asia');
INSERT INTO regiones (nombre) VALUES ('Oceania');
INSERT INTO regiones (nombre) VALUES ('Africa');
INSERT INTO regiones (nombre) VALUES ('Centroamerica');
INSERT INTO regiones (nombre) VALUES ('Sudamerica');
INSERT INTO regiones (nombre) VALUES ('Norteamerica');
INSERT INTO regiones (nombre) VALUES ('Antartida');


INSERT INTO clientes (region_id,nombre,apellido,email,telefono,create_at) VALUES (1,'Jose','Perez','jp@email.com',6214545,'2022-03-01');
INSERT INTO clientes (region_id,nombre,apellido,email,telefono,create_at) VALUES (2,'Carlos','Lopez','cl@email.com',914545,'2022-03-01');
INSERT INTO clientes (region_id,nombre,apellido,email,telefono,create_at) VALUES (3,'Maria','Ortiz','mo@email.com',4242121,'2022-03-01');
INSERT INTO clientes (region_id,nombre,apellido,email,telefono,create_at) VALUES (4,'Dina','Ramirez','dr@email.com',921445,'2022-03-01');
INSERT INTO clientes (region_id,nombre,apellido,email,telefono,create_at) VALUES (5,'Mirna','Ramos','mr@email.com',6214545,'2022-03-01');
INSERT INTO clientes (region_id,nombre,apellido,email,telefono,create_at) VALUES (6,'Pepe','Mojica','pm@email.com',6245455,'2022-03-01');
INSERT INTO clientes (region_id,nombre,apellido,email,telefono,create_at) VALUES (7,'Juan','Chavez','jc@email.com',6214545,'2022-03-01');
INSERT INTO clientes (region_id,nombre,apellido,email,telefono,create_at) VALUES (8,'Enrrique','Iglesias','ei@email.com',6214545,'2022-03-01');
INSERT INTO clientes (region_id,nombre,apellido,email,telefono,create_at) VALUES (2,'Pedro','Diaz','pd@email.com',6784545,'2022-03-01');
INSERT INTO clientes (region_id,nombre,apellido,email,telefono,create_at) VALUES (1,'Ramon','Sanchez','rs@email.com',982154,'2022-03-01');


INSERT INTO usuarios (username,password,enabled) VALUES('rolando','2a$10$ZSLzum0Q5upYT3sn1wDlSOr4dffUt56fx/KlBDCGfp2ELWOTyihmm',1);
INSERT INTO usuarios (username,password,enabled) VALUES('admin','$2a$10$NuWM5hTm2Rr1FSN9EduFyeZMJQLczwbBEeAWf4fcJYSch/9rhqhIi',1);

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id,role_id) VALUES(1,1);
INSERT INTO usuarios_roles (usuario_id,role_id) VALUES(2,2);
INSERT INTO usuarios_roles (usuario_id,role_id) VALUES(2,1);

