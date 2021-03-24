package checkers;
import java.util.regex.*;


public class TelNo {
    public static void myTelNo(String telNo){
        //Sample 08033344423 or 08133344432 or 07044455432 or 09043322312
        Pattern pattern = Pattern.compile("[0][789][01][0-9]+{8}");
        Matcher matcher = pattern.matcher(telNo);
        if (matcher.matches()){
            System.out.println("Correct Telephone number");
        }else {
            System.out.println("Incorrect telephone number");
        }
    }
}
