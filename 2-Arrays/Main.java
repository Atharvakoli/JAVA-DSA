import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        SingleDimensionalArray sda = new SingleDimensionalArray(10);

        // if an element is empty then its value is considered as -2 to the power of 31

        // sda.insert(0, 1);
        // sda.insert(1, 10);
        // sda.insert(2, 20);
        // sda.insert(3, 30);
        // sda.insert(4, 40);
        // sda.insert(5, 50);
        // sda.insert(6, 60);
        // sda.insert(7, 70);
        // sda.insert(8, 80);
        // sda.insert(9, 90);
        // sda.insert(2, 110);
        // sda.insert(12, 333);

        // Accessing array element

        // int firstElement = sda.arr[0];
        // System.out.println(firstElement);
        // int thirdElement = sda.arr[3];
        // System.out.println(thirdElement);

        //Array Traversal
        // sda.traversalArray();

        //Finding Array Element
        // sda.searchInArray(30);
        // sda.searchInArray(80);

        // Deleting Array Element
        // sda.deleteValue(6);
        // System.out.println(sda.arr[6]);
        // sda.traversalArray();



        // Two dimensioanal
        // Creating an empty array -> TC -> O(1) -> O(mn)
        // Inserting a value in an array -> TC -> O(1) -> O(1)
        // Accessing a given cell -> TC -> O(1) -> O(1)
        // Searching a given value -> TC -> O(mn) -> O(1)
        // Traversing a given array -> TC -> O(mn) -> O(1)
        // Deleteing a given value -> TC -> O(1) -> O(1)


        //Declare
        int[][] twoDArray;
        // Instantiate
        twoDArray = new int[2][2];
        // Initialize -> O(mn)
        twoDArray[0][0] = 1;
        twoDArray[0][1] = 2;
        twoDArray[1][0] = 3;
        twoDArray[1][1] = 4;

        // System.out.println(Arrays.deepToString((twoDArray)));

        String s2DArray[][] = {{"A", "B"}, {"C", "D"}}; // O(1)

        // System.out.println(Arrays.deepToString(s2DArray));

        // Insertion // row -> m, column -> n
        int row = 3, col = 3;
        TwoDimensionalArray tda = new TwoDimensionalArray(row, col);

        tda.insertValueInTheArray(0, 0, 10);
        tda.insertValueInTheArray(0, 1, 20);
        tda.insertValueInTheArray(0, 2, 30);
        tda.insertValueInTheArray(1, 0, 40);
        tda.insertValueInTheArray(1, 1, 50);
        tda.insertValueInTheArray(1, 2, 60);
        tda.insertValueInTheArray(2, 0, 70);
        tda.insertValueInTheArray(2, 1, 80);
        tda.insertValueInTheArray(2, 2, 90);


        // System.out.println(Arrays.deepToString(tda.arr));
        // tda.traverse2DimensionalArray();

        // Accessing an element of two dimensional array
        // a[i][j] = i is row index and j is colum index
        // tda.accessCell(3, 4);

        // Traversing the 2D array
        tda.traverse2DimensionalArray();

        // Seraching in 2D Array
        tda.searchingValue(601);

        // Deleting 2D array
       System.out.println(Arrays.deepToString(tda.arr));
       tda.deleteValueFromArray(0, 1);
       System.out.println(Arrays.deepToString(tda.arr));


        
    }
}
