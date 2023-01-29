import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
//        for (int i = 0; i < 30000; i++) {
//            System.out.print(getRandomNumber(-1000, 1000) + ",");
//        }

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);

    }

//    public static int getRandomNumber(int min, int max) {
//        return (int) ((Math.random() * (max - min)) + min);
//    }
}
