public class CountMatches {
    public static void main(String[] args) {
        int input = 2;
        System.out.println(numberOfMatches(input));
    }

    public static int numberOfMatches(int n) {
        int matches = 0;
        while(n > 1) {
            if(n % 2 == 0){
                matches += n / 2;
                n = n / 2;
            }
            else{
                matches += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        return matches;
    }
}
