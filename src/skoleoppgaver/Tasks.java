/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skoleoppgaver;

/**
 *
 * @author Thomas
 */
public class Tasks {
    public static String name = "Thomas";
    public static String othername = "Emil";
    
    public static void Task1() {
        System.out.println("Hello World");
    }
    
    public static void Task2() {
        Task1();
        Task1();
    }
    
    public static void Task3() {
        System.out.println("Jeg skriver mitt første java-");
        System.out.println("program, og dette er gøy!");
    }
    
    public static void Task4() {
        System.out.println(name);
    }
    
    public static void Task5() {
        System.out.println("Jeg heter "+name+" og jeg lærer java!");
    }
    
    public static void Task6() {
        System.out.println("Jeg heter "+name+" og naboen min heter "+othername);
    }
    
    public static void Task7() {
        for(int i=0; i<10; i++) {
            Task6();
        }
    }
    
    public static void Task2_1() {
        for(int i=1; i<=10; i++)
            System.out.println(i);
    }
    
    public static void Task2_2() {
        int n = 0;
        for(int table = 1; table <= 10; ++table) {
            System.out.println();
            for(int i = 1; i <= 10; ++i) {
                System.out.print(table * i + "\t");
            }
        }
        System.out.println();
    }
    
    public static void Task2_3() {
        System.out.println(util.factorial(5));
    }
    
    public static void Task2_4() {
        int integer = 3;
        float decimal = 3;
        
        System.out.println(integer / 2);
        System.out.println(decimal / 2);
        
        System.out.println("Integer value is a whole number");
        System.out.println("Float value is a decimal number");
    }
    
    public static void Task2_5() {
        for(int i=0; i<=10; i++) {
            System.out.println(i % 3);
        }
        
        System.out.println("Kan brukes til å gjøre operasjoner i diverse intervaller, for annenhver, tredjehver osv. Eller kalkulere primtall");
    }
    
    public static void Task2_6() {
        for(int i=1; i<30; i++) {
            if(i % 2 == 0 || i % 3 == 0)
                System.out.println(i + ",");
        }
        System.out.println();
    }
}
