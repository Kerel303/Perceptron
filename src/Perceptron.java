public class Perceptron {
    private double[] weights;
    private double activationTreshhold;
    private double alphaLearningConstant;
    //Przyjmujemy długość wektora wag, próg , próg włączenia perceptronu, oraz stałą uczenia alfa
    Perceptron(int LengthOfTheWeightVector, double activationTreshhold, double alphaLearningConstant){
        weights = new double[LengthOfTheWeightVector];
        for(int i = 0; i < LengthOfTheWeightVector; i++){
            // Początkowe wartości wag są losowane od (-1) do (1)
            weights[i] = (Math.random()*2)-1;
        }
        this.activationTreshhold = activationTreshhold;
        this.alphaLearningConstant = alphaLearningConstant;
    }

    int classify(double[] data){
        if(data.length != this.weights.length){
            throw new IllegalArgumentException("Zła długość wektora wejściowego");
        }

        double sum = 0;
        
        for(int i = 0; i < this.weights.length; i++){
            sum += data[i]*weights[i];
        }
        
        if(sum >= this.activationTreshhold){
            return 1;
        }else{
            return 0;
        }
    }

    void learn(double[] weights, String realAnswer){

    }
}
