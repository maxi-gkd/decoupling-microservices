# Decoupling Microservices with Docker Compose

This repository contains a sample project that demonstrates how to decouple microservices using Docker Compose. The project consists of two microservices: a producer and a consumer, which communicate via Apache Kafka.

## Prerequisites

Before you get started, make sure you have the following installed on your local machine:

- Docker
- Docker Compose

## Running the Microservices

To run the microservices using Docker Compose, follow these steps:

1. Clone this repository to your local machine:

 ```bash
 git clone https://github.com/your-username/decoupling-microservices.git
  ```
2. Navigate to the project directory:

```bash
docker-compose build
```
3. Build the Docker images for the microservices:

```bash
docker-compose build
```
4. Start the Docker containers:

```bash
docker-compose up
```
5. To stop the containers and clean up, use:

```bash
docker-compose down
```

