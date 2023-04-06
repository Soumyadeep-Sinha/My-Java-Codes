import java.util.List;
import java.util.Objects;

public class CountMatchingRule {
    public static void main(String[] args) {

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = -1;
        if(Objects.equals(ruleKey, "type")){
            index = 0;
        }
        if(Objects.equals(ruleKey, "color")){
            index = 1;
        }
        if(Objects.equals(ruleKey, "name")){
            index = 2;
        }

        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).contains(ruleValue) && Objects.equals(items.get(i).get(index), ruleValue)){
                count++;
            }
        }
        return count;
    }
}
