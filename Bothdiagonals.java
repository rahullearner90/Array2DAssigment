public class Bothdiagonals {
    public static void main(String[] args) {
        int[][] array={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int m=array.length;
        int n=array[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==j || i+j==m-1){
                    System.out.print(array[i][j]+" ");
                }
            }
        }
    }
}
