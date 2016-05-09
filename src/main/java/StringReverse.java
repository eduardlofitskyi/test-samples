import java.util.ArrayList;
import java.util.List;

/**
 * Created by eduard on 1/1/16.
 */
public class StringReverse {

    public static String reverse(String s){
        List<String> tempArray = new ArrayList<>(s.length());
        for (int i=0; i<s.length();i++){
            tempArray.add(s.substring(i,i+1));
        }

        StringBuilder reversedString = new StringBuilder(s.length());

        for (int i=tempArray.size()-1; i>=0;i--){
            reversedString.append(tempArray.get(i));
        }

        return reversedString.toString();
    }
}