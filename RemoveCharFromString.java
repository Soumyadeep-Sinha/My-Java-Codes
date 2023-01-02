public class RemoveCharFromString {
    public static void main(String[] args) {
        fun("", "b#acc#ad");
        System.out.println(fun("baacad"));
        System.out.println(skip("absdfappledrtapplert"));
    }

    public static void fun(String p, String up){ // p = processed (initially empty) , up = unprocessed (original string)
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == '#'){
            fun(p, up.substring(1));
        }else {
            fun(p+ch, up.substring(1));
        }
    }

    // METH 2

    public static String fun(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if(ch == 'a'){
            return fun(s.substring(1));
        }else{
            return ch + fun(s.substring(1));
        }
    }

    // Skip an entire string

    public static String skip(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return skip(s.substring(5));
        }else{
            return s.charAt(0) + skip(s.substring(1));
        }
    }
}
