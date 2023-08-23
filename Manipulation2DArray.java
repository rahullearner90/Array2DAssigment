import java.util.Scanner;

class Manipulation2DArray{
    static int[][] takeInput(){
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
    
    
    public static void main(String args[]){
        int positive=0, negative=0, odd=0, even=0, zero=0;
        int[][] array=takeInput();
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(array[i][j]>0){
                    positive++;
                }else if(array[i][j]==0){
                    zero++;
                }else{
                    negative++;
                }

                if(array[i][j]%2==0){
                    even++;
                }else{
                    odd++;
                }

            }

            System.out.println("number of positive numbers= "+positive);
            System.out.println("number of negative numbers= "+negative);
            System.out.println("number of odd numbers= "+odd);
            System.out.println("number of even numbers= "+even);
            System.out.println("number of zero= "+zero);
            System.out.println("................");
        }

    }
}