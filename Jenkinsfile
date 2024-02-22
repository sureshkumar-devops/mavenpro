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
   
}

