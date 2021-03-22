pipeline {
    agent any
    triggers {
        pollSCM('H/2 * * * *')//each two minutes will see if something change i.e push
    }
    stages {
        stage('Tests') {
            steps {
                echo "Running unit tests"
                sh './gradlew test'
            }
        }
        stage('Build') {
            steps {
                echo "Generating .jar file"
                sh './gradlew clean assemble'
            }
        }
    }
}