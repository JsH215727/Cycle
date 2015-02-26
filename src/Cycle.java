/**
 *
 * @author Jisheng
 */
public class Cycle {
    private int numberOfWheels=0, weight=0;
    
    public Cycle(){
        this(100, 1000);
    }
    
    public Cycle(int numberOfWheels, int weight){
        super();
        this.numberOfWheels = numberOfWheels;
        this.weight = weight;
    }
    
    public int getNumberOfWheels(){
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }
    
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public String toString() {
        return "Cycle [numberOfWheels=" + numberOfWheels + ", weight=" + weight+ "]";
    }
}