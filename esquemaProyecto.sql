CREATE DATABASE  IF NOT EXISTS `proyecto_inventario` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `proyecto_inventario`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: br-cdbr-azure-south-b.cloudapp.net    Database: proyecto_inventario
-- ------------------------------------------------------
-- Server version	5.5.45-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `idclientes` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idclientes`),
  UNIQUE KEY `idclientes_UNIQUE` (`idclientes`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'0921157301','Pedro','Rivera','sur','457866'),(11,'1','test','test','test','12'),(21,'2','sd','sd','sd','21');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compracabecera`
--

DROP TABLE IF EXISTS `compracabecera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `compracabecera` (
  `idcompracabecera` int(11) NOT NULL,
  `codigo` varchar(45) NOT NULL,
  `proveedor` varchar(45) DEFAULT NULL,
  `estado` varchar(45) NOT NULL,
  `fecha` datetime NOT NULL,
  `subtotal` varchar(45) DEFAULT NULL,
  `iva` varchar(45) DEFAULT NULL,
  `total` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcompracabecera`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compracabecera`
--

LOCK TABLES `compracabecera` WRITE;
/*!40000 ALTER TABLE `compracabecera` DISABLE KEYS */;
/*!40000 ALTER TABLE `compracabecera` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compradetalle`
--

DROP TABLE IF EXISTS `compradetalle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `compradetalle` (
  `idcompradetalle` int(11) NOT NULL AUTO_INCREMENT,
  `codigofactura` varchar(45) NOT NULL,
  `codigoproducto` varchar(45) DEFAULT NULL,
  `cantidad` varchar(45) DEFAULT NULL,
  `costounitario` varchar(45) DEFAULT NULL,
  `total` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcompradetalle`),
  UNIQUE KEY `idcompradetalle_UNIQUE` (`idcompradetalle`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compradetalle`
--

LOCK TABLES `compradetalle` WRITE;
/*!40000 ALTER TABLE `compradetalle` DISABLE KEYS */;
INSERT INTO `compradetalle` VALUES (1,'123','12','1',NULL,NULL),(11,'123','12','1',NULL,NULL),(21,'5','6','123456',NULL,NULL),(31,'6','6','123456',NULL,NULL),(41,'6','6','123456',NULL,NULL),(51,'5','5','123456',NULL,NULL);
/*!40000 ALTER TABLE `compradetalle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `fecha_caducidad` datetime DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` varchar(45) DEFAULT NULL,
  `Iva` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=91 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (71,12345670,'agua','cielo','2017-02-04 00:00:00',45,'0.4','0.0'),(81,43561230,'jugo','deli','2017-02-04 00:00:00',25,'1.5','0.14');
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proveedor` (
  `idproveedor` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(45) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `producto` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idproveedor`),
  UNIQUE KEY `idproveedor_UNIQUE` (`idproveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES (1,'12354','arca','cocacola, aguas','juan tanka marengo','457866');
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `Usuario` varchar(45) NOT NULL,
  `clave` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL,
  `rol` varchar(45) NOT NULL,
  PRIMARY KEY (`Usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES ('admin','827ccb0eea8a706c4c34a16891f84e7b','activo','administrador'),('parivera','113a7f0c601f3d56b2cf4c9cca5ce636','Activo','Administrador');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventascabecera`
--

DROP TABLE IF EXISTS `ventascabecera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ventascabecera` (
  `idventas` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(45) NOT NULL,
  `idcliente` varchar(45) DEFAULT NULL,
  `fecha` datetime NOT NULL,
  `estado` varchar(45) NOT NULL,
  `subtotal` varchar(45) DEFAULT NULL,
  `iva` varchar(45) DEFAULT NULL,
  `total` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idventas`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventascabecera`
--

LOCK TABLES `ventascabecera` WRITE;
/*!40000 ALTER TABLE `ventascabecera` DISABLE KEYS */;
INSERT INTO `ventascabecera` VALUES (1,'1234',NULL,'2017-02-03 00:00:00','anulada',NULL,NULL,NULL),(11,'1','1231','2017-02-04 00:00:00','Efectiva','11.4','1.2600000000000002','12.66');
/*!40000 ALTER TABLE `ventascabecera` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventasdetalle`
--

DROP TABLE IF EXISTS `ventasdetalle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ventasdetalle` (
  `idventasdetalle` int(11) NOT NULL AUTO_INCREMENT,
  `codigofactura` varchar(45) NOT NULL,
  `codigoproducto` varchar(45) NOT NULL,
  `cantidad` varchar(45) NOT NULL,
  `costounitario` varchar(45) DEFAULT NULL,
  `total` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idventasdetalle`),
  UNIQUE KEY `idventasdetalle_UNIQUE` (`idventasdetalle`)
) ENGINE=InnoDB AUTO_INCREMENT=181 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventasdetalle`
--

LOCK TABLES `ventasdetalle` WRITE;
/*!40000 ALTER TABLE `ventasdetalle` DISABLE KEYS */;
INSERT INTO `ventasdetalle` VALUES (1,'123','12','1',NULL,NULL),(11,'123','12','1',NULL,NULL),(61,'5','6','123456',NULL,NULL),(71,'25','25','7862110540127',NULL,NULL),(151,'1','12345670','6',NULL,NULL),(171,'1','43561230','6',NULL,NULL);
/*!40000 ALTER TABLE `ventasdetalle` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-02-06 15:21:51
