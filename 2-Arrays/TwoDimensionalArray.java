public class TwoDimensionalArray {
    int arr[][] = null;


    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];

        for (int row = 0;row < arr.length;row++) {
            for (int col = 0;col < arr[0].length;col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertValueInTheArray(int row, int col, int valueToInsert) {
        try {
            if(arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = valueToInsert;
                // System.out.println("The value is inserted successfully at row " + row + " col " + col);
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }

    //Accessing cell value from given array
    public void accessCell(int row, int col) {
        System.out.println("\n Accessing Row# " + row + ", Col# " + col);
        try {
            System.out.println("Cell value is: " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Invalid index for 2D array");
        }
    }

    //Traversing 2D array
    public void traverse2DimensionalArray() {
        for (int row = 0;row < arr.length;row++) {
            // arr[0].length is for column
            for(int col = 0;col < arr[0].length;col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

        // Seraching in 2D Array
    public void searchingValue(int value) {
        for(int row = 0;row < arr.length;row++) {
            for(int col = 0;col < arr[0].length;col++) {
                if(arr[row][col] == value) {
                    System.out.println("The value is Found at row# " + row + ", col# " + col);
                    return;
                } 
            }
        }
        System.out.println(value + ", Value is not Found");
    }

        // Deleting 2D array
        public void deleteValueFromArray(int row, int col) {
            try {
                System.out.println("Successfully deleted: " + arr[row][col]);
                arr[row][col] = Integer.MIN_VALUE;
            } catch (ArrayIndexOutOfBoundsException e) {
               System.out.println("This index is not valid for array");
            }
        }

}
