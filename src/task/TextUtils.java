package task;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vorobiei on 18.05.2016.
 */
public class TextUtils {
    /**
     * Method contains inside of its body three another methods.
     * Each of this method defined below.
     *
     * @param  text
     * @return sorted by natural order array of unique words
     * */
    public static String[] getUniqueSortedWords(String text) {
//        TODO find mistake and correct it, so the method works correctly
        String[] words = getWords(text);
        String[] uniqueWords = getUniqueWords(words);
        return sortWords(uniqueWords);
    }
    /**
     * @param text
     * @return array with words, get from receive text
     *          if received argument is null
     *          or text length is zero
     *          return array with zero length
     * */
    public static String[] getWords(String text) {
        if (text == null || text.isEmpty()) return new String[0];
        else return text.split("; ");
    }
    /**
     * @param words array with words
     * @return  array with unique words
     * */
    public static String[] getUniqueWords(String[] words) {
        String[] uniqueWords = new String[words.length];
        int length = 0;

        if (words == null || words.length == 0) return new String[0];
        else {
            for (int i = 0; i < words.length; i++) {
                if (isUnique(uniqueWords, words[i])) {
                    uniqueWords[length] = words[i];
                    length++;
                }
            }
        }
        return cutArray(uniqueWords, length);
    }
    public static boolean isUnique (String[] words, String str) {
        int count = 0;
        if (words == null || words.length == 0 || str == null || str.isEmpty()) return false;
        else {
            for (int i = 0; i < words.length; i++) {
                if (str.equals(words[i])) {
                    count++;
                }
            }
            return count == 0;
        }
    }

    protected static String[] cutArray(String[] words, int length) {
        if (words == null || words.length == 0 || length < 1) return new String[0];
        else {
            String[] cuttedArray = new String [length];
            for (int i = 0; i < length; i++) {
                cuttedArray[i] = words[i];
            }
            return cuttedArray;
       }
    }

    /**
     * @param  uniqueWords array with unique words
     * @return sorted by natural order array of unique words
     * */
    public static String[] sortWords(String[] uniqueWords) {
//        TODO write your code here
        if (uniqueWords == null || uniqueWords.length == 0) return new String[0];
        else if (uniqueWords.length == 1) return uniqueWords;
        else {
            uniqueWords = getUniqueWords(uniqueWords);
            for (int i = 0; i < uniqueWords.length - 1; i++) {
                boolean iteration = false;
                for (int j = 0; j < uniqueWords.length - i; j++) {
                    String str1 = uniqueWords[i];
                    if (str1.compareTo(uniqueWords[i + 1]) > 0) {
                        uniqueWords[i] = uniqueWords[i + 1];
                        uniqueWords[i + 1] = str1;
                        iteration = true;
                    }
                    if (!iteration) { break;}
                }
            }
        }
        return uniqueWords;
    }
}
