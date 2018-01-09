# Gestion d'une bibliothéque 
> M2 dataScale - 2017/2018


## Contexte

Il s’agit de réaliser un logiciel permettant de gérer une bibliothèque. notre application devra gérer les documents de la bibliothèque, les adhérents ainsi que les différents prêts. Il devra permettre de saisir les informations sur les différents livres (numéro, titre, auteur, mots clés, année de parution, etc.) et sur les différents adhérents (numéro, nom, prénom, année de naissance, adresse, tél, etc.) ainsi que la gestion des prêts : un adhérent peut emprunter un (ou plusieurs) livres, auquel cas, on enregistre le numéro de l’adhérent, le numéro du livre et la date de sortie. On doit également pouvoir enregistrer les retours de documents. Enfin, votre logiciel devra permettre d’éditer la liste des retardataires.

## Niveau d'accréditation 
* Adhérents
* Agents de la bibliothèque
* Administrateur des agents
## Liste des fonctionnalités possibles (non exhaustive):
* Adhérents :
   * Mise à jour de la civilité (adresse,nom,date de naissance,..)
   * Panier : Réserver / Restituer un ou plusieurs livres 
   * Liste des favoris
   * Historique des réservations 
   * Paiement des pénalités
   * Liste des emprunts en cours 
   * Moteur de recherche ( Catalogue )
   * Abonnement et désabonnement 
* Agents de la bibliothèque :
   * Ajouter un livre et la mise à jour du stock
   * Suppression d’un livre (avec le cas où un livre est remplacé par un autre )
   * Gestion des adhérents ( ajout, suppression,.. )
   * Gestion des réservations
   * Gestion des restitutions et les retardataires (pénalités)
* Administrateur des agents:
   * Gestion des contrats 
   * Gestion des agents 
   * Ajouter un agent
   * Supprimer un agent
   * Afficher un ou plusieurs agents 

## Diagramme Use Case

![](https://scontent-cdg2-1.xx.fbcdn.net/v/t34.0-12/25674229_158245161611878_1965893520_n.png?oh=754bae00ebc620e4f98567a79a1d89b1&oe=5A4170A8)



```sh
git clone https://github.com/abdnet/Gestion-d-une-bibliotheque.git
```


## Developpemnt 
* Technologies utilisés : 
  * SpringBoot  , Struts ( couche web)
  * Thymleaf ,Bootstrap
  * MySQL


## contributeurs :
 :top: IDOUHAMMOU Abderrahman 
 :top: TIBA Mohamed
 :top: ZINABI Yassine


 

