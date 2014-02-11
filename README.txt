Ce document présente brièvement les fonctionnalités présentent à ce jour

La DAO User fonctionne, peu de méthodes implémenter, néanmoins, maintenant que le schéma est compris, implémenter le reste tient presque du copier/coller

L'exposition du controlleur User n'est pas réussi, Glassfish renvoie obstinément un code 404 lors de tentative de GET via un client.

Les applications (Entity) du domaine sont en place, et mériterait d'être vernies (notamment au niveau des annotations).


Pour tester le peu de fonctionnalités, il faut penser à créer un "pool de connection" sur Glassfish avec les paramètres suivant :

*portNumber : 3306 (par défaut de MySQL Server)
*databaseName : toto
*serverName : localhost
*user : root
*password : blackboner69

Penser à se créer un client, et ajouter les classes (soit à la main, soit en ajoutant le projet au BuildPath)



