public class SmallestEvenMultiple {
    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(5));
    }

    public static int smallestEvenMultiple(int n) {
        int i = 1;
        while((2 * i) % n != 0){
            i++;
        }
        return 2 * i;
    }
}
