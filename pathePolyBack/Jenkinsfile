pipeline {
    agent any
    triggers {
    pollSCM('*/5 * * * *') // Vérifier toutes les 5 minutes
    }
    stages {
        stage('Checkout') {
            steps {
                echo 'Récupération du code source'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Construction de l\'application'
                // Ajoutez ici les commandes de construction de votre application
            }
        }

        stage('Test') {
            steps {
                echo 'Exécution des tests'
                // Ajoutez ici les commandes pour exécuter vos tests
            }
        }

        stage('Deploy') {
            steps {
                echo 'Déploiement de l\'application'
                // Ajoutez ici les commandes pour déployer votre application
            }
        }
    }
}