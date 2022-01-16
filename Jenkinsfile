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
    stage('Test unitaire'){
        sh "${mvn} test"
        junit 'target/surefire-reports/*.xml'
    }
    stage('Build'){
        sh "${mvn} package -DskipTests"
    }
    stage('release'){
       archiveArtifacts artifacts: 'target/*.jar'
    }
}



//declarative
/*pipeline{
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
        stage('Test unitaire) {
            steps {
              sh 'mvn test'
            }
        }
        stage('Package') {
            steps {
              sh 'mvn package -DskipTests'
            }
        }
    }
    post {
       always {
           archiveArtifacts artifacts: 'target/*.jar'
           junit 'target/surefire-reports/*.xml'
       }
    }
}
*/