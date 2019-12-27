import java.util.Scanner;
/**
 * Template for menu based Text user interfaces .
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextUITemplate
{
    // DECLARE SPECIFIC OBJECT HERE
    private Scanner keyboard;
    private Rectangle  rectangle;

    /**
     * Constructor for objects of class TextTU
     */
    public TextUITemplate() 
    {
        rectangle = new Rectangle(0,0);
        keyboard = new Scanner( System.in);
    }

    public void menu()
    { 
        int command = -1;
        createRectangle();
        while ( command != 0 )
        { 
            displayMenu();
            command = getCommand();
            execute( command );
        }
    }

    private void createRectangle()
    {
        int length = readIntWithPrompt
            ("Rectangle length (a non-negative integer):");

        int width = readIntWithPrompt
            ("Rectangle length (a non-negative integer):");

        rectangle = new Rectangle(length, width);

    } 

    private int readIntWithPrompt(String prompt)
    {
        System.out.print(prompt);
        int input = keyboard.nextInt();
        keyboard.nextLine();
        return input;
    }

    private void displayMenu()
    {

        System.out.println();
        System.out.println("Enter number denoting action to perform:");
        System.out.println("Display length....................[1]");
        System.out.println("Display breadth..................[2]");
        System.out.println("Display area.......................[3]");
        System.out.println("Display perimeter...............[4]");
        System.out.println("Create new rectangle.........[5]");
        System.out.println("Exit.....................................[0]");    
    }


    private int getCommand()
    {
        System.out.print ("Enter command: ");
        int command = keyboard.nextInt();
        return command;
    }

    private void execute( int command)
    {
        if ( command == 1)
            displayLength();
        else if ( command == 2 )
            displayBreadth();
        else if ( command == 3)
            displayArea();
        else if ( command == 4 )
            displayPerimeter();
        else if ( command == 5)
            createRectangle() ;
        else if ( command == 0)
        {            
            System.out.println( " Program closing down"); 
            System.exit(0);
        }
        else
            System.out.println("Unknown command"); 
        }
        
         private void displayLength()   {
        System.out.println( "The length is " + rectangle.getLength() );
    }
    private void displayBreadth()   {
        System.out.println( "The breadth is " + rectangle.getBreadth() );
    }
    private void displayArea()   {
        System.out.println( "The area is " + rectangle.calculateArea() );
    }
    private void displayPerimeter()   {
        System.out.println( "The perimeter is " + rectangle.calculatePerimeter() );
    }
    }    

