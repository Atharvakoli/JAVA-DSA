// import java.util.Arrays;

public class SingleDimensionalArray {
        
        //   int[] myArray;
        //  myArray = new int[3];//instantiation of an array
        //  myArray[0] = 2;
        //  myArray[1] = 4;
        //  myArray[2] = 6;

        //  System.out.println(Arrays.toString(myArray));

        //  String sArray[] = {"Hello", "Atharva", "Good"};

        //  System.out.println(Arrays.toString(sArray));

        // INSERTION
        

    int arr[] = null;

    public SingleDimensionalArray(int sizeOfArray) {
        arr = new int[sizeOfArray];

        for(int i = 0;i < arr.length;i++) {
            arr[i] = Integer.MIN_VALUE; // MIN_VALUE = -2147483648
        }
    }

    public void insert(int location, int valueToBeInserted) {
        try {
            if(arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
            } else  {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array..!");

        }
    }

     //Array Traversal
    public void traversalArray() {
       try {
         for(int i = 0; i < arr.length;i++) {
             System.out.print(arr[i] + " ");
         }
       } catch (Exception e) {
        System.out.println("Array no longer needed..!");
       }
    }

    //Search for an element in the given array
    public void searchInArray(int valueToSearch) {
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] == valueToSearch) {
                System.out.println("Value is found at the indexOf " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not Found");
    }

    public void deleteValue(int valueToBeDeleteThroughIndex) {
        try {
            arr[valueToBeDeleteThroughIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully from this index " + valueToBeDeleteThroughIndex);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Provided Index is not in range of array");
        }
    }

}
