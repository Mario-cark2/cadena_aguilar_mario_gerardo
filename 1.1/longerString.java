package fisrtApp;

import java.util.ArrayList;
import java.util.List;

public class longerString {

	public static void main(String[] args) {
		 String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
         String[] longestStrings = allLongestStrings(inputArray);
         for (String str : longestStrings) {
             System.out.println("Más longest:"+"\n"+str);
         }
     }
     public static String[] allLongestStrings(String[] inputArray) {
         int maxLength = 0;
         for (String str : inputArray) {
             int length = str.length();
             if (length > maxLength) {
                 maxLength = length;
             }
         }
         List<String> longStrings = new ArrayList<>();
         for (String str : inputArray) {
             if (str.length() == maxLength) {
            	 longStrings.add(str);
             }
         }
         String[] result = new String[longStrings.size()];
         result = longStrings.toArray(result);
         return result;
	}
}
