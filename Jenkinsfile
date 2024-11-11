pipeline{
    agent any
    stages{
        stage("checkout"){
            steps{
            sh "echo checkout"
            }
        }
        stage("Permission"){
            steps{
                sh "chmod +x ./gradlew"
            }
        }
        stage("Compile"){
            steps{
            sh "./gradlew compileJava"
            }
        }
    }
}