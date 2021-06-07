public class Set2_Q1_largestevennumber {
    public static void main(String []args){

        int []arr={1,10,3,5,2,8,20,25,16};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]%2 ==0 && arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println("Largest even number is="+max);

    }
}
