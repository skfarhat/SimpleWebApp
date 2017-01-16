node {
   stage('Preparation') {
      git 'https://github.com/skfarhat/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}