package Inheritance;

public class VechicleMain {

    

    public static void main(String[] args) {
//        Vechicle mycar = new Honda();
//
//        mycar.Start();
//        Vechicle mycar2 = new Volva();
//        mycar2.Start();

        int b = 2;
        int[] myArray = {1, 2, 3, 4, 5};

        try{
            for (int i = 0; i <= myArray.length ; i++) {
                System.out.println(myArray[i]);
            }
        }catch(Exception ae){
            System.out.println(ae.getMessage());
        }

    }

}
