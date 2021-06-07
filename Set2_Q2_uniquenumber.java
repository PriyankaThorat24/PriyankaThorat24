

public class Set2_Q2_uniquenumber {
   public static void main(String[]args) {
        int num;
        int Count=0;
        int []arr={1,2,1,4,1,2,10};
        for (int i = 0; i < arr.length; i++)
        {
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            if (i == j)
                Count++;

        }
        System.out.println(Count);
       }

   }


