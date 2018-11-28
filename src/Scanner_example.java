
import java.util.Scanner;

public class Scanner_example {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Please give your name");
        String name= a.next();
        System.out.println("Please Enter Marks");

        int marks = a.nextInt();


        if (marks >= 35 && marks <50) {
            System.out.println(name+ "You are Pass");
        }
        else if (marks>=50 && marks <60 ){
            System.out.println(name+"You have Second Class");
        }
        else if (marks>=60 && marks <70 ){
            System.out.println(name+"You have First class");
        }


        else if (marks>=70 && marks<=100){
            System.out.println(name+"You have distinction");
        }
        else if (marks<35&&marks>0){
            System.out.println("Fail");
        }
        else if (marks>100||marks<0){
            System.out.println("Invalid Data");
        }


}
}
