package Evalution_2;

public class pattern_Q4 {
    public static void main(String[] args){
        int n=4;
        int a=4;
        for(int i=1;i<=n;i++){
            for(int k=1;k<a;k++){
                System.out.print(" ");
            }
            a--;
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


