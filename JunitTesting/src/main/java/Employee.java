public class Employee {
		public static String chechStr(String str) {
			String first2char= str.substring(0,2);
			String last2char=str.substring(str.length()-2);
			if(first2char.equals(last2char)) 
				System.out.println("First and last 2 characters are equal");
			return last2char;
		}
		public static void main(String[] args) {
			chechStr("hello");
		}
	}


