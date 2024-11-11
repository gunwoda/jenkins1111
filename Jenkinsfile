pipeline{
    agent any
    stages{
        stage("checkout"){
            steps{
            sh "echo checkout"
            }
        }
        stages("Compile"){
            steps{
            sh "./gradlew compileJava"
            }
        }
    }
}