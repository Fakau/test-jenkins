//scripted
def mvn
node {
    stage ('Get Tools') {
        def maven_home = tool 'maven'
        'Get Tools' = "${maven_home}"/bin/mvn
    }
    stage('Get version'){
        sh "${'Get Tools'} --version"
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