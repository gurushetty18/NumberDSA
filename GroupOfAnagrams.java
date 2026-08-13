package welocmeToStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GroupOfAnagrams {

	 public static List<List<String>> groupAnagrams(String[] words) {
	        Map<String, List<String>> map = new HashMap<>();

	        for (String word : words) {
	            // Step 1: canonical representation
	            char[] chars = word.toCharArray();
	            Arrays.sort(chars);
	            String key = new String(chars);

	            // Step 2: put into map
	            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
	        }

	        // Step 3: return grouped values
	        return new ArrayList<>(map.values());
	    }

	    public static void main(String[] args) {
	        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
	        List<List<String>> result = groupAnagrams(words);

	        System.out.println(result);
	    }
}
