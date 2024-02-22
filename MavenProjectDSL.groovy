job('FirstMaveJob-2024')
{
  description("First Maven Job gernerated..")
  scm{
    git("https://github.com/sureshkumar-devops/mavenpro.git", 'master')
  }
  trigger{
    scm('* * * * * ')
  }
  steps{
    maven('clean package','pom.xml')
  }
  publishers{
    archiveArtifacts '**/*.jar'
  }
}


    
    
    
