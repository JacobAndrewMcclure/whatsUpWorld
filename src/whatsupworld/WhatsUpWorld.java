// Author: Jacob Andrew McClure // Origin: 4/19/2018
package whatsupworld;

import java.util.Scanner;

public class WhatsUpWorld
{

    public static void main(String[] args)
    {
        // initialize variable
        String userName;
        
        // scanner for user input
        Scanner sc = new Scanner(System.in);
        
        // system prompt for user name
        System.out.println("Enter your name: ");
        userName = sc.nextLine();
        
        // print out with user name and welcome message
        System.out.println("Whats up " + userName + "! Welcome to Java!");
    }
    
}
