package com.Joel.lektion3;

import com.Joel.lektion3.model.Student;

public class Main {
    public static void main(String[] args) {

        System.out.println("first commit?");
        // Instantiate Object
        Student bob = new Student("Bob", 17, true);
        Student klas = new Student("Klas", 24, false);

        System.out.println(bob.name + " " + bob.age + " is tired? " + bob.isTired);
        if (bob.isTired) {
            System.out.println("zzzz");
        }
        else
            System.out.println("woke");
        //System.out.println(bob);
        System.out.println(klas.name + " " + klas.age + " is tired? " + klas.isTired);
        if (klas.isTired) {
            System.out.println("zzzz");
        }
        else
            System.out.println("woke");
       // bob.name = "Bob";
       // bob.age = 21;
       // klas.name = "Klas";


        //System.out.println(bob.name + " Is " + bob.age + " years old");
        //System.out.println(klas.name + " Is " + klas.age + " years old");




        /*
        int sum = 0;
        sum = addition(15, 25);
        //sum +=1;
        System.out.println(sum);
        System.out.println(addition(123, 321));
        addition2(12, 13);
        /* Making methods
        *  #1 Visibility modifier: public, protected, no modifier, private
        *  #2 static: exclude if not needed
        *  #3 DataType to return: send data, If nothing == void
        *  #4 Method name: camelCase (myMethodTwo) followed by () {}
        * */
    }

    public static int addition(int x, int y) {
        return x + y;
    }

    public static void addition2(int z, int b) {
        System.out.println(z + b);
    }
}
