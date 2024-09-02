#!/usr/bin/groovy

def reconUtil(){

    node(any){
        stage('Cloning nuclei'){
            sh """
            https://github.com/projectdiscovery/nuclei.git
            """
        }

        stage('Installing nuclei'){
            sh """
            brew install nuclei
            """
        }

        stage('Running nuclei'){
            sh """
            nuclei -h
            """
        }
    }
}