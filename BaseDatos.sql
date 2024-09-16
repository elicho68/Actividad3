CREATE DATABASE  IF NOT EXISTS `db_actividad3` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db_actividad3`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: db_actividad3
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `docente_persona`
--

DROP TABLE IF EXISTS `docente_persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `docente_persona` (
  `nit` varchar(15) NOT NULL,
  `nombres` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `codigo_docente` varchar(10) DEFAULT NULL,
  `salario` double DEFAULT NULL,
  `fecha_ingreso_laborar` date DEFAULT NULL,
  `fecha_ingreso_registro` datetime DEFAULT NULL,
  PRIMARY KEY (`nit`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `docente_persona`
--

LOCK TABLES `docente_persona` WRITE;
/*!40000 ALTER TABLE `docente_persona` DISABLE KEYS */;
INSERT INTO `docente_persona` VALUES ('385841-1','INGNACIO','OCHOA','VILLA LOBOS 1','2477-1541','2007-04-11','I001',3800,'2024-09-01','2024-09-15 21:46:07'),('385841-8','EDUARDO','MOLINA','CIUDAD','1475-4578','1986-05-15','E003',3500,'2023-12-16','2024-09-15 22:14:50'),('3858416-6','Eli','Ochoa','Calle Falsa 123','4977-8702','1986-08-11','E001',7000,'2023-03-16','2024-09-15 12:51:19'),('458788-4','JOEL','AYALA','ZONA 18','4588-7784','1980-05-15','J001',4000,'2024-01-01','2024-09-16 04:51:06'),('765432-1','LUIS','GOMEZ','CIUDAD','1234-5879','1980-05-01','L001',3800,'2023-07-01','2024-09-16 04:29:19');
/*!40000 ALTER TABLE `docente_persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'db_actividad3'
--

--
-- Dumping routines for database 'db_actividad3'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-15 23:18:57
