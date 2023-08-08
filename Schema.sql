CREATE SCHEMA veterinaria

CREATE TABLE IF NOT EXISTS veterinaria.medicos(
medicos_id bigserial NOT NULL,
apellido_paterno  varchar(50) NOT NULL,
apallido_materno  varchar(50) NOT NULL,
nombre  varchar(50) NOT NULL,
cedula  varchar(50) NOT NULL,
CONSTRAINT PK_medicos PRIMARY KEY(medicos_id)
);

CREATE TABLE IF NOT EXISTS veterinaria.pacientes(
pacientes_id bigserial NOT NULL,
nombrepaciente  varchar(50) NULL,
tipo  varchar(50) NULL,
fecha_naciemiento  varchar(50) NULL,
nombre_propietario  varchar(50) NULL,
telefono varchar(50) NULL,    
CONSTRAINT PK_pacientes PRIMARY KEY(pacientes_id)
)

CREATE TABLE IF NOT EXISTS veterinaria.propietario(
propietario_id bigserial NOT NULL,
apallido_p  varchar(50) NULL,
apallido_m  varchar(50) NULL,
nombre  varchar(50) NULL,
CONSTRAINT PK_propietario PRIMARY KEY(propietario_id)
)

CREATE TABLE IF NOT EXISTS veterinaria.citas(
citas_id bigserial NOT NULL,
medicoid  bigserial NOT NULL,
pacienteid  bigserial NOT NULL,
propietarioid  bigserial NOT NULL,
fecha timestamp NULL,    
CONSTRAINT PK_citaso PRIMARY KEY(citas_id),
      CONSTRAINT fk_medicos
      FOREIGN KEY(medicoid) 
	  REFERENCES veterinaria.medicos(medicos_id),
      CONSTRAINT fk_pacientes
      FOREIGN KEY(pacienteid) 
	  REFERENCES veterinaria.pacientes(pacientes_id),
      CONSTRAINT fk_propietario
      FOREIGN KEY(propietarioid) 
	  REFERENCES veterinaria.propietario(propietario_id)    
)