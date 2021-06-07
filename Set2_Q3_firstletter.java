public class Set2_Q3_firstletter {
    public static void main(String []args){
        String str = "Accucia Software";
        splitWords(str);
    }

    private static void splitWords(String str){
        String words[]= str.split(" ");
        for (int i=0;i< words.length;i++){
            String s = words[i];
            System.out.print(s.charAt(0));
        }
    }
}
