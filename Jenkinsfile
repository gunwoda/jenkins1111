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
        stage("Test"){
            steps{
                sh "./gradlew test"
            }
        }
        stage("Code Coverage"){
             steps{
                 sh "./gradlew  test jacocoTestCoverageVerification"
             }
         }
    }
}