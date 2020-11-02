public class Switch4 
{
	
    public static void main (String[] args)
    {
        int day = IBIO.inputInt("Enter a number (1-7): ");
        String name;
        switch( day )

        {
            default:
            name = "error";
            break;
            
        case 1:
            name = "Monday";
            break;
        
        case 2:
            name = "Tuesday";
            break;
        
        case 3:
            name = "Wednesday";
            break;
        
        case 4:
            name = "Thursday";
            break;

        case 5:
            name = "Friday";
            break;

        case 6:
            name = "Saturday";
            break;

        case 7:
            name = "Sunday";
            break;
        }
    System.out.println(day + " = " + name);
    }
}