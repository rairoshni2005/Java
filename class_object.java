//Write a Java program to create a Box class with properties width, height, and breadth. Implement a method to calculate and print the volume of a box. Then, create two objects of the Box class, assign different dimensions to each, and print the volume of both boxes.

// class Box initialisation

class Box{
    double width;
    double height;
    double breadth;

    void volume(int num){
        System.out.println("Volume of box "+num+" = " +width*height*breadth);
    }
}

public class class_object{
    public static void main(String[] args) {
        Box mybox1 = new Box();     //created object 1 of Box class
        Box mybox2 = new Box();     //created object 2 of Box class

        // assigning values to box 1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.breadth = 15;
        
        // assigning values to box 2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.breadth = 9;

        // printing the volumes by invoking member functions
        mybox1.volume(1);
        mybox2.volume(2);
    }
    
}