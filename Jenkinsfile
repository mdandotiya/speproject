pipeline{
    agent {
        docker {
                image 'node:lts-buster-slim'
                args '-p 3000:3000'
        }
    }
    stages {
        stage('clone react project'){
            steps{
                git 'https://github.com/mdandotiya/reactspe.git'
            }
        }
        stage('Build react app') {
            steps {
                sh 'npm install'
            }
        }
        stage('clone spring project'){
            steps{
                git 'https://github.com/mdandotiya/speproject.git'
            }
        }
        stage('build spring app'){
            steps{
                script{
                    sh "mvn clean install"
                }
            }
        }
    }
}