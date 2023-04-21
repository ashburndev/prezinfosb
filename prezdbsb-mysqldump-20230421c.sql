-- MySQL dump 10.13  Distrib 8.0.32, for Linux (x86_64)
--
-- Host: localhost    Database: prezdbsb
-- ------------------------------------------------------
-- Server version	8.0.32-0ubuntu0.22.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `election`
--

DROP TABLE IF EXISTS `election`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `election` (
  `id` int NOT NULL,
  `created_at` datetime(6) NOT NULL,
  `election_date` datetime(6) DEFAULT NULL,
  `incumb_won_election` bit(1) DEFAULT NULL,
  `modified_at` datetime(6) DEFAULT NULL,
  `percent_winner_electoral_vote` float DEFAULT NULL,
  `percent_winner_popular_vote` double DEFAULT NULL,
  `total_electoral_vote` int DEFAULT NULL,
  `total_popular_vote` int DEFAULT NULL,
  `winner_electoral_vote` int DEFAULT NULL,
  `winner_popular_vote` int DEFAULT NULL,
  `zzz_big_decimal_value` decimal(38,2) DEFAULT NULL,
  `zzz_big_integer_value` decimal(38,0) DEFAULT NULL,
  `zzz_byte_value` tinyint DEFAULT NULL,
  `zzz_character_value` char(1) DEFAULT NULL,
  `zzz_short_value` smallint DEFAULT NULL,
  `president_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKof13dcj45tg3ts9hbp4hf5tov` (`president_id`),
  CONSTRAINT `FKof13dcj45tg3ts9hbp4hf5tov` FOREIGN KEY (`president_id`) REFERENCES `president` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `election`
--

LOCK TABLES `election` WRITE;
/*!40000 ALTER TABLE `election` DISABLE KEYS */;
INSERT INTO `election` VALUES (40,'2023-04-20 07:58:17.924000','1980-11-04 00:00:00.000000',_binary '\0',NULL,0.908922,0.5074950456619263,538,86509678,489,43903230,NULL,NULL,NULL,NULL,NULL,39),(41,'2023-04-20 07:58:17.924000','1984-11-06 00:00:00.000000',_binary '',NULL,0.975836,0.5877341628074646,538,92653233,525,54455472,NULL,NULL,NULL,NULL,NULL,39);
/*!40000 ALTER TABLE `election` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (50);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `president`
--

DROP TABLE IF EXISTS `president`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `president` (
  `id` int NOT NULL,
  `created_at` datetime(6) NOT NULL,
  `first_inaug_address` text,
  `first_inaug_date` datetime(6) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `middle_name` varchar(255) DEFAULT NULL,
  `modified_at` datetime(6) DEFAULT NULL,
  `political_party` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `president`
--

LOCK TABLES `president` WRITE;
/*!40000 ALTER TABLE `president` DISABLE KEYS */;
INSERT INTO `president` VALUES (1,'2023-04-20 07:58:17.724000',NULL,NULL,'George','Washington','',NULL,'Unaffiliated'),(2,'2023-04-20 07:58:17.751000',NULL,NULL,'John','Adams','',NULL,'Federalist'),(3,'2023-04-20 07:58:17.757000',NULL,NULL,'Thomas','Jefferson','',NULL,'Democratic-Republican'),(4,'2023-04-20 07:58:17.763000',NULL,NULL,'James','Madison','',NULL,'Democratic-Republican'),(5,'2023-04-20 07:58:17.767000',NULL,NULL,'James','Monroe','',NULL,'Democratic-Republican'),(6,'2023-04-20 07:58:17.772000',NULL,NULL,'John','Adams','Quincy',NULL,'Democratic-Republican'),(7,'2023-04-20 07:58:17.777000',NULL,NULL,'Andrew','Jackson','',NULL,'Democratic'),(8,'2023-04-20 07:58:17.784000',NULL,NULL,'Martin','Van Buren','',NULL,'Democratic'),(9,'2023-04-20 07:58:17.790000',NULL,NULL,'William','Harrison','Henry',NULL,'Whig'),(10,'2023-04-20 07:58:17.794000',NULL,NULL,'John','Tyler','',NULL,'Whig'),(11,'2023-04-20 07:58:17.798000',NULL,NULL,'James','Polk','K',NULL,'Democratic'),(12,'2023-04-20 07:58:17.804000',NULL,NULL,'Zachary','Taylor','',NULL,'Whig'),(13,'2023-04-20 07:58:17.809000',NULL,NULL,'Millard','Fillmore','',NULL,'Whig'),(14,'2023-04-20 07:58:17.815000',NULL,NULL,'Franklin','Pierce','',NULL,'Democratic'),(15,'2023-04-20 07:58:17.820000',NULL,NULL,'James','Buchanan','',NULL,'Democratic'),(16,'2023-04-20 07:58:17.825000',NULL,NULL,'Abraham','Lincoln','',NULL,'Republican'),(17,'2023-04-20 07:58:17.830000',NULL,NULL,'Andrew','Johnson','',NULL,'Democratic'),(18,'2023-04-20 07:58:17.834000',NULL,NULL,'Ulysses','Grant','S.',NULL,'Republican'),(19,'2023-04-20 07:58:17.838000',NULL,NULL,'Rutherford','Hayes','B.',NULL,'Republican'),(20,'2023-04-20 07:58:17.843000',NULL,NULL,'James','Garfield','A.',NULL,'Republican'),(21,'2023-04-20 07:58:17.846000',NULL,NULL,'Chester','Arthur','A.',NULL,'Republican'),(22,'2023-04-20 07:58:17.851000',NULL,NULL,'Grover','Cleveland','',NULL,'Democratic'),(23,'2023-04-20 07:58:17.855000',NULL,NULL,'Benjamin','Harrison','',NULL,'Republican'),(24,'2023-04-20 07:58:17.860000',NULL,NULL,'William','McKinley','',NULL,'Republican'),(25,'2023-04-20 07:58:17.864000',NULL,NULL,'Theodore','Roosevelt','',NULL,'Republican'),(26,'2023-04-20 07:58:17.868000',NULL,NULL,'William','Taft','Howard',NULL,'Republican'),(27,'2023-04-20 07:58:17.872000',NULL,NULL,'Woodrow','Wilson','',NULL,'Democratic'),(28,'2023-04-20 07:58:17.876000',NULL,NULL,'Warren','Harding','G.',NULL,'Republican'),(29,'2023-04-20 07:58:17.880000',NULL,NULL,'Calvin','Coolidge','',NULL,'Republican'),(30,'2023-04-20 07:58:17.885000',NULL,NULL,'Herbert','Hoover','',NULL,'Republican'),(31,'2023-04-20 07:58:17.891000',NULL,NULL,'Franklin','Roosevelt','D.',NULL,'Democratic'),(32,'2023-04-20 07:58:17.896000',NULL,NULL,'Harry','Truman','S.',NULL,'Democratic'),(33,'2023-04-20 07:58:17.900000',NULL,NULL,'Dwight','Eisenhower','D.',NULL,'Republican'),(34,'2023-04-20 07:58:17.904000',NULL,NULL,'John','Kennedy','F.',NULL,'Democratic'),(35,'2023-04-20 07:58:17.908000',NULL,NULL,'Lyndon','Johnson','B.',NULL,'Democratic'),(36,'2023-04-20 07:58:17.912000',NULL,NULL,'Richard','Nixon','',NULL,'Republican'),(37,'2023-04-20 07:58:17.916000',NULL,NULL,'Gerald','Ford','',NULL,'Republican'),(38,'2023-04-20 07:58:17.919000',NULL,NULL,'Jimmy','Carter','',NULL,'Democratic'),(39,'2023-04-20 07:58:17.924000',NULL,NULL,'Ronald','Reagan','',NULL,'Republican'),(44,'2023-04-20 07:58:17.945000',NULL,NULL,'George','Bush','H. W.',NULL,'Republican'),(45,'2023-04-20 07:58:17.949000',NULL,NULL,'Bill','Clinton','',NULL,'Democratic'),(46,'2023-04-20 07:58:17.958000',NULL,NULL,'George','Bush','W.',NULL,'Republican'),(47,'2023-04-20 07:58:17.962000',NULL,NULL,'Barack','Obama','',NULL,'Democratic'),(48,'2023-04-20 07:58:17.967000',NULL,NULL,'Donald','Trump','',NULL,'Republican'),(49,'2023-04-20 07:58:17.971000',NULL,NULL,'Joe','Biden','',NULL,'Democratic');
/*!40000 ALTER TABLE `president` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `term`
--

DROP TABLE IF EXISTS `term`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `term` (
  `id` int NOT NULL,
  `beg_date` datetime(6) DEFAULT NULL,
  `created_at` datetime(6) NOT NULL,
  `end_date` datetime(6) DEFAULT NULL,
  `modified_at` datetime(6) DEFAULT NULL,
  `president_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKpf6yamjv0il3h8kne9r2r35tq` (`president_id`),
  CONSTRAINT `FKpf6yamjv0il3h8kne9r2r35tq` FOREIGN KEY (`president_id`) REFERENCES `president` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `term`
--

LOCK TABLES `term` WRITE;
/*!40000 ALTER TABLE `term` DISABLE KEYS */;
INSERT INTO `term` VALUES (42,'1981-01-20 00:00:00.000000','2023-04-20 07:58:17.924000','1985-01-20 00:00:00.000000',NULL,39),(43,'1985-01-20 00:00:00.000000','2023-04-20 07:58:17.924000','1989-01-20 00:00:00.000000',NULL,39);
/*!40000 ALTER TABLE `term` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-21  5:56:54
