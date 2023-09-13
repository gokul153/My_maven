package com.example;
import  java.util.Scanner;

/**
 * Hello world!56
 *
 */
class Bank_CEO{
    String operation_head;
    String Technical_head;
     protected void fun_ceo(){

         System.out.println("Runs both operation and technical");
    }
    private  void call_ceo(){
         System.out.println("Call for Ceo is requested");
    }


}
class  operation extends Bank_CEO{
    String BankManger;
    String marketing_head;
    void fun_oper(){
        System.out.println("Runs the backend and frontend of the bank");
    }
}
class technical_head extends  operation{
    String technical_head;
    void fun_technicalhead(){
        System.out.println("Run the cyber security and change the bank");
    }
}

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
    public static String encrypt(String data, int key){
        StringBuilder encrypted = new StringBuilder();

        for (char c : data.toCharArray()) {
            int asciiValue = (int) c;
            int encryptedValue = asciiValue + key + 72;
            encrypted.append((char) encryptedValue);
        }

        return encrypted.toString();

}
    public static String decrypt(String data, int key) {
        StringBuilder decrypted = new StringBuilder();

        for (char c : data.toCharArray()) {
            int asciiValue = (int) c;
            int decryptedValue = asciiValue - key - 72;
            decrypted.append((char) decryptedValue);
        }

        return decrypted.toString();
}


    public static void main( String[] args )
    {

       /// Encryption and Decryption
        Scanner scanner = new Scanner(System.in);
        int key;

        System.out.print("Enter the key value: ");
        while (true) {
            if (scanner.hasNextInt()) {
                key = scanner.nextInt();
                if (key >= 100) {
                    break; // Key is valid
                } else {
                    System.out.println("Key must be >= 100. Please enter a valid key:");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer key:");
                scanner.next(); // Consume invalid input
            }
        }
        String originalData;
        System.out.print("Enter the data to encrypt: ");
        originalData = scanner.next();
        String encryptedData = encrypt(originalData, key);
        System.out.println("Encrypted Data: " + encryptedData);

        // Decrypt the data
        String decryptedData = decrypt(encryptedData, key);
        System.out.println("Decrypted Data: " + decryptedData);

        scanner.close();



        System.out.println("Read instance function using object");
        instance_method_check obj =new instance_method_check("GOkul Das K");
        obj.introduce();
        Bank_CEO ceo_obj= new Bank_CEO();


        operation opr_obj=new operation();
        System.out.println("Operation Lead trying to call");
        opr_obj.fun_ceo();
        technical_head tech_obj=new technical_head();
        System.out.println("Technical lead trying to call");
        //tech_obj.call_ceo();

    }
}
