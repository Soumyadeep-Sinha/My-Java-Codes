public class MostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {

        /*for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                para1 = Math.min(height[i], height[j]);
                para2 = j - i;
                int newarea = para1 * para2;
                if(newarea > area){
                    area = newarea;
                }
            }
        }*/

        int para1 = 0;
        int para2 = height.length - 1;
        int area = 0;

        while(para1 < para2){
            int width = para2 - para1;
            int length = Math.min(height[para1],height[para2]);
            int newarea = width * length;
            if(newarea > area){
                area = newarea;
            }
            if(height[para1] < height[para2]){
                para1++;
            } else if (height[para1] > height[para2]) {
                para2--;
            }
            else {
                para1++;
                para2--;
            }
        }


        return area;
    }
}
