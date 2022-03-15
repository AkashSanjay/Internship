import java.util.*;

public class Mapcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				TreeMap map= new TreeMap();
				map.put("one","monday");
				map.put("two","wednesday");
				map.put("three","tuesday");
				Set set1=map.keySet();
				Collection collection =map.values();
				Set set2=map.entrySet();
				System.out.println(set1+"\n"+collection+"\n"+set2);

			}

		}
	