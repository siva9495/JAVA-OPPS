package Inheritance;

public class Box {

    double l;
    double h;
    double w;




    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double length, double height, double width){
        this.l = length;
        this.h = height;
        this.w = width;
    }

    Box( Box old){


        this.l = old.l;
        this.h = old.h;
        this.w = 7;
    }

}

