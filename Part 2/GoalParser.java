public class GoalParser {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        String ans = "";
        int i = 0;
        while(i < command.length()){
            if(command.charAt(i) == 'G'){
                ans += "G";
                i++;
            }
            if(i<command.length() && command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                ans += "o";
                i+=2;
            }
            if(i<command.length() && command.charAt(i) == '(' && command.charAt(i+1) == 'a' && command.charAt(i+2) == 'l' && command.charAt(i+3) == ')'){
                ans += "al";
                i += 4;
            }
        }

        return ans;
    }
}
