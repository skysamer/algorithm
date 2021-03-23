package ch6;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {
	
	public static String mostCommonWord(String paragraph, String[] banned) {
		String str=new StringBuffer(paragraph.toLowerCase().replaceAll("[^a-z]", " ")).toString();
		
		 for (int i = 0; i < banned.length; i++)
	            str = str.replace(banned[i], "");
		 
		 str=str.replaceAll("\\s+", " ").trim();
		
		String[] tmp=str.split(" ");
		
		HashMap<String, Integer> map=new HashMap();	
		
		for(int i=0; i<tmp.length; i++) {
			if(map.get(tmp[i])!=null)
				map.put(tmp[i], map.get(tmp[i])+1);
			else
				map.put(tmp[i], 1);
		}
		
		int count=0;
		String result="";
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			if(entry.getValue()>count) {
				count=entry.getValue();
				result=entry.getKey();
			}
		}
		
		return result;
    }

	public static void main(String[] args) {
		
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."; 
		String[] banned = {"hit"};
		System.out.println(mostCommonWord(paragraph, banned));
		
	}

}
