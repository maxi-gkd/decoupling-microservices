# Decoupling Microservices with Docker Compose

This project showcases how to decouple microservices using Apache Kafka. It includes two microservices - a SpringBoot producer and a consumer.

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
cd decoupling-microservices
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

