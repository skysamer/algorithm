package ch6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0) return new ArrayList();
		
		Map<String, List> ans=new HashMap<String, List>();
		
		for(String s:strs) {
			char[] ch=s.toCharArray();
			Arrays.sort(ch);
			String key=String.valueOf(ch);
			if(!ans.containsKey(key))
				ans.put(key, new ArrayList());
			ans.get(key).add(s);
		}
		
		return new ArrayList(ans.values());
    }

	public static void main(String[] args) {
		
		String[] str= {"eat","tea","tan","ate","nat","bat"};
		
		
		System.out.println(groupAnagrams(str));

	}

}
