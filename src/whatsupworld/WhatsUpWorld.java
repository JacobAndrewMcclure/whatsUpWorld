// Author: Jacob Andrew McClure // Origin: 4/19/2018
package whatsupworld;

import java.util.Scanner;

public class WhatsUpWorld
{

    public static void main(String[] args)
    {
        String userName;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        userName = sc.nextLine();
        
        System.out.println("Whats up " + userName + "! Welcome to Java!");
    }
    
}
