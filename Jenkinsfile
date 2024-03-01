pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy') {
                    steps {
                        sh 'java -jar target/jenkispipeline.jar'
                    }
                }
                stage('Generate Documentation') {
                    steps {
                        sh 'mvn javadoc:javadoc'
                    }
          }
    }
}