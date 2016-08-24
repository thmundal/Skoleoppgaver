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
public class util {
    public static int factorial(int n) {
        int k = n;
        for(int i = 1; i<n; i++) {
            k *= i;
        }
        return k;
    }
}
