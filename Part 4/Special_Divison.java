public class Special_Divison {

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));
        //System.out.println(Integer.MIN_VALUE);
    }

    public static int divide(int dividend, int divisor) {
        int count = 0;

        if(dividend == 0 && divisor != 0){
            return 0;
        }

        if(dividend > 0 && divisor > 0){
            while(dividend >= 0){
                count ++;
                dividend -= divisor;
            }
            return count-1;
        }

        if(dividend > 0 && divisor < 0){
            if(divisor == Integer.MIN_VALUE){
                divisor += 1;
            }
            divisor *= (-1);
            while(dividend >= 0){
                count ++;
                dividend -= divisor;
            }
            return (count-1)*(-1);
        }

        if(dividend < 0 && divisor > 0){
            int origin = dividend;
            if(dividend == Integer.MIN_VALUE){
                dividend += 1;
            }
            dividend *= (-1);
            while(dividend >= 0){
                count ++;
                dividend -= divisor;
            }
            if(origin == Integer.MIN_VALUE && divisor > 4){
                return ((count-1)*(-1));
            }

            if(origin == Integer.MIN_VALUE){
                return ((count-1)*(-1))-1;
            }
            return (count-1)*(-1);
        }

        if(dividend < 0 && divisor < 0){
            if(dividend == Integer.MIN_VALUE){
                dividend += 1;
            }
            if(divisor == Integer.MIN_VALUE){
                divisor += 1;
            }
            dividend = dividend * (-1);
//          System.out.println(dividend);
            divisor = divisor * (-1);;
            while(dividend >= 0){
                count ++;
                dividend -= divisor;
            }
            return count-1;
        }

        return Integer.MAX_VALUE;
    }
}
