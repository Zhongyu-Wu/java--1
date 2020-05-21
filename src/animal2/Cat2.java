package animal2;

public class Cat2 extends aninal2 {
    private double weight;
    //public int temp = 300;

    public Cat2(){

    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    public void run(){
        System.out.println(this.getName()+"是一只"+ this.getSpecies()+",running");
    }
}
