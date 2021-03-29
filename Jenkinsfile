pipeline {
    agent any
    triggers {
        pollSCM('H/1 * * * *')//each two minutes will see if something change i.e push
    }
    stages {
        stage('Build') {
            steps {
                echo "Generating .jar file"
                sh './gradlew clean assemble'

            }
        }
        stage('Unit Tests') {
            steps {
                echo "Running unit tests"
                sh './gradlew test'
            }
        }
        stage('SonarScanner Analyze') {
            steps {
                echo 'Analyzing SonarScanner...'
                sh './gradlew sonarqube -Dsonar.projectkey=java-app -Dsonar.host.url=http://192.168.56.10:9000 -Dsonar.login=c78ef6b0d5c4a0a233dad41f1db87883a91bca71 -Dsonar.verbose=true'
            }
        }
        stage('Publish') {
            steps {
                echo 'Publishing to Artifactory...'
                sh './gradlew artifactoryPublish'
                archiveArtifacts artifacts: 'build/libs/**/*.jar'
            }
        }
        stage('Deploy') {
	        steps {
                echo 'Deploying...'
                sh './gradlew -b deploy.gradle deploy --console verbose'
            }
        }
    }
}