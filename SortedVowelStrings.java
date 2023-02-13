public class SortedVowelStrings {
    public static void main(String[] args) {
        System.out.println(countVowelStrings(5));
    }
    static int a = 1, e = 1, i = 1, o = 1, u = 1;
    public static int countVowelStrings(int n) {
        for(int j = 1; j < n; j++){
            increase();
        }
        return a+e+i+o+u;
    }
    public static void increase(){
        a = a+e+i+o+u;
        e = e+i+o+u;
        i = i+o+u;
        o = o+u;
    }
}
