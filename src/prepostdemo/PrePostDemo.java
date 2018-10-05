/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepostdemo;

/**
 *
 * @author Oktawian
 */
public class PrePostDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int i = 3;
        i++;
        System.out.println(i);
        
        ++i;
        System.out.println(i);
        
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
    }
    
}
