
public class IoExceptions {

	public static void main(String[] args) {
		
		try {
			int a[]=new int[7];
			a[7]=5;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexNotValid");
		}

	}

}
