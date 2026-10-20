/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/** This class takes user status input 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * uses enums which avoids String input 
 * then prints the status details. 
 * @author srinivsi 
 * @author marcus podnar
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user status code (zero,one,two,three):");
        String code = in.next();
        
        StausUser t = new StausUser();
        
        try 
        {
            StausUser.UserStatus status = StausUser.UserStatus.valueOf(code.toUpperCase());
            t.statusDetail(status);
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println("NOT VALID CODE");
        }
        
        System.out.println("\nAll user statuses:");
        t.printAllStatuses();
    }
}