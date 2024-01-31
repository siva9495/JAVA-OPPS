package Inheritance;

class Vechicle {

    //Child(sub) class acquires the properties of the parent(super) class is called inheritance.

    //Parent can take reference of the child class but not access methods in the child class.

    void Start(){
        System.out.println("Vechicle is starting");
    }

    void Stop(){
        System.out.println("Vechicle is stopped");
    }

}

class Honda extends Vechicle{

    void drive(){
        System.out.println("Car is driving");
    }
    @Override
    void Start(){
        System.out.println("Start the honda");
    }

}

class Volva extends Vechicle{

    void drive(){
        System.out.println("Car is driving");
    }
    @Override
    void Start(){
        System.out.println("Start the Volva");
    }

}







