package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String[] s= {
				"abstract", "assert", "boolean", "break", "byte",
				"case", "catch", "char", "class", "const",
				"continue", "default", "do", "double", "else",
				"enum", "extends", "final", "finally", "float",
				"for", "goto", "if", "implements", "import",
				"instanceof", "int", "interface", "long", "native",
				"new", "package", "private", "protected", "public",
				"return", "short", "static", "strictfp", "super",
				"switch", "synchronized", "this", "throw", "throws",
				"transient", "try", "void", "volatile", "while"
		};
		
		System.out.print("원하는 키워드를 입력하세요: ");
		String key=sc.next();
		
		int idx=Arrays.binarySearch(s, key);
		
		if(idx<0)
			System.out.println("해당 키워드가 없습니다.");
		else
			System.out.println("해당키워드는 s["+idx+"]에 있습니다.");

	}

}
