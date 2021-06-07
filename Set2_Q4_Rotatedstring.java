public class Set2_Q4_Rotatedstring {

    public static void main(String[]args){
        System.out.println(isrotated("Accucia","aicuccA"));

    }
    public static boolean isrotated(String str,String rotatedstring){
       str="Accucia";
               String reverse = new StringBuffer(str).reverse().toString();
        if (str==null ||rotatedstring==null){
            return false;
        }else if (str.length()!=rotatedstring.length()){
            return false;
        }
        else {
            String concatenated=str+reverse;
            return concatenated.contains(rotatedstring);
        }

    }
}
