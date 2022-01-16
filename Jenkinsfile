//scripted
def mvn
node {
    stage ('Get Tools') {
        def maven_home = tool 'maven'
        mvn = "${maven_home}/bin/mvn"
    }
    stage('Get maven version'){
        sh "${mvn} --version"
    }
    stage('Test'){
         sh "${mvn} test"
    }
    stage('Build'){
         sh "${mvn} package -DskipTests"
    }
}


/*
//declarative
pipeline{
    agent any
    tools{
        maven 'maven'
    }
    stages {
        stage('Get maven version') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
*/