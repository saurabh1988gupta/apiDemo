pipeline {
    environment {
        imagename = "saurabh1988gupta/api-demo"
        registryCredential = 'DockerHub'
        dockerImage = null
    }
    agent any
    tools {
        maven 'Maven_Home'
    }
    stages {
        stage('Cloning Git') {
			steps {
				git([url: 'https://github.com/saurabh1988gupta/apiDemo.git', branch: 'master', credentialsId: 'GitHub'])
			}
        }
        stage('Build Image') {
			steps{
				script {
				    sh "mvn clean install"
					dockerImage = docker.build imagename
				}
			}
        }
        stage('Push Image') {
          steps{
				script {
					docker.withRegistry( '', registryCredential ) {
				// 		dockerImage.push("$BUILD_NUMBER")
						dockerImage.push('latest')
					}
				}
			}
        }
        stage('Deploy Image to k8s'){
            steps{
                script{
                    kubernetesDeploy (configs: 'deploy.yaml')
                    kubernetesDeploy (configs: 'service.yaml')
                }
            }
        }
    }
}