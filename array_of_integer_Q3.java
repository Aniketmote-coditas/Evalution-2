package Evalution_2;

public class array_of_integer_Q3 {
    public static void main(String[] args){
        int [] arr={1,3,5,6,7,8,8,9,1,2};
        int sumOfEvenIndex=0;
        int multiplicationOfIndex=1;

        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sumOfEvenIndex +=arr[i];
            }else{
                multiplicationOfIndex *=arr[i];
            }
        }
        System.out.println("sum of even index "+sumOfEvenIndex);
        System.out.println("multiplication of odd index "+multiplicationOfIndex);
    }
}
/*
sum of even index 22
multiplication of odd index 2592
 */
