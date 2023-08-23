public class FindLargestEl {
    public static void main(String[] args) {
        int largeValue=0;
        int[][] array={
            {1, 2, 4,0},
            {2, 5, 7, -1},
            {4, 2, 6, 9}
        };
        int m=array.length;
        int n=array[0].length;
        for(int i=0; i<m; i++){
            for(int j=1; j<n; j++){
                if(array[i][j]>array[i][j-1]){
                    largeValue=array[i][j];
                }
            }
        }
        System.out.println(largeValue);
    }
}
