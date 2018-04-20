/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsupworld;

import java.util.Scanner;

/**
 *
 * @author jacob
 */
public class WhatsUpWorld
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String userName;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        userName = sc.nextLine();
        
        System.out.println("Hello " + userName + " welcome to Java!");
    }
    
}
