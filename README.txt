Ce document pr�sente bri�vement les fonctionnalit�s pr�sentent � ce jour

La DAO User fonctionne, peu de m�thodes impl�menter, n�anmoins, maintenant que le sch�ma est compris, impl�menter le reste tient presque du copier/coller

L'exposition du controlleur User n'est pas r�ussi, Glassfish renvoie obstin�ment un code 404 lors de tentative de GET via un client.

Les applications (Entity) du domaine sont en place, et m�riterait d'�tre vernies (notamment au niveau des annotations).


Pour tester le peu de fonctionnalit�s, il faut penser � cr�er un "pool de connection" sur Glassfish avec les param�tres suivant :

*portNumber : 3306 (par d�faut de MySQL Server)
*databaseName : toto
*serverName : localhost
*user : root
*password : blackboner69

Penser � se cr�er un client, et ajouter les classes (soit � la main, soit en ajoutant le projet au BuildPath)



