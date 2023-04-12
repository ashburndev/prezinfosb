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
  `id` bigint NOT NULL,
  `election_date` datetime(6) DEFAULT NULL,
  `incumb_won_election` bit(1) DEFAULT NULL,
  `percent_winner_electoral_vote` float DEFAULT NULL,
  `percent_winner_popular_vote` double DEFAULT NULL,
  `somebdvalue` decimal(38,2) DEFAULT NULL,
  `somebivalue` decimal(38,0) DEFAULT NULL,
  `total_electoral_vote` int DEFAULT NULL,
  `total_popular_vote` bigint DEFAULT NULL,
  `winner_electoral_vote` int DEFAULT NULL,
  `winner_popular_vote` bigint DEFAULT NULL,
  `president_id` bigint DEFAULT NULL,
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
INSERT INTO `election` VALUES (1,'2023-04-11 07:53:23.807000',_binary '\0',NULL,NULL,NULL,NULL,538,86509678,489,43903230,19),(2,'2023-04-11 07:53:23.807000',_binary '',NULL,NULL,NULL,NULL,538,92653233,525,54455472,19);
/*!40000 ALTER TABLE `election` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `election_seq`
--

DROP TABLE IF EXISTS `election_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `election_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `election_seq`
--

LOCK TABLES `election_seq` WRITE;
/*!40000 ALTER TABLE `election_seq` DISABLE KEYS */;
INSERT INTO `election_seq` VALUES (101);
/*!40000 ALTER TABLE `election_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `president`
--

DROP TABLE IF EXISTS `president`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `president` (
  `id` bigint NOT NULL,
  `first_inaug_address` text,
  `first_inaug_date` datetime(6) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `middle_name` varchar(255) DEFAULT NULL,
  `political_party` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `president`
--

LOCK TABLES `president` WRITE;
/*!40000 ALTER TABLE `president` DISABLE KEYS */;
INSERT INTO `president` VALUES (1,NULL,NULL,'George','Washington','','Unaffiliated'),(2,NULL,NULL,'John','Adams','','Federalist'),(3,NULL,NULL,'Thomas','Jefferson','','Democratic-Republican'),(4,NULL,NULL,'Abraham','Lincoln','','Republican'),(5,NULL,NULL,'Theodore','Roosevelt','','Republican'),(6,NULL,NULL,'William','Taft','Howard','Republican'),(7,NULL,NULL,'Woodrow','Wilson','','Democratic'),(8,NULL,NULL,'Warren','Harding','G.','Republican'),(9,NULL,NULL,'Calvin','Coolidge','','Republican'),(10,NULL,NULL,'Herbert','Hoover','','Republican'),(11,NULL,NULL,'Franklin','Roosevelt','D.','Democratic'),(12,NULL,NULL,'Harry','Truman','S.','Democratic'),(13,NULL,NULL,'Dwight','Eisenhower','D.','Republican'),(14,NULL,NULL,'John','Kennedy','F.','Democratic'),(15,NULL,NULL,'Lyndon','Johnson','B.','Democratic'),(16,NULL,NULL,'Richard','Nixon','','Republican'),(17,NULL,NULL,'Gerald','Ford','','Republican'),(18,NULL,NULL,'Jimmy','Carter','','Democratic'),(19,NULL,NULL,'Ronald','Reagan','','Republican'),(20,NULL,NULL,'George','Bush','H. W.','Republican'),(21,NULL,NULL,'Bill','Clinton','','Democratic'),(22,NULL,NULL,'George','Bush','W.','Republican'),(23,NULL,NULL,'Barack','Obama','','Democratic'),(24,NULL,NULL,'Donald','Trump','','Republican'),(25,NULL,NULL,'Joe','Biden','','Democratic');
/*!40000 ALTER TABLE `president` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `president_seq`
--

DROP TABLE IF EXISTS `president_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `president_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `president_seq`
--

LOCK TABLES `president_seq` WRITE;
/*!40000 ALTER TABLE `president_seq` DISABLE KEYS */;
INSERT INTO `president_seq` VALUES (101);
/*!40000 ALTER TABLE `president_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `term`
--

DROP TABLE IF EXISTS `term`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `term` (
  `id` bigint NOT NULL,
  `beg_date` datetime(6) DEFAULT NULL,
  `end_date` datetime(6) DEFAULT NULL,
  `president_id` bigint DEFAULT NULL,
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
/*!40000 ALTER TABLE `term` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `term_seq`
--

DROP TABLE IF EXISTS `term_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `term_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `term_seq`
--

LOCK TABLES `term_seq` WRITE;
/*!40000 ALTER TABLE `term_seq` DISABLE KEYS */;
INSERT INTO `term_seq` VALUES (1);
/*!40000 ALTER TABLE `term_seq` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-11  8:02:36
