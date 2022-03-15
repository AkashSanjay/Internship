
public class qno14part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		qno14part1 invoice1=new qno14part1("B2216","ATTIC",300,40.00);
		qno14part1 invoice2=new qno14part1("H9966","JAVA",200,150.00);
		
		System.out.printf("INVOICE1: %s \t %s\t %d \t %.2f \n",invoice1.getPartNum(),invoice1.partDesc(),invoice1.getquantity(),invoice1.getprice());		
		System.out.printf("INVOICE2: %s \t %s\t %d \t %.2f \n",invoice2.getPartNum(),invoice2.partDesc(),invoice2.getquantity(),invoice2.getprice());

	}

}
