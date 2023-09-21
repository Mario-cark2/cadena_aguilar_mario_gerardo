package fisrtApp;

import java.util.Arrays;

public class ocurrencias {

	public static void main(String[] args) {
		int[] inputArray = {1, 2, 1};
        int elemToReplace = 1;
        int substitutionElem = 3;

        int[] resultArray = arrayReplace(inputArray, elemToReplace, substitutionElem);
        System.out.println(Arrays.toString(resultArray));
    }

    public static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == elemToReplace) {
                inputArray[i] = substitutionElem;
            }
        }
        return inputArray;

	}

}
