public class MyMain {

    // Returns the number of odd numbers in mat
    public static int countOdds(int[][] mat) {
        int odd = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] % 2 != 0) {
                    odd++;
                }
            }
        }
        return odd;
    }

    // Returns the largest value in mat
    public static int findLargest(int[][] mat) {
        int big = mat[0][0];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] > big) {
                    big = mat[row][col];
                }
            }
        }
        return big;
    }

    // Write a method that "left-shifts" each row in a 2D array.
    // This means that for each row, all the numbers should be
    // shifted to the left by 1, with wraparound (the first value
    // should wrap around to the last entry in the row)
    public static int[][] leftShift(int[][] mat) {
        for (int row = 0; row < mat.length; row++) {
            int row1 = mat[row][0];
            for (int col = 0; col < mat[0].length; col++) {
                if (col == mat[row].length - 1) {
                    mat[row][col] = row1;
                } else {
                    mat[row][col] = mat[row][col + 1];

                }
            }
        }
        return mat;
    }


    // Creates a new array list of size arraySize x arraySize
    // where each value is each to the sum of its row and col indexes
    public static int[][] arrayBuilder(int arraySize) {
        int[][] mat = new int[arraySize][arraySize];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                mat[row][col] = row + col;
            }

        }
        return mat;
    }


    // Methods for the homework:

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        int counter = 0;
        double num = 0;
        double mean = 0;
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                num = num + mat[row][col];
                counter++;
            }
        }
        mean = num/counter;
        return mean;
    }

    // Returns the median of the 2D array mat
    // Remember that the array is sorted!
    public static double median(double[][] mat) {
        double median = 0;
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                if(mat.length % 2 == 0){
                    int length = mat.length/2;
                    median = mat[length - 1][mat[0].length - 1] + mat[length][0] / 2;
                }
                else if(mat.length % 2 != 0 && mat[0].length % 2 == 0){
                    int length = mat.length/2;
                    int clength = mat[0].length / 2;
                    median = mat[length + 1][clength] + mat[length + 1][clength + 1] / 2;
                }
                else if(mat.length % 2 != 0 && mat[0].length % 2 != 0){
                    int length = mat.length/2;
                    int clength = mat[0].length / 2;
                    median = mat[length + 1][clength + 1];
                }
            }
        }
        return median;
    }


    // Returns the mode of the 2D array mat
    // Remember that the array is sorted!
    public static double mode(double[][] mat) {
        // YOUR CODE HERE
        return -1.0;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}

