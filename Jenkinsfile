pipeline {
  agent any
  stages {
    stage('Clone Source') {
      parallel {
        stage('Clone Source') {
          steps {
            git(url: 'git@gitlab.atcdevops.accenture.com:MicroPaaS/demo/functional-test.git', branch: 'master', credentialsId: 'SSHGitlabAccess')
          }
        }
        stage('Clone src 2') {
          steps {
            sh 'ls -l'
            sleep(unit: 'SECONDS', time: 10)
          }
        }
      }
    }
    stage('Fuck wenjin') {
      steps {
        readManifest(file: 'a\'b\'c', text: 'abc')
      }
    }
  }
}