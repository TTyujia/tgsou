pipeline {
  agent any
  stages {
    stage('Clone Source') {
      steps {
        git(url: 'git@gitlab.atcdevops.accenture.com:MicroPaaS/demo/functional-test.git', branch: 'master', credentialsId: 'SSHGitlabAccess')
      }
    }
    stage('Sao Fat') {
      steps {
        readManifest(file: 'a\'b\'c', text: 'abc')
      }
    }
  }
}