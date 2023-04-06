import java.util.Objects;

public class Operations {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int num = 0;
        for(int i = 0 ; i < operations.length ; i++){
            if(Objects.equals(operations[i], "++X")){
                ++num;
            }
            if(Objects.equals(operations[i], "X++")){
                num++;
            }
            if(Objects.equals(operations[i], "--X")){
                --num;
            }
            if(Objects.equals(operations[i], "X--")){
                num--;
            }
        }
        return num;
    }
}
