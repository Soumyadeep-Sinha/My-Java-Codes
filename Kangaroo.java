public class Kangaroo {
    public static void main(String[] args) {
        int x1 = 1;
        int v1 = 2;
        int x2 = 2;
        int v2 = 3;
        System.out.println(match(x1, v1, x2, v2));
    }
    public static String match(int x1,int v1,int x2,int v2){
        String yes = "YES";
        String no = "NO";
        while(x1 <= x2){
            if(x1 == x2){
                return yes;
            }
            else{
                x1 += v1;
                x2 += v2;
            }
        }
        return no;
    }
}
