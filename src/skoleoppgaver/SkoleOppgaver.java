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
                    //e.printStackTrace(); // For debug purposes
                }
            }
        }
    }
}
