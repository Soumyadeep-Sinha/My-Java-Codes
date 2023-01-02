package deep;

import java.util.Arrays;

public class DefangingIP {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < address.length() ; i++){
            if (address.charAt(i) != '.'){
                builder.append(address.charAt(i));
            }else if (address.charAt(i) == '.'){
                builder.append('[');
                builder.append('.');
                builder.append(']');
            }
        }
        return builder.toString();
    }
}
