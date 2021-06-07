import java.util.HashSet;
import java.util.Set;

public class Set1_Q2_uniquecharacter {
    public static int unique(String str){

        if(str==null || str.length()==0 ){
            return 0;

        }
        Set<Character>set=new HashSet<>();
        for (int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        return set.size();
    }
    public static void main(String[]args){
        String input="Accucia";
        String str =input.toLowerCase();
        System.out.println(Set1_Q2_uniquecharacter.unique(str));
    }
}
