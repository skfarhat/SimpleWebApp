node {
   stage('Preparation') {
      git 'https://github.com/skfarhat/SimpleWebApp.git'
   }
   stage('Build') {
    def os = System.properties['os.name'].toLowerCase()
    if (os.contains("windows")) {
        bat "./gradlew clean test"
       } else {
        sh "./gradlew clean test"
       }
   }
   stage('Hello') {
      echo "Hello"
   }
}