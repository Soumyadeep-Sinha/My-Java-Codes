public class BrokenKeyboard {
    public static void main(String[] args) {
        String text = "leet code";
        String broke = "e";
        System.out.println(canBeTypedWords(text, broke));
    }

    public static int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        int count = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(!check(arr[i], brokenLetters)){
                count--;
            }
        }
        return count;
    }

    public static boolean check(String s, String x){
        char[] arr = s.toCharArray();
        char[] arr1 = x.toCharArray();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr1[i] == arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
