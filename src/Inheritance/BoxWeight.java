package Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -4;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double length, double height, double width, double weight) {
        super(length, height, width); //it calls the parent class constructor
        this.weight = weight;
        System.out.println(this.weight);
    }
}
