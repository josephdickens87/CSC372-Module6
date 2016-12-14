/*
Joseph Dickens
Programming II

This program impliments 2 methods, both of which are selction sort methods.
One method will assort userinput, in alphabetical (ascending order)
The other method will sort in reverse alphabetical (desscending order)

This program has only one class, the main method simply tests 
functionality of the sorting methods
*/

// import java utilities
import java.util.*;

// create class
public class SelectionSort
{

    //main method to test the selectionSorter method
    public static void main(String args[])
    {

        // declare and initialize an array list
        ArrayList<String> namesArrayList = new ArrayList<>();

        // create a Scanner object
        Scanner in = new Scanner(System.in);

        // prompt user for name input
        do
        {
            System.out.println("Please input a name, and press enter.");                    
            String input = in.nextLine();
            
            // user input validation to accepts letters only
            if (!input.matches("\\p{Alpha}*"))
            
            {
            System.out.println("Please input a name only, try again.\n");
            }
            
            // if input is letters only, add to array list
            else namesArrayList.add(input);
        }
        
        // assignment said ten names, so this is to limit input amount
        while(namesArrayList.size()<10);

        // print the original array list as inputed for 
        // debugging and comparison
        System.out.println("You entered:\n" +namesArrayList +"\n");

        // selection sort alphabetical order (ascending
        selectionSortAscend(namesArrayList);
        
        // print results after ascending order sort
        System.out.println("After sorting alphabetical order :\n");
        namesArrayList.forEach(s -> System.out.println(s));
        
        
        // sort in reverese alphabetical order (desscending)
        selectionSortDesscend(namesArrayList);
        
        // print results after desscending order sort
        System.out.println("\nAfter sorting reverse alphabetical order :\n");
        namesArrayList.forEach(s -> System.out.println(s));
                
    }

    // method to use selection sort for alphabeticla order
    public static void selectionSortAscend(ArrayList<String> array)
    {
        // for loop to loop through array elements
        for (int i = 0; i < array.size() - 1; i++)
        {
            // assume first element is minimum
            int minIndex = i;
            
            // for loop to loop through elements that have not been sorted
            for (int j = i + 1; j < array.size(); j++)
            {
                // if statement to compare elements for swap.
                if (array.get(j).compareTo(array.get(minIndex)) < 0)
                {
                    minIndex = j;
                }
            }
            
            // variables for method.
            String temp = array.get(i);
            array.set(i,array.get(minIndex));
            array.set(minIndex,temp);
        }
    }

   /* 
   method to use selection sort for reverse alphabeticla order
   Everything is the same for this method as the ascending order,
   except that I have replaced "min" with "max" and replaced "<"
   with ">".
   */   
   public static void selectionSortDesscend(ArrayList<String> array)
    {
        for (int i = 0; i < array.size() - 1; i++)
        {
            int maxIndex = i;

            for (int j = i + 1; j < array.size(); j++)
            {
                // switched "<" with ">" in this line.
                if (array.get(j).compareTo(array.get(maxIndex)) > 0)
                {
                    maxIndex = j;
                }
            }

            String temp = array.get(i);
            array.set(i,array.get(maxIndex));
            array.set(maxIndex,temp);
        }
    }
}

   