-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema libreria
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema libreria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `libreria` DEFAULT CHARACTER SET utf8 ;
USE `libreria` ;

-- -----------------------------------------------------
-- Table `libreria`.`autor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `libreria`.`autor` (
  `idAutor` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idAutor`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `libreria`.`genero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `libreria`.`genero` (
  `idGenero` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idGenero`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `libreria`.`libro`
-- -----------------------------------------------------
DELETE FROM `libreria`.`libro`;

CREATE TABLE IF NOT EXISTS `libreria`.`libro` (
  `idLibro` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `cantidad` INT(10) UNSIGNED NOT NULL,
  `edicion` VARCHAR(45) NOT NULL,
  `lanzamiento` DATE NOT NULL,
  `precio` DOUBLE NOT NULL,
  `idGenero` VARCHAR(45) NOT NULL,
  `idAutor` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idLibro`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

INSERT INTO libro VALUES (0,'Patria',12,'Primera','2008-04-12',21.75,2,1);
INSERT INTO libro VALUES (0,'Mas alla del inviernio',6,'Primera','2011-01-17',21.75,3,2);
INSERT INTO libro VALUES (0,'Escrito  en el agua',3,'Segunda','2013-07-23',12.90,4,4);
INSERT INTO libro VALUES (0,'La magia del orden',7,'Cuarta','2014-04-07',6.75,5,3);
INSERT INTO libro VALUES (0,'Patria: La venganza',1,'Primera','2008-04-23',11.75,1,1);
INSERT INTO libro VALUES (0,'Patria: Tierra de nadie',8,'Segunda','2008-04-12',4.75,1,1);


-- -----------------------------------------------------
-- Table `libreria`.`libro_autor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `libreria`.`libro_autor` (
  `idLibro_Autor` INT(10) UNSIGNED NOT NULL,
  `idAutor_Libro` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`idLibro_Autor`),
  INDEX `FK_libro_autor_2` (`idAutor_Libro` ASC),
  CONSTRAINT `FK_libro_autor_2`
    FOREIGN KEY (`idAutor_Libro`)
    REFERENCES `libreria`.`autor` (`idAutor`),
  CONSTRAINT `FK_libro_autor_1`
    FOREIGN KEY (`idLibro_Autor`)
    REFERENCES `libreria`.`libro` (`idLibro`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `libreria`.`libro_genero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `libreria`.`libro_genero` (
  `idLibro_Genero` INT(10) UNSIGNED NOT NULL,
  `idGenero_Libro` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`idLibro_Genero`),
  INDEX `FK_libro_genero_2` (`idGenero_Libro` ASC),
  CONSTRAINT `FK_libro_genero_2`
    FOREIGN KEY (`idGenero_Libro`)
    REFERENCES `libreria`.`genero` (`idGenero`),
  CONSTRAINT `FK_libro_genero`
    FOREIGN KEY (`idLibro_Genero`)
    REFERENCES `libreria`.`libro` (`idLibro`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `libreria`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `libreria`.`usuario` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
