import java.util.HashMap;

public class HahsCodeEquals {
    /**
     *
     */
    public static void main(String[] args){
        HashMap<String, String> hm = new HashMap<String, String>(50000);
        hm.put("abc", "def");
        hm.containsKey("abc");
        System.out.println("abcde,nfdgajklsnfdaf".hashCode());

    }
}
