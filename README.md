# [AOE - Library of Open Educational Resources](https://github.com/CSCfi/aoe)

# ⚠️ Project Moved ⚠️

## AOE project has been moved to a new location!

The repository is no longer maintained here.  
Find the latest updates and contributions at:

👉 **[Opetushallitus/aoe](https://github.com/Opetushallitus/aoe)** 👈

## Service Component links in GitHub (mirrored)
- [aoe-data-analytics](https://github.com/CSCfi/aoe-data-analytics)
- aoe-data-services
- [aoe-semantic-apis](https://github.com/CSCfi/aoe-semantic-apis)
- [aoe-streaming-app](https://github.com/CSCfi/aoe-streaming-app)
- [aoe-web-backend](https://github.com/CSCfi/aoe-web-backend)
- [aoe-web-frontend](https://github.com/CSCfi/aoe-web-frontend)

# AOE Data Services

## OAI-PMH Provider
- Module: oaipmh-provider
- Running on ports: 8001 (prod), 8002 (test)
- Java version: OpenJDK 17
- Spring Boot version: 3.2.4
- Build with Docker image: maven:3.8.5-openjdk-17-slim
- Run with Docker image: openjdk:17-slim

### Description
Integration service for metadata harvesting from external systems.
Service interface implements [OAI-PMH protocol](https://www.openarchives.org/OAI/2.0/openarchivesprotocol.htm).

### Management

#### Build and run the test instance
```
$ sudo docker-compose -f docker-compose.test.yml build
$ sudo docker-compose -f docker-compose.test.yml up
```
#### Build and run the production instance
```
$ sudo docker-compose -f docker-compose.prod.yml build
$ sudo docker-compose -f docker-compose.prod.yml up
```
