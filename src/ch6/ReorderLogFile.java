package ch6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReorderLogFile {
	
	class Log {
        String id;
        String log;
        Log(String id, String log) {
            this.id = id;
            this.log = log;
        }
    }
	
	public String[] reorderLogFiles(String[] logs) {
		if(logs==null || logs.length==0) return logs;
		
		String[] ans=new String[logs.length];
		
		ArrayList<Log> letter=new ArrayList<>(); 
		ArrayList<String> digit=new ArrayList<>(); 
		
		
		for(String log:logs) {
			int space=log.indexOf(" ");
			String id=log.substring(0, space);  // 식별자
			String l=log.substring(space+1);    // 로그
			
			if(l.charAt(0)>='0' && l.charAt(0)<='9') {
				digit.add(log);
			}
			else {
				letter.add(new Log(id, l));
			}
		}
		
		Comparator<Log> comparator=new Comparator<Log>() {

			@Override
			public int compare(Log o1, Log o2) {
				int res=o1.log.compareTo(o2.log);
				if(res==0) {
					res=o1.id.compareTo(o2.id);
				}
				return res;
			}
		};
		
		Collections.sort(letter, comparator);
		
		int i=0;
		for(Log l:letter) {
			ans[i++]=l.id+" "+l.log;
		}
		for(String s:digit) {
			ans[i++]=s;
		}
		
		return ans;
    }
}
