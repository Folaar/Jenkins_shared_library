def call() {
    sh 'trivy image folaar/youtube:latest > trivyimage.txt'
}
