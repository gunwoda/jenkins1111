pipeline{
    agent any
    stages{
        stage("checkout"){
            steps{
            sh "echo checkout"
            }
        }
        stage("Compile"){
            steps{
            sh "./gradlew compileJava"
            }
        }
    }
}