/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skoleoppgaver;
import java.util.Scanner;
import java.lang.reflect.Method;
/**
 *
 * @author Thomas
 */
public class SkoleOppgaver {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Type the name of the task to run, then press [enter]: ");
        System.out.println("Enter \"list\" for tasks, \"exit\" to quit :)");
        
        Scanner in = new Scanner(System.in);
        
        String input = "";
        while(!input.equals("exit")) {
            input = in.next();
            
            if(input.equals("list")) {
                System.out.println("List all available options");
                
                Method[] methods = Tasks.class.getDeclaredMethods();
                for(int i=0; i<methods.length;i++) {
                    System.out.println(methods[i].getName());
                }
            } else {
                try {
                    Tasks.class.getDeclaredMethod(input).invoke(null);
                } catch(Exception e) {
                    System.out.println("No task with this number");
                }
            }
        }
    }
    
    private static void primeTest(String input) {
        if(isNumeric(input)) {
            int n = Integer.parseInt(input);
            if(isPrime(n)) {
                System.out.println(input + " is a prime");
            } else {
                System.out.println(input + " is not a prime");
            }
        } else {
            System.out.println("Please enter a numeric value");
        }
    }
    
    /**
     * Check a number to see if it is a prime
     * @param n The number to check
     * @return boolean
     */
    public static boolean isPrime(int n) {
        if(n <= 1)
            return false;
        else if(n <= 3)
            return true;
        else if(n % 2 == 0 || n % 3 == 0)
            return false;
        
        double i = 5;
        while(Math.pow(i, 2) <= n) {
            if(n % 2 == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        
        return true;
    }
    
    /**
     * Check if a string is a numeric value
     * @param n The string to check
     * @return boolean
     */
    public static boolean isNumeric(String n) {
        try {
            Integer.parseInt(n);
        } catch(Exception e) {
            return false;
        }
        
        return true;
    }
}
