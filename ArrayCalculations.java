
public class ArrayCalculations
{

    public static double averageArray(int[][] nums) 
    {
        double sum = 0;
        int count = 0;
        double average = 0;
        for(int row=0; row < nums.length; row++) {
            for(int col=0; col<nums[0].length; col++) {
                sum += nums[row][col];
                count ++;
            }
        }
        average = sum/count;
        return average;
    }
    
    public static int[] sumColumns(int[][] nums) {
        int sum = 0;
        int[] array = new int[nums[0].length];
        for(int col=0; col < nums[0].length; col++) {
            for(int row=0; row<nums.length; row++) {
                sum += nums[row][col];
            }
            array[col] = sum;
        }
        return array;
    }
    
    public static int[][] squareArray(int[][] nums) {
        int[][] result = new int[nums.length][nums[0].length];
        int sum = 0;
        for(int row=0; row < nums.length; row++) {
            for(int col=0; col<nums[0].length; col++) {
                sum += (nums[row][col]) * (nums[row][col]);
                result[row][col] = sum;
            }
        }
        return result;
    }
}
