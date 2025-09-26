package labassignment3;

import java.util.*;


public class HashTable {

	public static void main(String[] args) {
		Hashtable hashtable1=new Hashtable();
		hashtable1.put("Siya", 39870);
		hashtable1.put("Diya", 39370);
		hashtable1.put("Ratana", 35870);
		hashtable1.put("Naina", 30770);
		hashtable1.put("Kavya", 32170);
		hashtable1.put("Sita",30870);
		
		Enumeration keys=hashtable1.keys();
		while(keys.hasMoreElements()) {
			String key=(String)keys.nextElement();
			System.out.println(key+","+hashtable1.get(key));
		}
		/*if (hashtable1.containsKey("Diya")) {
          String a = hashtable1.get("Diya");
            System.out.println("value for key"
                               + " \"vishal\" is: " + a);
        }*/
        System.out.println("The Value for key Diya is: " + hashtable1.get("Diya"));
     

	}

}
