import java.util.*;
public class Setcode {
	public static void main(String[] args) {
		Set set=new HashSet();
		set.add("akash");
		set.add("sanjay");
		set.add("srikaanth");
		set.add(new Integer(4));
		set.add(new Float (5.0F));
		set.add("sanjay");
		set.add("srikaanth");
		System.out.println(set);
	}

}
