# TP_integrationContinue
Contexte :

Société de ventes de pièces détachées automobiles utilise un logiciel pour lister les coûts de production de chacun de ses 1300 articles (3-TIER interne exploité en client lourd, API avec données extractibles depuis le LAN)
=> Comment faire pour lui permettre d'afficher des prix différenciés pour chacun de ses clients en fonction des contrats cadres définis avec chaque groupe de clients ?
25 clients répartis en 5 contrats cadres pouvant évoluer chacun margeant de 5% à 25%, de nouveaux sont à venir.

Préalable : Création d'un développement JAVA réparti en 3-TIER sans mise en forme imposée sur Front pour lister les produits et coûts de fabrication (au moins 10 entrées en dur dans la Base de données, exemple source inspiration = Valeo)

Travaux :
Pour toutes les IC :
Conserver dans un référentiel standard tous les résultats des tests auto avec leur impact si non validés ou validé (docs, exports IHM tests auto et/ou screenshots clairs)
Langage : Java, framework libres mais pas toujours de support technique sur les spécificités de ma part

IC0 : Constitution des 2 sous groupes, Définir un PO et un Scrum Master par groupe (d'autres rôles Agile peuvent être pris par les apprenants si le groupe le souhaite), prise de connaissance des solutions techniques, proposition d'approche fonctionnelle, rédactions.
Timing : le cours d'aujourd'hui et le suivant
Puis rédaction d'un document avec en complément l'organisation du développement IC1,2,3 sur un documents avant mise en oeuvre ==> validation avec Yoann

IC1 : (Jenkins Local, pas de Git imposé, mais c'est mieux) : développer les tests automatisés pour vérifier la cohérence des prix du front par rapport aux valeurs en base de données Creation d'un API simple pour exposer les données en JSON

Entre IC1 et IC2 le Scrum Master peut être changé à la majorité absolue du groupe.

IC2 : développer tests auto pour valider données de l'API + refaire un IC1 pour s'assurer qu'il n'y a pas de regression
Trouver une architecture qui permet aux clients externes au LAN d'accéder aux prix des produits via interface web
Creation des 5 règles de marges pour les contrats cadres + Creation des règles + affichage prix d'achat par groupe de clients (prix = prix de production + marge + TVA)

IC3 : test auto pour valider prix affichés sur IHM clients par rapport aux données présentes en BDD
