pipeline{
    agent any
    stages {
        stage('clone react project'){
            steps{
                git 'https://github.com/mdandotiya/reactspe.git'
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