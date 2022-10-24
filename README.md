# Full Stack Chatroom Application

## Table of Contents
- [Description](#description)
- [Project Features]()
- [Development Process]()


## Description
Developed a full stack chatroom application. The back end was developed using Spring boot with 
STOMP JS to send user messages. The front end was developed using React JS.

## Project Features 
- There is support for public messages that are sent to all users.
- There is support for private messages that are sent to specific users.

## Development Process
The back end of the project is developed using Spring Boot and STOMP js to transmit user
messages. Maven plugins are used to package together the frontend and backend. The packaged 
application is put in a Docker container to be deployed to AWS Elastic Beanslack.

I implemented CI/CD pipelines into the project to automate various parts of the development cycle.
One Pipeline is used to package together the frontend and backend and test that nothing is broken.
This pipeline takes place on branch merge requests. Another pipeline is used automate the deployment
process. This pipeline connects AWS to Docker Hub to automatically deploy the latest image version to 
AWS. Additionally, Slack is also included in the pipeline to automatically send 
deployment update to a specified Slack channel. This pipeline takes place when the main github branch
is updated.

![alt text](https://github.com/stay-fcsd/fullstack-chatroom/blob/main/assets/pipeline.png "CI/CD pipelines")
