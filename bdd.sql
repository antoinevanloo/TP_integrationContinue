CREATE DATABASE melinda;
use melinda;
CREATE TABLE type_utilisateur(id_utilisateur INT NOT NULL AUTO_INCREMENT,role VARCHAR(250) NOT NULL,
CONSTRAINT pk_id_utilisateur PRIMARY KEY (id_utilisateur));


CREATE TABLE utilisateur(id_user INT NOT NULL AUTO_INCREMENT,
                         mdp VARCHAR(250) NOT NULL,
                         nom_client VARCHAR(250) NOT NULL,
                         prenom_client VARCHAR(250) NOT NULL,
                         contrat_id INT NOT NULL,
                         type_utilisateur_id INT NOT NULL,
                         CONSTRAINT pk_id_client PRIMARY KEY (id_user),
                         CONSTRAINT fk_contrat_id FOREIGN KEY (contrat_id) REFERENCES contrat(id_contrat),
                         CONSTRAINT fk_type_utilisateur_id FOREIGN KEY (type_utilisateur_id) REFERENCES type_utilisateur(id_utilisateur)
                        );

CREATE TABLE contrat(id_contrat INT NOT NULL AUTO_INCREMENT,marge FLOAT(3,2) NOT NULL,CONSTRAINT pk_id_contrat PRIMARY KEY (id_contrat));

insert into contrat(id_contrat,marge) VALUES (1,2.5);
insert into contrat(id_contrat,marge) VALUES (2,0.5);

CREATE TABLE article(id_article INT NOT NULL AUTO_INCREMENT,nom_article VARCHAR(250) NOT NULL,cout_fabrication FLOAT(10,7) NOT NULL,
CONSTRAINT pk_id_articlePRIMARY KEY (id_article));

 INSERT INTO `type_utilisateur` (`id_utilisateur`, `role`) 
 VALUES ('1', 'admin'), ('2', 'auteur');

INSERT INTO utilisateur (`id_user`,mdp,nom_client,prenom_client,`contrat_id`,`type_utilisateur_id`) VALUES(1,"motdepasse","VAN LOO", "Antoine",1,1);
INSERT INTO utilisateur(`id_user`,mdp,nom_client,prenom_client,`contrat_id`,`type_utilisateur_id`) VALUES(2,"motdepasse","LORIAUX", "Clément",2,2);

INSERT INTO client(id_contrat,marge) VALUES(1,5);INSERT INTO client(id_contrat,marge) VALUES(2,35);
INSERT INTO client(id_contrat,marge) VALUES(3,50);

CREATE TABLE article(id_article INT NOT NULL AUTO_INCREMENT,nom_article VARCHAR(250) NOT NULL,cout_fabrication FLOAT(10,7) NOT NULL,
CONSTRAINT pk_id_article PRIMARY KEY (id_article));

INSERT INTO `article` (`id_article`, `nom_article`, `cout_fabrication`) VALUES ('1', 'pouette', '500'), ('2', 'poux', '2.5');
