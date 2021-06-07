public class Set1_Q4_middlenumber {
   public static void main(String[]args) {
       int num1 = 121;
       int num = num1;
       int middle = 0;
       int noOfDigits = 0;

       while (num1 != 0) {
           num1 = num1 / 10;
           noOfDigits++;
       }
       if (noOfDigits % 2 == 1) {
           for (int i = 0; i < (noOfDigits / 2) + 1; i++) {
               middle = num % 10;
               num = num / 10;
           }
           System.out.println(middle);
       } else {
           System.out.println("No mid existing");
       }
   }
}
