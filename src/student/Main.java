package student;

import java.util.Scanner;

public class Main
{
    
    
    public static void main(String[] args)
    {   
        Scanner scanner = new Scanner(System.in);
   
    	System.out.println("Please enter the group size:");
        
        int size = scanner.nextInt();
        Group group = new Group(size);
        
        int input_number;
        String input_name, input_surname;
        for(int s = 0; s < size; s++)
        {
            System.out.println("Please enter a student:");
            input_number    = scanner.nextInt();
            input_name      = scanner.next();
            input_surname   = scanner.next(); 

            group.addStudent(new Student(input_name, input_surname, input_number));
        }
     
        System.out.println("The group now contains:");
        System.out.println(group);
        
        
        

        input_number = 0;
        while(input_number != -1)
        {
            System.out.println("Student number and new given/family name?");
            input_number    = scanner.nextInt();
            if(input_number != -1)
            {
                input_name      = scanner.next();
                input_surname   = scanner.next(); 
                group.editStudent(input_number, input_name, input_surname);

                System.out.println("The group now contains:");
                System.out.println(group);
            }
            else System.out.println("Bye!");
        }
    }
}
