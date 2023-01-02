import java.util.Arrays;

public class AreaOfRectangle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructRectangle(4)));
    }

    public static int[] constructRectangle(int area) {
        int size = 2;
        int[] ar = new int[size];
        if(area == 0){
            ar = new int[]{0, 0};
            return ar;
        }

        float l = 10000000;
        int n =  Integer.MAX_VALUE;
        int w = 1;
        int min = 100000000;
        while(l >= w){
            l = (float)area / w;
            n = (int)Math.floor(l);
            if(n == l && (int)l - w < min && l >= w){
                min = (int)l - w;
                ar[0] = (int)l;
                ar[1] = w;
            }else {
                w++;
            }
        }
        return ar;
    }
}
