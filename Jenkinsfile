node {
   stage('Preparation') {
      git 'https://github.com/skfarhat/SimpleWebApp.git'
   }
   stage('Build') {
    if (isUnix()) {
        sh "./gradlew clean test"
       } else {
        bat "./gradlew clean test"
       }
   }
   stage('Hello') {
      echo "Hello"
   }
}