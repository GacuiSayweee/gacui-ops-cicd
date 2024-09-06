pipelineJob('pipeline-demo1') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/GacuiSayweee/gacui-ops-cicd.git')
          }
          branch('*/main')
        }
      }
      lightweight()
      scriptPath('pipeline-demo1/Jenkinsfile')
    }
  }
}
