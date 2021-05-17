package HashMap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class HashMapQs {
    public static void main(String[] args) {
//        String str = "abcdaabbbcdddefghijjjklm";
//        System.out.println(maxFreqChar(str));

       int[] one = {10, 20, 30, 40, 10, 10, 50, 50, 60};
       int[] two = {10, 10, 30, 100, 20, 60, 500, 50, 40};
        System.out.println(intersectionOfTwoLists(one, two));
    }

    public static char maxFreqChar(String str) {
        if(str.length() == 0)
            return '-';
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char maxFreqChar = str.charAt(0);
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            //way 1
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);

            //way 2
//            if(hashMap.containsKey(ch))
//                hashMap.put(ch, hashMap.get(ch) + 1);
//            else
//                hashMap.put(ch, 1);
        }

        int max = 0;
        for(char key : hashMap.keySet()) {
            //if we set condition to >= then it will result the last char having max. freq. eg. d
            if(hashMap.get(key) > max) {
                max = hashMap.get(key);
                maxFreqChar = key;
            }
        }
        return maxFreqChar;
    }

    public static ArrayList<Integer> intersectionOfTwoLists(int[] one, int[] two) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int val : one) {
            freqMap.put(val, freqMap.getOrDefault(val, 0) + 1);
        }

        for(int val : two) {
            if(freqMap.containsKey(val) && freqMap.get(val) > 0) {
                res.add(val);
                freqMap.put(val, freqMap.get(val) - 1);
            }
        }
        return res;
    }
}
