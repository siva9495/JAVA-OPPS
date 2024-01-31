package constructor;

public class thiskeyword {
    public static void main(String[] args) {
        Student siva = new Student();
        System.out.println(siva.rollno+" "+siva.name+" "+siva.marks);
        siva.greeting();
        siva.changeName("ramu");
        siva.greeting();

        //by using the this keyword call the another constructor in the constructor
        Student random = new Student();
        System.out.println(random.name);

    }
}

class Student{

    int rollno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello! my name is "+name);
    }

    void changeName(String newName){
        name = newName;
    }

//    Student(){
//        this.rollno = 31;
//        this.name = "siva prasad";
//        this.marks = 30.56f;
//    }

    Student(){
        this(13,"random name",100.0f);
    }

    Student(int rolno, String name, float marks){
        this.rollno = rolno;
        this.name = name;
        this.marks = marks;
    }

}
