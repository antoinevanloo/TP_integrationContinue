CREATE TABLE `tporm`.`type_utilisateur` (
 `id_type` INT NOT NULL AUTO_INCREMENT,
 `libelle` VARCHAR(255) NOT NULL,
 PRIMARY KEY (`id_type`)
 );
 
 CREATE TABLE `tporm`.`contrat` (
 `id_contrat` INT NOT NULL AUTO_INCREMENT,
 `marge` float NOT NULL,
 PRIMARY KEY (id_contrat)
 );
 
 CREATE TABLE `tporm`.`utilisateur` (
 `id_utilisateur` INT NOT NULL AUTO_INCREMENT,
 `mdp` VARCHAR(255) NOT NULL,
 `nom_user` VARCHAR(255) NOT NULL,
 `prenom_user` VARCHAR(255) NOT NULL,
 `id_type_utilisateur` int not null,
 PRIMARY KEY (id_utilisateur),
  FOREIGN KEY (`id_type_utilisateur`) REFERENCES type_utilisateur(`id_type`)
 );
 
  CREATE TABLE `tporm`.`article` (
 `id_article` INT NOT NULL AUTO_INCREMENT,
 `nom_article` VARCHAR(255) NOT NULL,
 `coutfabrication` float NOT NULL,
 PRIMARY KEY (marge)
 );