package com.example;
import  java.util.Scanner;

/**
 * Hello world!
 *
 */
 class mathop{
    public static double add(double a,double b){
        return a+b;
    }
}
class instance_method_check{
     private  String name;
     public instance_method_check(String name){
         this.name=name;
     }
     public void introduce(){
         System.out.println("Hello my name is "+name);
     }
}
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Gokul check proper working of java" );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Get the first number");
        double num1= scanner.nextDouble();
        System.out.println("Get the Second Number");
        double num2=scanner.nextDouble();
        double sum =num1+num2;
        System.out.println(sum);
        System.out.println("By adding Function into it");
        double result=mathop.add(num1,num2);
        System.out.print(result);
        System.out.println("Read instance function using object");
        instance_method_check obj =new instance_method_check("GOkul Das K");
        obj.introduce();
    }
}
