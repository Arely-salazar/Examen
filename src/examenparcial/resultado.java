/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial;

/**
 *
 * @author Jairo
 */
public class resultado {
    
     public static void main(String[] args) {
        
        Examenparcial exa = new Examenparcial("Meet", 30, 10, "libre", 2);
        System.out.println(exa.calidad());
        System.out.println("");
        System.out.println(exa.toString());
        
    }
}
