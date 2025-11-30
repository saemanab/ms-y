Micro-services Billing Application
🎯 Objectif

Créer une application basée sur une architecture micro-service permettant :

de gérer les clients

de gérer les produits

de gérer les factures contenant des produits et appartenant à un client

L’application utilise un écosystème Spring Cloud + Angular pour démontrer une architecture distribuée moderne.

🧩 Architecture des micro-services

customer-service – gestion des clients

inventory-service – gestion des produits

billing-service – gestion des factures + communication OpenFeign

gateway-service – API Gateway avec routage statique et dynamique

eureka-discovery-service – registre des services

config-service – centralisation de la configuration

Angular Client – interface front-end

📺 Ressources pédagogiques

Micro-services Spring Boot & Feign:

Partie 1 : https://www.youtube.com/watch?v=kOVHzN8I8e8

Partie 2 : https://www.youtube.com/watch?v=-iM3J_mgqlM

Spring Cloud Config:

https://www.youtube.com/watch?v=-G2rcLMO1gQ

Repo professeur (inspiration):

https://github.com/mohamedYoussfi/micro-services-app

🧠 Travail réalisé
✔︎ 1. Customer-Service

CRUD Client

Stockage BDD (H2, MySQL ou autre selon config)

JPA + Spring Data

✔︎ 2. Inventory-Service

CRUD Produit

Stockage produit (prix, quantité, etc.)

✔︎ 3. Gateway — Spring Cloud API Gateway

Point d’entrée unique

Filtrage et routage des requêtes

✔︎ 4. Configuration statique du routage

Routes définies dans application.yml

✔︎ 5. Service registre — Eureka Discovery

Chaque micro-service s’enregistre dynamiquement

Permet le load-balancing

✔︎ 6. Routage dynamique via Eureka

La Gateway effectue un routage basé sur discovery

✔︎ 7. Billing-Service

Génération de facture

Consommation des autres micro-services via OpenFeign

✔︎ 8. Config-Service

Centralisation des fichiers application.yml

Externalisation de la config

Compatible Git-based config

✔︎ 9. Client Angular

UI permettant

affichage des client

produits

création et affichage des factures

🧪 Tests et démonstration

Une fois les services démarrés :

Eureka console accessible : http://localhost:8761

Gateway exposée sur http://localhost:8888

Services internes (exemples) :

http://localhost:8081/api/customers

http://localhost:8082/api/products

🚀 Installation & Exécution (Backend)
mvn clean install


Démarrer chaque service individuellement depuis son module.

⚠️ Assurez-vous que Eureka et Config-service démarrent avant les autres.

🖥️ Installation & Exécution (Frontend Angular)
cd angular-client
npm install
ng serve -o

🛠️ Technologies utilisées
Backend:

Spring Boot

Spring Cloud Gateway

Eureka Discovery

Spring Data JPA

OpenFeign

Rest API

Config Service

Maven

Frontend:

Angular

TypeScript

Bootstrap / Material (selon choix)

👨‍💻 Auteur

Projet réalisé par  Mohamed Abiaba
Dans le cadre d’un apprentissage et exercice pédagogique sur les architectures micro-services.
