import java.util.Scanner;

public class MiddleRC {
    static int[][] getInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Rows For Matrix : ");
        int m=sc.nextInt();
        System.err.print("Enter Collums For Matrix : ");
        int n=sc.nextInt();
        System.out.println("Enter matrix values : ");
        int[][] array=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                array[i][j]=sc.nextInt();
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[][] array=getInput();
        int m=array.length;
        int n=array[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==m/2 || j==m/2){
                    System.out.println(array[i][j]);
                }
            }
        }

    }
}