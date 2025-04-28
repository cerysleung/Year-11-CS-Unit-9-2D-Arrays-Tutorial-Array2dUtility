
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] integers){
        int sum = 0;
        for(int i = 0; i < integers.length; i++){
            for(int j = 0; j < integers[i].length; j++){
                sum += integers[i][j];
            }
        }
        return sum;
    }
    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] integers){
        if (integers.length == 0 || integers[0].length ==0){
            return 0.0;
        }
        int sum = sum(integers);
        int count = integers.length * integers[0].length;
        return (double) sum /count;
    }
    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] integers){
        int minimum = integers[0][0];
        for(int i = 0; i < integers.length; i++){
            for(int j = 0; j < integers[i].length; j++){
                if(integers[i][j] < minimum){
                    minimum = integers[i][j];
                }
            }
        }
        return minimum;
    }
    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] integers){
        int maximum = integers[0][0];
        for(int i = 0; i < integers.length; i++){
            for(int j = 0; j < integers[i].length; j++){
                if(integers[i][j] > maximum){
                    maximum = integers[i][j];
                }
            }
        }
        return maximum;
    }
    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] integers){
        int count = 0;
        for(int i = 0; i < integers.length; i++){
            for(int j = 0; j < integers[i].length; j++){
                if(integers[i][j]%2 == 0){
                    count = count + 1;
                }
            }
        }
        return count;
    }
    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] integers){
        int count = 0;
        for(int[] i: integers){
            for(int j: i){
                if(j % 2 == 0){
                    count = count + 1;
                }
            }
        }
        return count;
    }
    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] integers){
        int count = 0;
        for(int[] i: integers){
            for(int j: i){
                if(j < 0){
                    return false;
                }
            }
        }

        return true;
    }
    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] integers){
        int[] sumArray = new int[integers.length];
        for(int i = 0; i < integers.length; i++){
            int sum = 0;
            for(int j = 0; j < integers[i].length; j++){
                sum = sum + integers[i][j];
            }
            sumArray[i] = sum;
        }
        return sumArray;
    }
    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] integers){
        int[] colArray = new int[integers.length];
        for(int i = 0; i < integers.length; i++){
            int sum = 0;
            for(int j = 0; j < integers[i].length; j++){
                sum = sum + integers[j][i];
            }
            colArray[i] = sum;
        }
        return colArray;
    }
}
