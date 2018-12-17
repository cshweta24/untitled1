package task;

public class Array {


    public static void printDistinctElements(int[] arr){

        for(int i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String a[])

    {

        int[] nums = {-20,20,-10,20,0,4,8,-20,10,-10,8,6,15,9,18,35,40,-30,-90,99};

        Array.printDistinctElements(nums);


    }











}




