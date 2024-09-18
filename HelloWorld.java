package helloworld;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Hello World: ");
        String key = scan.nextLine();
        
        if (key.equals("Hello World")) {
            System.out.println("Output: " + key);}
        else {
     System.out.print("Invalid input, please enter 'Hello World'");
    }
    } 
}

