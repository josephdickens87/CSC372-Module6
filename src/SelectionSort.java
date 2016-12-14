import java.util.*;

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
            namesArrayList.add(input);
        }

        // assignment said ten names, so this is to limit input amount
        while(namesArrayList.size()<10);

        // print the original array list
        System.out.println(namesArrayList);

        //convert ArrayList to an Array, then initialize it
        String[] namesArray = new String[namesArrayList.size()];
        namesArray = namesArrayList.toArray(namesArray);

        // selection sort it
        selectionSorter(namesArray);

        // print the array out after being sorted
        System.out.println(Arrays.toString(namesArray));
    }


    public static void selectionSorter(String[] array)
    {
        for (int i = 0; i < array.length - 1; ++i)
        {
            int minIndex = i;

            for (int j = i + 1; j < array.length; ++j)
            {

                if (array[j].compareTo(array[minIndex]) < 0)
                {
                    minIndex = j;
                }
            }

            String temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}