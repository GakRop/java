import java.util.*;  
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Welcome to Lab 5\n");
    int result = 1;
    do{
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        System.out.print("\n"); 
        
        System.out.println("Choose an option from the list below\n");
        System.out.println("i.e, if you want to execute option 1, type '1'\n");
        System.out.println("Option 1: Letter counter");
        System.out.println("Option 2: Word counter" );
        System.out.println("Option 3: Remove spaces");
        System.out.println("Option 4: Change the sentence");
        System.out.println("Option 5: Exit command\n");
        
        Scanner SC= new Scanner(System.in);
        System.out.print("Enter the option: "); 
        int command = SC.nextInt();
        System.out.print("\n"); 
               
        if (command == 1)
        {Method op = new Method(str);
        result = op.option1();
        }
            
        else if (command == 2)
        {Method op = new Method(str);
        result = op.option2();
        }
            
        else if (command == 3)
        {Method op = new Method(str);
        result = op.option3();
        }
            
        else if (command == 4)
        {Method op = new Method(str);
        result = op.option4();
        }
    
        else if (command == 5)
        {Method op = new Method(str);
        result = op.option5();
        }
        
        else
        {System.out.println("You entered a wrong command\n");}
        }while(result == 1);
    }
}
//back slash n = \n