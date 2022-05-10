/*Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and
otherwise return the string unchanged. If the input is "xHix", then output is "Hi".*/
public class Assignment7 {

	public static void main(String[] args) {
		String str = "xHix";
      int n=str.length();
		if (str.charAt(0) == 'x')
			str = str.substring(1,n);
		
		if (str.charAt(str.length() - 1) == 'x')
			str = str.substring(0,n- 1);
		
		System.out.println(str);

	}

}