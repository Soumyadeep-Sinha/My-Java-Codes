public class ReverseBits {
    public static void main(String[] args) {
        long n = 4294967293L;
        System.out.println(reverseBits(n));
    }

    public static int reverseBits(long n) {
        String str = Long.toBinaryString(n);
        String newstr = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            newstr += str.charAt(i);
        }
        System.out.println(str);
        System.out.println(newstr);
        int ans = 0;
        try{
            ans = Integer.parseInt(newstr, 2);
        }catch(NumberFormatException e){
            System.out.println("error string not binary");
        }

        return ans;
    }

}
