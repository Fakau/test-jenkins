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
        steps {
            sh "${mvn} test"
        }
        post {
            always {
                junit 'target/surefire-reports/*.xml'
            }
        }
    }
    stage('Build'){
         post {
            always {
                 archiveArtifacts artifacts: 'target/*.jar'
         }
        }
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
}
*/