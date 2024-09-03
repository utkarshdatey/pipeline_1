node {
    stage('Pull') {
        echo 'pull success'
    }
    stage('Build') {
        echo 'build done'
    }
    stage('Test') {
        echo 'test done'
    }
    stage('Deploy') {
        echo 'deployed'
    }
}
