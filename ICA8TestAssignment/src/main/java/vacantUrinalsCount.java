/**
 * @Author
 * Vishwanath Reddy Yasa
 **/
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class vacantUrinalsCount {
    void getString(){}
    void openFile(){}
    public boolean validateInput(String s){
        Pattern p = Pattern.compile("^[0-1]*$");
        Matcher m = p.matcher(s);
        return m.find();

    }
    int vacantUrinals( String str ) {
        boolean vacant_urinal = str.contains("11");
        if(vacant_urinal){
            return -1;
        }
        int initialCount = (int) str.chars().filter(ch -> ch == '1').count();

        int[] Array = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            Array[i] = Character.getNumericValue(str.charAt(i));
        }

        for (int i = 0; i < Array.length; i++) {
            int urinal = Array[i];
            if (i == 0) {
                if (Array.length == 1) {
                    return 1 - Integer.parseInt(String.valueOf(urinal));
                } else if ((urinal == 0) && Array[i + 1] == 0) {
                    Array[i] = 1;
                }
            } else if (i == Array.length - 1) {
                if (urinal == 0 && Array[i - 1] == 0) {
                    Array[i] = 1;
                }
            }
            else {
                if (urinal == 0 && Array[i - 1] == 0 && Array[i + 1] == 0) {
                    Array[i] = 1;
                }
            }
        }
        return (int) Arrays.stream(Array).filter(x -> x == 1).count() - initialCount;
    }
}
