package ch6;


public class ReverseString {
	
	public static void reverseString(char[] s) {
        StringBuffer str=new StringBuffer();
        
        for(int i=0; i<s.length; i++) {
        	str.append(s[i]);
        }
        String tmp=str.reverse().toString();
        char[] tmp2=tmp.toCharArray();
        
        for(int i=0; i<s.length; i++) {
        	s[i]=tmp2[i];
        }
    }

	public static void main(String[] args) {
		
		char[] ch= {'h', 'e', 'l', 'l', 'o'};
		
		reverseString(ch);
		System.out.println(ch);
	}

}
