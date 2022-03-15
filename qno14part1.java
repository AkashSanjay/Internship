//CREATE A INVOICE TO RECORD SALES AT STORE
public class qno14part1 {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	
	public qno14part1(String pnum,String pdesc,int qty,double prc) {
		if(pnum!=null) partNumber=pnum; else partNumber="0";
		if(pdesc!=null) partDescription=pdesc; else partDescription="0";
		if(qty>0) quantity=qty; else quantity=0;
		if(prc>0.0) price=prc; else price=0;	
	}
	public String getPartNum() {
		return partNumber;
	}
	public String partDesc() {
		return partDescription;
	}
	public int getquantity() {
		return quantity;
	}
	public double getprice() {
		return price;
	}
	public void setpnum(String pnum) {
		if (pnum!=null) {partNumber=pnum;}
		else {partNumber="0";}
	}
	public void setDesc(String pDesc) {
		if (pDesc!=null) {partDescription=pDesc;}
		else {partDescription="0";}
	}
	public void setquantity(int qty) {
		if(qty>0) {quantity=qty;}
else {quantity=0;}
	}
	public void setprice(int prc) {
		if(prc>0) {price=prc;}
else {price=0;}
	}
	public double getInvoiceAmount() {
		return(double)quantity*price;
	}
	
		
}
