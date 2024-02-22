pipeline
{  
  agent any
  stages{
    stage('Build Application')
    {
      steps
      {
         sh 'mvn clean package'
      }
      post
      {
         success
        {
          echo "Nov Archiving the Artifacts.."
          archiveArtifacts artifacts: '**/*.war'
        }
      }
    }
    stage('Deploy in Staging Env')
    { 
      build job: 'Deploy-App-Staging-Env'        
    }
    }
  }

