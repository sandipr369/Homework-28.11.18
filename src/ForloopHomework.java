import java.sql.SQLOutput;
import java.util.Scanner;


//1.	Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
//2.	Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
//	For example, 153 =
// ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
//3.	Write a program to print Fibonacci series of n terms where n is input by user :
//0	1 1 2 3 5 8 13 24 .....
//4.	Write a program to calculate the sum of following series where n is input by user.
//1	+ 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
//5.	Write a program to calculate the sum of first 10 natural number.
//6.	Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
//7.	Write a program in Java to input 5 numbers from keyboard and find their sum and average.
//8.	Write a program in Java to display the cube of the number upto given an integer.
//9.	Print below number pattern with for loop (without reassigning the integer number)
//	1
//	2 3
//	4 5 6
//	7 8 9 10
//11	12 13 14 15
//10.	Write a Java program to concatenate a given String to the end of another String
//11.	 Print below pattern with the help of nested for loop
//	*
//	* *
//	* * *
//	* * * *
//	* * * * *
//
//12.	Print the numbers divisible by 3 and 5 separately … ask user to enter the limit of the loop
//13.	Print left sided number triangle pattern


public class ForloopHomework {
    //prime number idetification:

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter the end value");
        int n = p.nextInt();
        boolean isprime = true;


        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                isprime = false;
                System.out.println("NOT Prime");
                break;
            }


        }
        if (isprime) {
            System.out.print("IS prime");
        }
    }
}


class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;

        Scanner p = new Scanner(System.in);
        System.out.println("This is fibonacci series");

        System.out.println(a + " " + b);
        for (int i = 2; i <= 10; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(" " + c);
        }


    }
}


//class Fraction {
//    public static void main(String[] args) {
//
//
//        Scanner p = new Scanner(System.in);
//        System.out.println("Enter start number");
//        float n = p.nextFloat();
//        float t=0 ;
//        float sum =0;
//
//        for (int i = 0; i <= n; i++) {
//
//           t= (1 / (n + i));
//            sum = t + n  ;
//
//
//
//
//        }
//        System.out.println(sum);
//
//
//    }
//}

//7.	Write a program in Java to input 5 numbers from keyboard and find their sum and average.


class Sum_Average {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        double a, b, c, d, e;
        System.out.println("Enter any five number");

        a = p.nextDouble();
        b = p.nextDouble();
        c = p.nextDouble();
        d = p.nextDouble();
        e = p.nextDouble();

        System.out.println("Average =" + ((a + b + c + d + e) / 5) + "total is =" + (a + b + c + d + e));

    }


}
//8.	Write a program in Java to display the cube of the number upto given an integer.

class Cube {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = p.nextInt();
        for (int i = 1; i <= num; i++) {

            int cube;
            cube = i * i * i;

            System.out.println(cube);
        }
    }
}


//12.	Print the numbers divisible by 3 and 5 separately … ask user to enter the limit of the loop

class Divisible {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter any positive number ");

        int num = p.nextInt();

        System.out.println("Divisible with 3");
        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0) {
                System.out.println(i);
            }


        }

        System.out.println("Divisible with 5");
        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }

        }
    }
}
//5.	Write a program to calculate the sum of first 10 natural number.

class NaturalNumber {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = i + sum;
            System.out.println(sum);


        }
    }
}

//6.	//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.

class Table {
    public static void main(String[] args) {
        System.out.println("Enter any positive number");
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(n + "*" + i + "=" + n * i);
        }

    }
}

//9.	Print below number pattern with for loop (without reassigning the integer number)

class RightTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {

            System.out.println(i);
        }
    }
}
//9.	Print below number pattern with for loop (without reassigning the integer number)
//	1
//	2 3
//	4 5 6
//	7 8 9 10
//11	12 13 14 15

class Triangle {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = p.nextInt();
        int flag = 0;

        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= i; j++) {
                flag = flag + 1;


                System.out.print(flag + " ");
            }
            System.out.println("");
        }
    }
}

//11.	 Print below pattern with the help of nested for loop
//	*
//	* *
//	* * *
//	* * * *
//	* * * * *


class StarTriangle {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= i; j++) {


                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}


//class LeftTriangle{
//    public static void main(String[] args) {
//        Scanner p= new Scanner(System.in);
//        System.out.println("Enter any number");
//        int a=p.nextInt();
//        int flag=0;
//
//        for(int i =1;i<=a;i++){
//
//            for(int j=1;j<=i;j++){
//                flag=flag+1;
//
//
//                System.out.print("          "+ flag);
//            }
//            System.out.println("");
//        }
//    }
//}


//2.	Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
//	For example, 153 =
// ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )

class ArmstrongNumber {
    public static void main(String[] args) {
        int a, b, c, d;

        for (int i = 1; i <= 500; i++) {
            c = i % 10;
            b = i % 100 / 10;
            a = i % 1000 / 100;
            d = (a * a * a) + (b * b * b) + (c * c * c);

            if (i == d) {
                System.out.println(i);
            }


        }

    }
}


//4.	Write a program to calculate the sum of following series where n is input by user.
//1	+ 1/2 + 1/3 + 1/4 + 1/5 +…………1/n

class HarmonySerise {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("2+1/2+1/3+......+1/n" + "Enter the n value");
        int n = p.nextInt();
        double flag = 0;

        for (float i = 1; i <= n; i++) {
            flag = flag + 1 / i;

            System.out.println(flag);
        }
        System.out.println("Total  " + flag);
    }
}

//13.	Print left sided number triangle pattern

class LeftTriangle {
    public static void main(String[] args) {

        int flag = 0;
        for (int i = 0; i <= 4; i++) {
            for(int k=3; k>=i ; k-- ){
                System.out.print("  ");
            }


            for (int j = 1; j <= i; j++) {

                flag = flag + 1;

                System.out.print(flag+" ");
            }
          System.out.println();
        }
    }
}

