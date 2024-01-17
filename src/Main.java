import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] strings = {"Some","random","strings","random","Some"};

        List<String> uniqueStrings = new ArrayList();

        for(String string : strings){
            if(!uniqueStrings.contains(string)) uniqueStrings.add(string);
        }

        String result = String.join("",uniqueStrings);

        System.out.println(result);
    }
}