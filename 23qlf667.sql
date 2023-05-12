-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mar. 09 mai 2023 à 09:11
-- Version du serveur : 5.7.31
-- Version de PHP : 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `23qlf667`
--

-- --------------------------------------------------------

--
-- Structure de la table `caserne`
--

DROP TABLE IF EXISTS `caserne`;
CREATE TABLE IF NOT EXISTS `caserne` (
  `CAS_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CAS_NOM` char(32) DEFAULT NULL,
  `CAS_ADRESSE` char(32) DEFAULT NULL,
  `CAS_VILLE` char(32) DEFAULT NULL,
  `CAS_CP` char(32) DEFAULT NULL,
  PRIMARY KEY (`CAS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `caserne`
--

INSERT INTO `caserne` (`CAS_NOM`, `CAS_ADRESSE`, `CAS_VILLE`, `CAS_CP`) VALUES
('SDIS 14', '25 Bd Maréchal Juin', 'Caen', '14000'),
('Sapeur Pompiers PA', 'Rue du 8 Mai 1945', 'Pont-Audemer', ' 27500'),
('Caserne Pompier B', '74 Rue Saint-Patrice', 'Bayeux', '14400');

-- --------------------------------------------------------

--
-- Structure de la table `engin`
--

DROP TABLE IF EXISTS `engin`;
CREATE TABLE IF NOT EXISTS `engin` (
  `ENG_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ENG_CODE` char(32) NOT NULL,
  `ENG_ID_POSSEDE` int(11) NOT NULL,
  `ENG_NUMEROODRE` int(11) DEFAULT NULL,
  PRIMARY KEY (`ENG_ID`),
  KEY `I_FK_ENGIN_TYPEENGIN` (`ENG_CODE`),
  KEY `I_FK_ENGIN_CASERNE` (`ENG_ID_POSSEDE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `engin`
--

INSERT INTO `engin` (`ENG_CODE`, `ENG_ID_POSSEDE`, `ENG_NUMEROODRE`) VALUES
('EPA', 3, 1),
('FPT', 1, 2),
('VSAV', 2, 3);

-- --------------------------------------------------------

--
-- Structure de la table `fonction`
--

DROP TABLE IF EXISTS `fonction`;
CREATE TABLE IF NOT EXISTS `fonction` (
  `FON_CODE` char(32) NOT NULL,
  `FON_LIBELLE` char(32) DEFAULT NULL,
  PRIMARY KEY (`FON_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `fonction`
--

INSERT INTO `fonction` (`FON_CODE`, `FON_LIBELLE`) VALUES
('AC', 'accidents circulation'),
('FF', 'feux de forêt'),
('SDP', 'Secours urgent personnes');

-- --------------------------------------------------------

--
-- Structure de la table `grade`
--

DROP TABLE IF EXISTS `grade`;
CREATE TABLE IF NOT EXISTS `grade` (
  `GRA_CODE` char(32) NOT NULL,
  `GRA_LIBELLE` char(32) DEFAULT NULL,
  PRIMARY KEY (`GRA_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `grade`
--

INSERT INTO `grade` (`GRA_CODE`, `GRA_LIBELLE`) VALUES
('AE', 'Auxiliaire'),
('AT', 'Adjudant'),
('ATC', 'Adjudant-Chef'),
('CCHC', 'Colonel/Hors classe'),
('CE', 'Capitaine'),
('CG', 'Contrôleur Général'),
('CG1', 'ContrôleurGénéral(investi Etat)'),
('CL', 'Caporal'),
('CLC', 'Caporal-Chef'),
('CT', 'Commandant'),
('LT', 'Lieutenant'),
('LTC', 'Lieutenant-Colonel'),
('S1C', 'Sapeur 1ème classe'),
('S2C', 'Sapeur 2ème classe'),
('ST', 'Sergent'),
('STC', 'Sergent-Chef');

-- --------------------------------------------------------

--
-- Structure de la table `intervention`
--

DROP TABLE IF EXISTS `intervention`;
CREATE TABLE IF NOT EXISTS `intervention` (
  `INT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `INT_ID_DISPOSE` int(11) NOT NULL,
  `INT_DATE` char(32) DEFAULT NULL,
  `INT_LIEU` char(32) DEFAULT NULL,
  `INT_HEUREAPPEL` time DEFAULT NULL,
  `INT_HEUREARRIVE` time DEFAULT NULL,
  `INT_DUREE` time DEFAULT NULL,
  PRIMARY KEY (`INT_ID`),
  KEY `I_FK_INTERVENTION_SITUATION` (`INT_ID_DISPOSE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `intervient`
--

DROP TABLE IF EXISTS `intervient`;
CREATE TABLE IF NOT EXISTS `intervient` (
  `IN_ID` int(11) NOT NULL ,
  `IN_ID_1` int(11) NOT NULL ,
  PRIMARY KEY (`IN_ID`,`IN_ID_1`),
  KEY `I_FK_INTERVIENT_POMPIER` (`IN_ID`),
  KEY `I_FK_INTERVIENT_INTERVENTION` (`IN_ID_1`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `mobilise`
--

DROP TABLE IF EXISTS `mobilise`;
CREATE TABLE IF NOT EXISTS `mobilise` (
  `MOB_ID` int(11) NOT NULL ,
  `MOB_ID_1` int(11) NOT NULL ,
  PRIMARY KEY (`MOB_ID`,`MOB_ID_1`),
  KEY `I_FK_MOBILISE_SITUATION` (`MOB_ID`),
  KEY `I_FK_MOBILISE_ENGIN` (`MOB_ID_1`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `pompier`
--

DROP TABLE IF EXISTS `pompier`;
CREATE TABLE IF NOT EXISTS `pompier` (
  `POM_ID` int(11) NOT NULL AUTO_INCREMENT,
  `POM_ID_ASSIGNIE` int(11) NOT NULL,
  `POM_CODE` char(32) NOT NULL,
  `POM_CODE_OCCUPE` char(32) NOT NULL,
  `POM_ID_SOUSLARESPONSABILITE` int(11) DEFAULT NULL,
  `POM_NOM` char(32) DEFAULT NULL,
  `POM_PRENOM` char(32) DEFAULT NULL,
  `POM_DATENAISSANCE` char(32) DEFAULT NULL,
  `POM_NUMEROBIP` char(32) DEFAULT NULL,
  `POM_USERNAME` varchar(32) NOT NULL,
  `POM_MDP` varchar(32) NOT NULL,
  PRIMARY KEY (`POM_ID`),
  KEY `I_FK_POMPIER_CASERNE` (`POM_ID_ASSIGNIE`),
  KEY `I_FK_POMPIER_FONCTION` (`POM_CODE`),
  KEY `I_FK_POMPIER_GRADE` (`POM_CODE_OCCUPE`),
  KEY `I_FK_POMPIER_POMPIER` (`POM_ID_SOUSLARESPONSABILITE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `pompier`
--

INSERT INTO `pompier` (`POM_ID_ASSIGNIE`, `POM_CODE`, `POM_CODE_OCCUPE`, `POM_ID_SOUSLARESPONSABILITE`, `POM_NOM`, `POM_PRENOM`, `POM_DATENAISSANCE`, `POM_NUMEROBIP`, `POM_USERNAME`, `POM_MDP`) VALUES
(2, 'FF', 'ATC', NULL, 'Iffam', 'Annaïs', '2004-09-17', '541A', 'annais', 'mpannais'),
(3, 'SDP', 'LTC', 1, 'Lefevre', 'Blanche', '2000-03-31', 'D54L', '', ''),
(1, 'AC', 'CE', NULL, 'Thomas', 'Philipe', '2003-03-04', '68M', '', '');

-- --------------------------------------------------------

--
-- Structure de la table `profession`
--

DROP TABLE IF EXISTS `profession`;
CREATE TABLE IF NOT EXISTS `profession` (
  `PRO_CODE` char(32) NOT NULL,
  `PRO_LIBELLE` char(32) DEFAULT NULL,
  `PRO_VILLE` char(32) DEFAULT NULL,
  PRIMARY KEY (`PRO_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `professionnel`
--

DROP TABLE IF EXISTS `professionnel`;
CREATE TABLE IF NOT EXISTS `professionnel` (
  `PROF_ID` int(11) NOT NULL AUTO_INCREMENT,
  `PROF_INDICETRAITEMENT` char(32) DEFAULT NULL,
  `PROF_DATEOBTENTIONINDICE` char(32) DEFAULT NULL,
  `PROF_NOM` char(32) DEFAULT NULL,
  `PROF_PRENOM` char(32) DEFAULT NULL,
  `PROF_DATENAISSANCE` char(32) DEFAULT NULL,
  `PROF_NUMEROBIP` char(32) DEFAULT NULL,
  PRIMARY KEY (`PROF_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `professionnel`
--

INSERT INTO `professionnel` (`PROF_INDICETRAITEMENT`, `PROF_DATEOBTENTIONINDICE`, `PROF_NOM`, `PROF_PRENOM`, `PROF_DATENAISSANCE`, `PROF_NUMEROBIP`) VALUES
('INDICETRAITEMENT', '2023-05-01', 'Iffam', 'Annaïs', '2004-09-17', '541A');

-- --------------------------------------------------------

--
-- Structure de la table `situation`
--

DROP TABLE IF EXISTS `situation`;
CREATE TABLE IF NOT EXISTS `situation` (
  `SIT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `SIT_LIBELLE` char(32) DEFAULT NULL,
  PRIMARY KEY (`SIT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `situation`
--

INSERT INTO `situation`( `SIT_LIBELLE`) VALUES 
('noyade'),
('incendie'),
('accident vehicule'),
('secour a la personne');
-- --------------------------------------------------------

--
-- Structure de la table `typeengin`
--

DROP TABLE IF EXISTS `typeengin`;
CREATE TABLE IF NOT EXISTS `typeengin` (
  `TYP_CODE` char(32) NOT NULL,
  `TYP_LIBELLE` char(32) DEFAULT NULL,
  PRIMARY KEY (`TYP_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `typeengin`
--

INSERT INTO `typeengin` (`TYP_CODE`, `TYP_LIBELLE`) VALUES
('EPA', 'échelle pivotante automatique'),
('FPT', 'fourgon pompe-tonne'),
('VSAV', 'véhicule assistance victimes');

-- --------------------------------------------------------

--
-- Structure de la table `volontaire`
--

DROP TABLE IF EXISTS `volontaire`;
CREATE TABLE IF NOT EXISTS `volontaire` (
  `VOL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `VOL_CODE` char(32) DEFAULT NULL,
  `VOL_ENACTIVITE` tinyint(1) DEFAULT NULL,
  `VOL_NOM` char(32) DEFAULT NULL,
  `VOL_PRENOM` char(32) DEFAULT NULL,
  `VOL_DATENAISSANCE` char(32) DEFAULT NULL,
  `VOL_NUMEROBIP` char(32) DEFAULT NULL,
  PRIMARY KEY (`VOL_ID`),
  KEY `I_FK_VOLONTAIRE_PROFESSION` (`VOL_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `engin`
--
ALTER TABLE `engin`
  ADD CONSTRAINT `ENGIN_ibfk1` FOREIGN KEY (`ENG_CODE`) REFERENCES `typeengin` (`TYP_CODE`),
  ADD CONSTRAINT `ENGIN_ibfk2` FOREIGN KEY (`ENG_ID_POSSEDE`) REFERENCES `caserne` (`CAS_ID`),
  ADD CONSTRAINT `ENGIN_ibfk_1` FOREIGN KEY (`ENG_CODE`) REFERENCES `typeengin` (`TYP_CODE`),
  ADD CONSTRAINT `ENGIN_ibfk_2` FOREIGN KEY (`ENG_ID_POSSEDE`) REFERENCES `caserne` (`CAS_ID`);

--
-- Contraintes pour la table `intervention`
--
ALTER TABLE `intervention`
  ADD CONSTRAINT `INTERVENTION_ibfk` FOREIGN KEY (`INT_ID_DISPOSE`) REFERENCES `situation` (`SIT_ID`),
  ADD CONSTRAINT `INTERVENTION_ibfk_1` FOREIGN KEY (`INT_ID_DISPOSE`) REFERENCES `situation` (`SIT_ID`);

--
-- Contraintes pour la table `intervient`
--
ALTER TABLE `intervient`
  ADD CONSTRAINT `INTERVIENT_ibfk1` FOREIGN KEY (`IN_ID`) REFERENCES `pompier` (`POM_ID`),
  ADD CONSTRAINT `INTERVIENT_ibfk2` FOREIGN KEY (`IN_ID_1`) REFERENCES `intervention` (`INT_ID`);

--
-- Contraintes pour la table `mobilise`
--
ALTER TABLE `mobilise`
  ADD CONSTRAINT `MOBILISE_ibfk1` FOREIGN KEY (`MOB_ID`) REFERENCES `situation` (`SIT_ID`),
  ADD CONSTRAINT `MOBILISE_ibfk2` FOREIGN KEY (`MOB_ID_1`) REFERENCES `engin` (`ENG_ID`);

--
-- Contraintes pour la table `pompier`
--
ALTER TABLE `pompier`
  ADD CONSTRAINT `POMPIER_ibfk_1` FOREIGN KEY (`POM_ID_ASSIGNIE`) REFERENCES `caserne` (`CAS_ID`),
  ADD CONSTRAINT `POMPIER_ibfk_2` FOREIGN KEY (`POM_CODE`) REFERENCES `fonction` (`FON_CODE`),
  ADD CONSTRAINT `POMPIER_ibfk_3` FOREIGN KEY (`POM_CODE_OCCUPE`) REFERENCES `grade` (`GRA_CODE`),
  ADD CONSTRAINT `POMPIER_ibfk_4` FOREIGN KEY (`POM_ID_SOUSLARESPONSABILITE`) REFERENCES `pompier` (`POM_ID`);

--
-- Contraintes pour la table `professionnel`
--
ALTER TABLE `professionnel`
  ADD CONSTRAINT `PROFESSIONNEL_ibfk1` FOREIGN KEY (`PROF_ID`) REFERENCES `pompier` (`POM_ID`);

--
-- Contraintes pour la table `volontaire`
--
ALTER TABLE `volontaire`
  ADD CONSTRAINT `VOLONTAIRE_ibfk1` FOREIGN KEY (`VOL_CODE`) REFERENCES `profession` (`PRO_CODE`),
  ADD CONSTRAINT `VOLONTAIRE_ibfk2` FOREIGN KEY (`VOL_ID`) REFERENCES `pompier` (`POM_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
