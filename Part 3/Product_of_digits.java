public class Product_of_digits {
    public static void main(String[] args) {
        System.out.println(productofdigits(1342));
    }

    public static int productofdigits(int n){
        if(n / 10 == 0){
            return n;
        }
        return (n % 10) * productofdigits(n / 10);
    }
}
