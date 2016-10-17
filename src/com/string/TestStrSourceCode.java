package com.string;

public class TestStrSourceCode{

	String original = "abc def  ";
	
	public static void main(String[] args) {
		
		TestStrSourceCode testStrSourceCode = new TestStrSourceCode();
		testStrSourceCode.test();
	}

	private void test() {
		char myCharAt = myCharAt(original, 5);
		System.out.println(myCharAt);
	}

	/**
	 * The method is equal to charAt.
	 * @param original
	 * @param index
	 * @return
	 */
	public char myCharAt(String original,int index){
		
		if (index < 0 || index > original.length()) {
			throw new StringIndexOutOfBoundsException(index);
		}
		return original.toCharArray()[index];
	}
	
	/**
	 * The method is equal to trim().
	 * @param original
	 * @return
	 */
	private String myTrim(String original) {
		int len = original.length();
		char[] temp = original.toCharArray();
		int st = 0;
		
		//char默认值ASCII码是0 空格�?2 二�?比较 空格即为space�?
		while ((st<len)&&(temp[st]<= ' ')) {
			st++;
		}
		while ((st<len)&&(temp[len - 1]<= ' ')) {
			len-- ;
		}
		return ((st >0) || (len < original.length())) ? original.substring(st,len):original;
	}
}
