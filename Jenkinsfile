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
               sh "./gradlew jacocoTestCoverageVerification"
               sh "./gradlew jacocoTestReport"
               publishHTML(target: [
               reportDir: 'build/reports/jacoco/test/html',
               reportFiles: 'index.html',
               reportName: 'Jacoco Report'
               ])
            }
        }
        stage("Static Code Analysis"){
            steps{
               sh "./gradlew checkstyleMain"
               publishHTML(target: [
               reportDir: 'build/reports/checkstyle/',
               reportFiles: 'main.html',
               reportName: 'Checkstyle Report'
               ])
            }
        }
        stage("gradle build"){
            steps{
               sh "gradlew clean build"
            }
        }
        stage("Docker build"){
            steps{
               sh "docker build -t jenkins1111 ."
            }
        }
    }
}