pipeline 
{
    agent any

    stages 
    {
        stage('Build') 
        {
            steps 
                {
                    git 'https://github.com/Asim-Chaudhary/Assignment_Java_Junit_Jenkins_Integration.git'
                    bat '.mvnw clean compile'
                
                }

        }

        stage('Test') 
        {
            steps 
                {
                echo 'Test App'
                }

        }        

        stage('Deploy') 
        {
            steps 
                {
                echo 'Deploy App'
                } 

        }               
    }
}
