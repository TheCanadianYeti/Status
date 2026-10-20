/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * 
 * Benefits of using Enum:
 * 1. Type Safety: Enforces valid status values at compile time, eliminating invalid inputs or typos.
 * 2. Built-in Iteration: Provides the values() method to iterate over all constants directly.
 * 3. Maintainability: Groups fixed status constants into a single, self-documenting structure.
 * 4. Extensibility: New statuses can be added by declaring a new constant without altering procedural logic.
 * 
 * @author srinivsi
 * @author marcus podnar
 */
public class StausUser 
{
    public enum UserStatus {
        ZERO, ONE, TWO, THREE
    }

    public void statusDetail(UserStatus status)
    {
        switch(status)
        {
            case ZERO: 
                System.out.println("REJECTED");
                break;
            case ONE: 
                System.out.println("PENDING");
                break;
            case TWO: 
                System.out.println("PROCESSING");
                break;
            case THREE: 
                System.out.println("APPROVED");
                break;
        }
    }

    public void printAllStatuses()
    {
        for (UserStatus status : UserStatus.values())
        {
            statusDetail(status);
        }
    }
}