/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;
/**
 *
 * @author thmun
 */
public class HelloWorld {
    private static boolean running = false;
    private static String name = "Thomas";
    private static String othername = "Emil";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello there, I'm a Java Program \t hei");
        
        running = true;
        drawMenu();
    }
    
    /**
     * Draws the menu for this application
     */
    public static void drawMenu() {
        Scanner input = new Scanner(System.in);
        String in;
        
        while(running) {
            System.out.println();
            System.out.println("Choose an option");
            for(int i=1; i<8; ++i) {
                if(i==5) continue;
                System.out.println(i+": Task "+i);
            }
            
            for(int n=1; n<10; ++n) {
                System.out.println("2."+n+" Sheet 2, Task " + n);
            }
            System.out.println("p: Print primes (primes)");
            System.out.println("x. Exit (exit)");
            
            in = input.next();
            System.out.println();
            System.out.println("----------------------------------------");
            
            switch(in) {
                case "1":
                    helloWorld();
                break;
                
                case "2":
                    Task2();
                break;
                
                case "3":
                    Task3();
                break;
                
                case "4":
                    Task4();
                break;
                
                case "6":
                    Task6();
                break;
                
                case "7":
                    Task7();
                break;
                
                case "8":
                    Task8();
                break;
                
                case "2.1":
                    Task2_1();
                break;
                
                case "2.2":
                    Task2_2();
                break;
                
                case "2.3":
                    Task2_3();
                break;
                
                case "2.4":
                    Task2_4();
                break;
                
                case "2.5":
                    Task2_5();
                break;
                
                case "2.6":
                    Task2_6();
                break;
                
                case "2.7":
                    Task2_7();
                break;
                
                case "p":
                case "primes":
                    printPrimes();
                break;
                default:
                    System.out.println("No such option");
                break;
                
                case "x":
                case "exit":
                    running = false;
                break;
            }
            
            if(in.equals("x")) {
                running = false;
            } else {
                System.out.println();
                System.out.println("Press enter to continue...");
                try {
                    System.in.read();
                } catch(Exception e) {}
            }
        }
    }
    
    /**
     *
     */
    public static void printPrimes() {
        for(int i=1; i<100; i++) {
            if(i == 29 || i==59 || i==61)
                continue;
            
            if(isPrime(i))
                System.out.println(i);
        }
    }
    
    // All primes can be expressed as (6k + i)
    /**
     * 
     * @param n
     * @return 
     */
    public static boolean isPrime(int n) {
        if(n <= 1)
            return false;
        else if(n <= 3)
            return true;
        else if(n % 2 == 0 || n % 3 ==0)
            return false;
        
        double i = 5;
        while(Math.pow(i, 2) <= n) {
            if(n % i == 0 || n % (i + 2) == 0)
                return false;
            i = i+6;
        }
        return true;
    }
    
    /**
     *
     */
    public static void helloWorld() {
        System.out.println("Hello World");
    }
    
    /**
     *
     */
    public static void Task2() {
        helloWorld();
        helloWorld();
    }
    
    /**
     *
     */
    public static void Task3() {
        System.out.println("Jeg skriver mitt første java-");
        System.out.println("program, og dette er gøy!");
    }
    
    /**
     *
     */
    public static void Task4() {
        System.out.println("Hei, jeg heter " + name);
    }
    
    /**
     *
     */
    public static void Task6() {
        System.out.println("Jeg heter "+name+" og jeg lærer java");
    }
    
    /**
     *
     */
    public static void Task7() {
        System.out.println("Jeg heter " + name + " og naboen min heter " + othername);
    }
    
    /**
     *
     */
    public static void Task8() {
        for(int i=0; i<10; i++)
            Task7();
    }
    
    /**
     *
     */
    public static void Task2_1() {
        for(int i=1; i<10; ++i)
            System.out.print(i);
    }
    
    /**
     *
     */
    public static void Task2_2() {
        int solution;
        for(int table = 1; table <= 10; ++table) {
            System.out.println();
            for(int i=1; i<=10; i++) {
                solution = table * i;
                System.out.print(solution + "\t");
            }
        }
    }
    
    /**
     *
     */
    public static void Task2_3() {
        System.out.println(factorial(5));
    }
    
    /**
     *
     * @param n
     * @return
     */
    public static int factorial(int n) {
        int f = n;
        for(int i=1; i<n; i++) {
            f *= i;
        }
        return f;
    }
    
    /**
     *
     */
    public static void Task2_4() {
        int integer = 3;
        float decimal = 3;
        
        System.out.println("Integer calculation: " + (integer / 2));
        System.out.println("Decimal calculation:" + (decimal / 3));
        
        System.out.println("Integers are whole numbers without any decimal-points");
        System.out.println("Float is floating point numbers that can contain a decimal value");
    }
    
    /**
     *
     */
    public static void Task2_5() {
        for(int i=0; i<=10; i++) {
            System.out.println(i % 3);
        }
    }
    
    /**
     *
     */
    public static void Task2_6() {
        System.out.println();
        for(int i=1; i<=30; i++) {
            if(i % 2 == 0 || i % 3 == 0) {
                System.out.print(i+",");
            }
        }
        System.out.println();
    }
    
    /**
     *
     */
    public static void Task2_7() {
        int terning1 = (int)Math.floor(Math.random() * 6 + 1);
        int terning2 = (int)Math.floor(Math.random() * 6 + 1);
        
        while(terning1 != terning2) {
            terning1 = (int)Math.floor(Math.random() * 6 + 1);
            terning2 = (int)Math.floor(Math.random() * 6 + 1);
        }
        
        System.out.println("terning1: " + terning1 + ", terning2: " + terning2);
    }
}
