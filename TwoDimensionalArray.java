public class TwoDimensionalArray {
    private int[][] array;
    private int rows;
    private int cols;

    // Constructor to initialize the 2D array with a given number of rows and columns
    public TwoDimensionalArray(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.array = new int[rows][cols];
    }

    // Method to insert a value at a specific row and column
    public void insert(int row, int col, int value) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IndexOutOfBoundsException("Row or Column index out of bounds");
        }
        array[row][col] = value;
    }

    // Method to delete a value at a specific row and column
    public void delete(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IndexOutOfBoundsException("Row or Column index out of bounds");
        }
        array[row][col] = 0; // Reset the value to 0 (or use a more suitable sentinel value)
    }

    // Method to traverse and print the 2D array row-wise
    public void traverseRowWise() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to traverse and print the 2D array column-wise
    public void traverseColumnWise() {
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

/*Using*/
public class Main {
    public static void main(String[] args) {
        TwoDimensionalArray arr = new TwoDimensionalArray(3, 3);

        // Inserting values into the array
        arr.insert(0, 0, 1);
        arr.insert(0, 1, 2);
        arr.insert(0, 2, 3);
        arr.insert(1, 0, 4);
        arr.insert(1, 1, 5);
        arr.insert(1, 2, 6);
        arr.insert(2, 0, 7);
        arr.insert(2, 1, 8);
        arr.insert(2, 2, 9);

        // Traversing row-wise
        System.out.println("Row-wise Traversal:");
        arr.traverseRowWise();

        // Traversing column-wise
        System.out.println("Column-wise Traversal:");
        arr.traverseColumnWise();

        // Deleting a value
        arr.delete(1, 1); // Delete the value at (1, 1)

        // Traversing after deletion
        System.out.println("After Deletion (Row-wise Traversal):");
        arr.traverseRowWise();
    }
}
