import java.math.BigInteger;
import java.util.Objects;

public class AddBinary {
    public static void main(String[] args) {

    }

    public static String addBinary(String a, String b) {
        if(Objects.equals(a, "0") && Objects.equals(b, "0")){
            return "0";
        }
        BigInteger n1 = new BigInteger(a,2);
        BigInteger n2 = n1.add(new BigInteger(b,2));

        return n2.toString(2);
    }
}
