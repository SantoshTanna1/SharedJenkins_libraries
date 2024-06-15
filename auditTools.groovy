def auditTools(Map config){
    node{
        echo "${config.message}"
        sh '''
        git --version
        mvn -version
        java -version
    }
}
  
