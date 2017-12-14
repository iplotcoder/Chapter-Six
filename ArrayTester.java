public class ArrayTester
{
    public static void main(String[] args) {
        int[][] arr = {{2,2,2}, {2,2,2}};
        ArrayCalculations.averageArray(arr);
        
        int[] a = ArrayCalculations.sumColumns(arr);
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
        int[] b = ArrayCalculations.squareArray(arr);
        for(int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        
    }
}