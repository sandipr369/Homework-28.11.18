//import com.sun.org.apache.bcel.internal.generic.SWAP;
//import sun.awt.Symbol;
//
//import java.util.Scanner;
////exercise -1
//
//public class Odd_Even {
//
//    public static void main(String[] args) {
//        Scanner p= new Scanner(System.in);
//        System.out.println("Enter Number");
//        int a = p.nextInt();
//
//        System.out.println(a%2==0 ? "This number is Even":"This number is Odd");
//    }}
////exercise-3
//
//    class StudentGrade{
//
//
//
//
//
//    public static void main(String[]args){
//
//
//
//        Scanner x= new Scanner(System.in);
//
//        System.out.println("Enter Student Name");
//        String name=x.next();
//        System.out.println("Enter Roll Number");
//        int d= x.nextInt();
//
//        System.out.println("Maths marks");
//        int a= x.nextInt();
//        System.out.println("Science mark");
//        int b= x.nextInt();
//        System.out.println("computing marks");
//        int c= x.nextInt();
//int total;
//total=a+b+c;
//int percentage;
//percentage=total*100/300;
//
//
//        System.out.println( "Roll Number " + d+"\n"+  name + " achieved" + " Total Marks ="+ total +"\n"+" and Acieved "+ percentage+ "%");
//
//if (percentage>=80){
//    System.out.println("Your grade is A+");
//}
//else if(percentage>=60){
//    System.out.println("Your grade is A");
//}
//else if (percentage>=50){
//    System.out.println("Your grade is B");
//}
//else if (percentage>=35){
//    System.out.println("Your grade is C");
//}
//else if (percentage<35&&percentage>0){
//    System.out.println("Sorry You are Fail");
//}
//
//
//
//
//
//        }
//
//
//
//    }
////exercise-3
//    class Passing_marks{
//    public static void main(String[]args){
//        Scanner x= new Scanner(System.in);
//        System.out.println("Enter marks for subject Maths");
//        int a= x.nextInt();
//        System.out.println("Enter marks for subject Science");
//        int b=x.nextInt();
//        System.out.println("Enter marks for subject Computing");
//        int c= x.nextInt();
//
//        if(a<35||b<35||c<35) {
//            System.out.println("You are Fail");
//        }
//        else{
//            System.out.println("You are Pass");
//
//        }
//    }
//
//}
//
////exercise-7
//class Average{
//    public static void main(String[] args) {
//        Scanner p= new Scanner(System.in);
//        System.out.println("Please enter 5 numbers one by one ");
//        int x= p.nextInt(),y=p.nextInt(),z=p.nextInt(),a=p.nextInt(),b=p.nextInt();
//        int average;
//        average=(x+y+z+a+b)/5;
//        System.out.println(average+" Is the average of above 5");
//
//
//
//
//    }
//}
//
//
//
//
//
////exercise-5
//class Interchange_value{
//  public static void main(String[] args) {
//
//
//    Scanner p=new Scanner(System.in);
//  System.out.println("Enter Value of a and b");
//
//      int=p.nextInt();
//      int b=p.nextInt();
//        int a,b,c;
//      c=a;
//      a=b;
//      b=c;
//        System.out.println("before swappng\n"+a+"\n"+ b);
//
////exercise-11
//
//class Vote{
//    public static void main(String[] args) {
//        Scanner v = new Scanner(System.in);
//        System.out.println("Please enter your age");
//        int age = v.nextInt();
//        if (age >= 18) {
//            System.out.println("You are eligible to vote");
//        } else if (age < 18 && age > 0) {
//            System.out.println("Sorry You are not eligible to vote");
//        }
//
//    }}
////exercise-6
//        class Salary_metrix{
//
//            public static void main(String[] args) {
//                Scanner p= new Scanner(System.in);
//                System.out.println("Please Enter your ID");
//
//                int id= p.nextInt();
//
//                System.out.println("Please Enter your Name");
//                String name= p.next();
//
//
//                System.out.println("Please Enter your Basic salary");
//                float salary= p.nextFloat();
//
//                if (salary<=0){
//                    System.out.println("Invalid data ");
//
//                }
//                float HRA;
//                float DA;
//                float TA;
//                float PF;
//                float Gross;
//
//                HRA=salary*10/100;
//                DA=salary*8/100;
//                TA=salary*9/100;
//                PF=salary*20/100;
//                Gross =(salary+HRA+TA+DA)-PF;
//
//                System.out.println("Your HRA =" + HRA);
//                System.out.println("Your DA =" + DA);
//                System.out.println("Your TA ="+ TA);
//                System.out.println("Your PF = "+ PF);
//                System.out.println("Your Gross salary ="+ Gross);
//
//
//
//
//            }
//
//        }
////exercise-9
//
//class sales_commission{
//    public static void main(String[] args) {
//        Scanner p= new Scanner(System.in);
//        System.out.println("Please enter your sales ID");
//        int id=p.nextInt();
//        System.out.println("Please enter your Name");
//        String name=p.next();
//        System.out.println("Please enter your sales amount");
//        double salesAmount= p.nextDouble();
//        System.out.println("Please basic salary");
//        double basicSalary= p.nextDouble();
//
//        if (salesAmount>=50000){
//            System.out.println("Your sales commission ="+ salesAmount*35/100);
//
//        }
//        else if (salesAmount>=30000){
//            System.out.println("Your sales commission ="+ salesAmount*20/100);
//        }
//        else if (salesAmount>=20000){
//            System.out.println("Your sales commission ="+ salesAmount*10/100);
//
//            }
//        else if (salesAmount>=10000){
//            System.out.println("Your sales commission ="+ salesAmount*2/100);
//        }
//
//    }
//}
////exercise-16
//class DiscountMatrix{
//
//    public static void main(String[] args) {
//        Scanner p =new Scanner(System.in);
//        System.out.println("Enter purchased quantity");
//        int pq =p.nextInt();
//        int totalCost;
//        totalCost= (pq*100)-(pq*100*10/100);
//
//
//        if(pq>1000){
//            System.out.println("Total cost of the goods will be " + totalCost);
//        }
//        else if (pq<1000){
//            System.out.println("You are not eligible to get discount your total cost will be "+ pq*100);
//        }
//
//    }
//
//}
////exercise-18
//
//class Shape{
//    public static void main(String[] args) {
//        Scanner p= new Scanner(System.in);
//        System.out.println("Please enter Length");
//        double lenght=p.nextDouble();
//        System.out.println("Please enter breadth or width");
//        double width= p.nextDouble();
//        if(lenght==width){
//            System.out.println("The shape of the object is Square");
//        }
//        else {
//            System.out.println("The shape of the object is not Square");
//        }
//
//    }
//}
////exercise-19
//
//class Bonus {
//    public static void main(String[] args) {
//        Scanner p= new Scanner(System.in);
//        System.out.println("Please enter your basic salary");
//        double salary=p.nextDouble();
//        System.out.println("Enter number of years of service");
//        int years=p.nextInt();
//        double bonus= salary*5/100;
//
//        if (years>=5){
//            System.out.println("Your net bonus is "+ bonus );
//        }
//        else{
//            System.out.println("You are not eligible for bonus");
//        }
//
//    }
//}
////exercise-20
//
//class Attendence{
//    public static void main(String[] args) {
//        Scanner p = new Scanner(System.in);
//        System.out.println("Please enter the total number of class held ");
//        int totalClass=p.nextInt();
//        System.out.println("Please enter the number of class arrendde");
//        int attendedClass=p.nextInt();
//
//        int percentage;
//        percentage= attendedClass*100/totalClass;
//        if(percentage>=75){
//            System.out.println("Your percentage of attendance is  "+ percentage+ " % " + "and  You are eligible to sit in the exam");
//        }
//        else if (percentage<75){
//            System.out.println("Your percentage of attendance is  " + percentage+ " % " +"and  You are not eligible to sit in the exam");
//        }
//
//
//    }
//}
////exercise-10
//class City_name{
//    public static void main(String[] args) {
//        Scanner p= new Scanner(System.in);
//        System.out.println("Enter sny alphabet from a to f");
//        String city=p.next();
//
//        if(city.equalsIgnoreCase("a")){
//            System.out.println("City name is Ahmedabad");
//
//        }
//        else if (city.equalsIgnoreCase("b")){
//            System.out.println("City name is Baroda");
//        }
//        else if (city.equalsIgnoreCase("c")){
//            System.out.println("City name is Chennai");
//        }
//        else if (city.equalsIgnoreCase("d")){
//            System.out.println("City name id Delhi");
//        }
//        else if (city.equalsIgnoreCase("e")){
//            System.out.println("City name is Edinbouragh");
//        }
//        else if (city.equalsIgnoreCase("f"
//        )) {
//            System.out.println("City name is Florida");
//        }
//
//            else {
//                System.out.println("Invalid data ");
//            }
//
//
//    }
//}
////exercise-13
//class Meths{
//
//    public static void main(String[] args) {
//        Scanner p= new Scanner(System.in);
//        System.out.println("Enter value 1");
//        int a=p.nextInt();
//        System.out.println("Enter value 2");
//        int b=p.nextInt();
//
//        System.out.println("Enter arithmetic operator symbol for desire action");
//        char s=p.next().charAt(0);
//
//        if(s=='+'){
//            System.out.println(a+b);
//        }
//        else if (s=='-'){
//            System.out.println(a-b);
//        }
//        else if (s=='*'){
//            System.out.println(a*b);
//        }
//        else if (s=='/'){
//            System.out.println(a/b);
//
//        }
//        else {
//            System.out.println("Invalid input");
//        }
//
//
//
//    }
//}
////exercise-14
//class Number_alphabate_symbol{
//    public static void main(String[] args) {
//        Scanner p= new Scanner(System.in);
//
//        System.out.println("Enter Number or alphabet or symbol ");
//        Character c=p.next().charAt(0);
//        if (Character.isAlphabetic(c)){
//            System.out.println("Added input is Alphabet");
//        }
//        else if(Character.isDigit(c)){
//            System.out.println("Added input is Digit");
//        }
//        else{
//            System.out.println("Added input is Symbol");
//        }
//    }
//}
////exercise-15
//
//class Day_name{
//    public static void main(String[] args) {
//        Scanner p=new Scanner(System.in);
//
//        System.out.println("Enter any digit 1-7");
//
//        int a=p.nextInt();
//
//        if(a==1){
//            System.out.println("This is Monday");
//
//        }else if(a==2){
//            System.out.println("This is tuesday");
//        }
//        else if(a==3){
//            System.out.println("This is wednesday");
//        }
//        else if(a==4){
//            System.out.println("This is thursday");
//        }
//        else if(a==5){
//            System.out.println("This is friday");
//
//        }
//        else if (a==6){
//            System.out.println("This is saturday");
//        }
//        else if (a==7){
//            System.out.println("This is sunday");
//        }
//    }
//}
////exercise-2
//class LeapYear {
//    public static void main(String[] args) {
//        Scanner p= new Scanner(System.in);
//        int year= p.nextInt();
//
//        System.out.println("Enter any year");
//
//        if((year%400==0)&&(year%100 !=0)|| (year%4==0)){
//            System.out.println("This is leap year");
//        }
//        else {
//            System.out.println("This is not leap year");
//        }
//    }
//}
////exercise 12
//class Upper_lower_case{
//    public static void main(String[] args){
//        Scanner p= new Scanner(System.in);
//        System.out.println("Enter any alphabet");
//        Character c= p.next().charAt(0);
//        if(Character.isLowerCase(c)){
//            System.out.println("This alphabet is in lower case");
//        }
//        else if (Character.isUpperCase(c)){
//            System.out.println("This alphabet is in upper case");
//        }
//    }
//}
////exercise 17
//class Vowel_consonant{
//    public static void main(String[] args) {
//        Scanner p= new Scanner(System.in);
//        System.out.println("Enter a single character");
//  //char c= p.next().charAt(0);
////Character c=p.next().charAt(0);
//
//String c=p.next();
//
//
//
//
//    if(c.contains("a")){
//        System.out.println("This is vowel");
//    }
//    else if (c.contains("e")){
//        System.out.println("This is vowel");
//    }else if (c.contains("i")){
//        System.out.println("This is vowel");
//    }
//    else if (c.contains("o")){
//        System.out.println("This is vowel");
//    }
//    else if (c.contains("u")){
//        System.out.println("This is vowel");
//    }
//
//
//    else{
//        System.out.println("This is consonant");
//    }
//    }
//
//}