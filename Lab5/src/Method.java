import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Method {
    public String sentence;
    
    public Method (String sentence)
    {
    this.sentence = sentence;
    }
    
    public int option1()
    {this.sentence = this.sentence.toLowerCase();
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a letter you would like to count in lower case: ");
    char letter = sc.next().charAt(0);
    System.out.print("\n");  
    
    int occurrence = 0;
    char[] ch = new char[this.sentence.length()];
    for (int i = 0; i < this.sentence.length(); i++)
    {ch[i] = this.sentence.charAt(i);}
        
    for (char c : ch) 
    {if (c == letter)
    {occurrence = occurrence + 1;}}
        
    System.out.println("The letter '"+letter+"' occurs "+occurrence+" times.\n");
    return 1;}
    
    public int option2()
    {
    int count = 0;
    String[] arrSplit = this.sentence.split("\\s+");
    for (int i = 0; i < arrSplit.length; i++)
    {if (arrSplit[i] == null)
        count = count + 0;
     
    else
        count = count + 1;}
    System.out.println("This sentence has "+count+" words.\n");    
    return 1;
    }
    
    public int option3()
    {
    this.sentence = this.sentence.replaceAll("\\s+","");
    System.out.println(this.sentence+"\n");
    return 1;
    }
    
    public int option4()
    {
    System.out.println("Do you want to try another sentence?");
    System.out.println("Try it.\n");
    return 1;
    }
    
public Method(){}
    public int option5()
    {System.out.println("Exit command will be executed.");
    System.out.println("Thank you!!");
    return 0;}
    
}
