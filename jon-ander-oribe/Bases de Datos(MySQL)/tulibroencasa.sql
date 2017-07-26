-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.43-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema tulibroencasa
--

CREATE DATABASE IF NOT EXISTS tulibroencasa;
USE tulibroencasa;

--
-- Definition of table `autor`
--

DROP TABLE IF EXISTS `autor`;
CREATE TABLE `autor` (
  `cod_autor` int(5) NOT NULL,
  `nom_autor` varchar(50) NOT NULL,
  PRIMARY KEY (`cod_autor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `autor`
--

/*!40000 ALTER TABLE `autor` DISABLE KEYS */;
INSERT INTO `autor` (`cod_autor`,`nom_autor`) VALUES 
 (1,'Isaac Asimov'),
 (2,'Stephen King'),
 (3,'Orson Scott Card'),
 (4,'Bram Stoker'),
 (5,'Agatha Christie'),
 (6,'Julio Verne'),
 (7,'Edgar Allan Poe');
/*!40000 ALTER TABLE `autor` ENABLE KEYS */;


--
-- Definition of table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
CREATE TABLE `categoria` (
  `cod_categoria` int(5) NOT NULL,
  `nom_categoria` varchar(30) NOT NULL,
  PRIMARY KEY (`cod_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `categoria`
--

/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` (`cod_categoria`,`nom_categoria`) VALUES 
 (1,'Ciencia ficcion'),
 (2,'Terror'),
 (3,'Aventuras'),
 (4,'Suspense');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;


--
-- Definition of table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE `cliente` (
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido1` varchar(30) NOT NULL,
  `apellido2` varchar(30) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `email` varchar(30) NOT NULL,
  `usuario` varchar(8) NOT NULL,
  `password` varchar(8) NOT NULL,
  PRIMARY KEY (`dni`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `usuario` (`usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cliente`
--

/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`dni`,`nombre`,`apellido1`,`apellido2`,`direccion`,`fecha_nacimiento`,`email`,`usuario`,`password`) VALUES 
 ('32658945W','jon','Acedo','Bilbao','Calle del palomino 15','1968-07-19','ionacedo@gmail.com','jonacedo','wen1wen2'),
 ('35773915Z','Ruth','Llorens','Tolosa','Mi casa','1972-04-20','rllorens@serikat.es','ruth1','ruth'),
 ('4','1','2','3','5','1988-07-06','9','10','11'),
 ('44','11','22','33','55','1988-07-06','99','1010','1111'),
 ('444','111','222','333','555','1991-08-03','666','777','888'),
 ('4444','1111','2222','3333','5555','1990-05-02','6666','7777','8888'),
 ('78787878F','mj','izu','rodri','PASEO DDD','1995-01-01','M@GMAIL.COM','usu','usu');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;


--
-- Definition of table `compra`
--

DROP TABLE IF EXISTS `compra`;
CREATE TABLE `compra` (
  `id_compra` int(8) NOT NULL,
  `dni` varchar(9) NOT NULL,
  `fecha_compra` date NOT NULL,
  PRIMARY KEY (`id_compra`),
  KEY `fk_compra_cliente` (`dni`),
  CONSTRAINT `fk_compra_cliente` FOREIGN KEY (`dni`) REFERENCES `cliente` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `compra`
--

/*!40000 ALTER TABLE `compra` DISABLE KEYS */;
/*!40000 ALTER TABLE `compra` ENABLE KEYS */;


--
-- Definition of table `detalles_compra`
--

DROP TABLE IF EXISTS `detalles_compra`;
CREATE TABLE `detalles_compra` (
  `id_compra` int(8) NOT NULL,
  `isbn` varchar(13) NOT NULL,
  `cantidad` int(3) NOT NULL,
  PRIMARY KEY (`id_compra`,`isbn`),
  KEY `fk_detalles_compra_libro` (`isbn`),
  CONSTRAINT `fk_detalles_compra_compra` FOREIGN KEY (`id_compra`) REFERENCES `compra` (`id_compra`),
  CONSTRAINT `fk_detalles_compra_libro` FOREIGN KEY (`isbn`) REFERENCES `libro` (`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detalles_compra`
--

/*!40000 ALTER TABLE `detalles_compra` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalles_compra` ENABLE KEYS */;


--
-- Definition of table `editorial`
--

DROP TABLE IF EXISTS `editorial`;
CREATE TABLE `editorial` (
  `cod_editorial` int(5) NOT NULL,
  `nom_editorial` varchar(50) NOT NULL,
  PRIMARY KEY (`cod_editorial`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `editorial`
--

/*!40000 ALTER TABLE `editorial` DISABLE KEYS */;
INSERT INTO `editorial` (`cod_editorial`,`nom_editorial`) VALUES 
 (1,'Anaya'),
 (2,'Santillana'),
 (3,'Zugarto'),
 (4,'Ediciones S.M.'),
 (5,'Planeta');
/*!40000 ALTER TABLE `editorial` ENABLE KEYS */;


--
-- Definition of table `libro`
--

DROP TABLE IF EXISTS `libro`;
CREATE TABLE `libro` (
  `isbn` varchar(13) NOT NULL,
  `titulo` varchar(30) NOT NULL,
  `cod_autor` int(5) NOT NULL,
  `cod_categoria` int(5) NOT NULL,
  `cod_editorial` int(5) NOT NULL,
  `precio` double(5,2) NOT NULL,
  `stock` int(4) NOT NULL,
  PRIMARY KEY (`isbn`),
  KEY `fk_libro_autor` (`cod_autor`),
  KEY `fk_libro_editorial` (`cod_editorial`),
  KEY `fk_libro_categoria` (`cod_categoria`),
  CONSTRAINT `fk_libro_autor` FOREIGN KEY (`cod_autor`) REFERENCES `autor` (`cod_autor`),
  CONSTRAINT `fk_libro_categoria` FOREIGN KEY (`cod_categoria`) REFERENCES `categoria` (`cod_categoria`),
  CONSTRAINT `fk_libro_editorial` FOREIGN KEY (`cod_editorial`) REFERENCES `editorial` (`cod_editorial`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `libro`
--

/*!40000 ALTER TABLE `libro` DISABLE KEYS */;
INSERT INTO `libro` (`isbn`,`titulo`,`cod_autor`,`cod_categoria`,`cod_editorial`,`precio`,`stock`) VALUES 
 ('1111111111111','Fundacion y Tierra',1,1,5,6.00,5),
 ('1111111111112','Yo Robot',1,1,2,12.00,7),
 ('1111111111113','Los propios dioses',1,1,4,11.00,2),
 ('1111111111114','Nemesis',1,1,2,12.00,10),
 ('1111111111121','It',2,2,4,22.00,11),
 ('1111111111122','Carrie',2,2,5,25.00,1),
 ('1111111111123','Eclipse',2,1,2,31.00,4),
 ('1111111111131','Hijos de la mente',3,1,1,20.00,7),
 ('1111111111132','El juego de Ender',3,1,1,25.00,9),
 ('1111111111133','La voz de los muertos',3,1,2,26.00,8),
 ('1111111111141','Dracula',4,2,2,8.00,8),
 ('1111111111151','Asesinato en Mesopotamia',5,2,1,12.00,22),
 ('1111111111152','Diez negritos',5,4,3,11.00,4),
 ('1111111111153','El club de los martes',5,4,4,9.00,3),
 ('1111111111161','Un viaje a la luna',6,1,1,14.00,2),
 ('1111111111162','Viaje al centro de la tierra',6,1,3,11.00,4),
 ('1111111111163','La isla misteriosa',6,3,4,13.00,3),
 ('1111111111164','Cinco semanas en globo',6,3,5,17.00,8),
 ('1111111111165','Miguel Strogoff',6,3,5,17.00,15),
 ('1111111111166','Un capitan de quince',6,3,5,6.00,21),
 ('1111111111171','El escarabajo de oro',7,4,2,11.00,12),
 ('1111111111172','La carta robada',7,3,1,21.00,2);
/*!40000 ALTER TABLE `libro` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;