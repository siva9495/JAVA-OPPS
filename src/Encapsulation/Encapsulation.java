package Encapsulation;

public class Encapsulation {

    //what is encapsulation ?
    //Encapsulation is the binding of the data(varabiles) and methods in single unit, and controlling of the internal details is called encapsulation
    //You cannot access the inside data directly
    private int age;
    private String name;

//    public Encapsulation(int age, String name){
//        this.age = age;
//        this.name = name;
//    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

