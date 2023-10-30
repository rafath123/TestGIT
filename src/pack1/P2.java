package pack1;

public class P2 {
	public static void main(String[] args) {
		String name = "Amit Vaghela";
		int count= 0;
		for(int i = 0 ; i<name.length() ; i++) {
			if (name.charAt(i)== 'a' || name.charAt(i)== 'A') {
				count++;
			}
		}
		System.out.println("nuber of a == "+count);
	}
}
