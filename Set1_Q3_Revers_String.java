public class Set1_Q3_Revers_String {
    public static void main(String[]args){
        String str="Accucia softwares";
        String[]words=str.split(" ");
        String reverseString="";
        for (String w:words){
            String reverseword="";
            for (int i=w.length()-1;i>=0;i--){
                reverseword=reverseword+w.charAt(i);

            }
            reverseString=reverseString+reverseword+" ";

        }
        System.out.println(reverseString);
    }
}
