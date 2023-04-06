public class TimeConversion {
    public static void main(String[] args) {
        String time = "12:01:00PM";
        System.out.println(timeConversion(time));
    }

    public static String timeConversion(String s) {
        String hrs = s.substring(0,2);
        String mins = s.substring(3,5);
        String sec = s.substring(6,8);

        int val = Integer.parseInt(hrs);
        String newhrs = "";
        if(s.charAt(8) == 'P' && val != 12){
            val += 12;
            newhrs = Integer.toString(val);
        }
        else if(s.charAt(8) == 'A' && val == 12){
            val = 0;
            newhrs = "00";
        }
        else{
            newhrs = hrs;
        }

        String miltime = newhrs + ":" + mins + ":" + sec;
        return miltime;
    }
}
