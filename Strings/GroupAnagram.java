import java.util.*;

public class GroupAnagram {

    public List<List<String>> groupAnagram(String[] strs){

        // HashMap to store groups of anagrams
        // key = sorted version of the word
        // value = list of words that match the key
        HashMap<String, List<String>> map = new HashMap<>();

        // Traverse each word in the array
        for(String word : strs){

            // Convert word into character array
            char[] chars = word.toCharArray();

            // Sort characters to create a common key for anagrams
            Arrays.sort(chars);

            // Convert sorted char array back to String
            String key = new String(chars);

            // If this key does not exist in map, create a new list
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            // Add the current word to the corresponding anagram group
            map.get(key).add(word);
        }

        // Return all grouped anagrams as a list
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args){

        String[] strs = {"eat","tan","ate","ant","tea","tab","bat"};

        GroupAnagram obj = new GroupAnagram();

        List<List<String>> result = obj.groupAnagram(strs);

        System.out.println(result);
    }
}