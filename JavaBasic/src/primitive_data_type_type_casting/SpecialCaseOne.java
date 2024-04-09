package primitive_data_type_type_casting;

public class SpecialCaseOne {
	
	public static void main(String[] args) {
		long L = 107;
		float f = L;
		System.out.println(f);
		
		byte b = 121;
		char ch = (char)b;
		byte b1 = (byte)ch;
		
		System.out.println(ch);
		System.out.println(b1);
		
		int x = 1111;
		char cc = (char)x;
		
		System.out.println(cc);
		
		
	}
}
