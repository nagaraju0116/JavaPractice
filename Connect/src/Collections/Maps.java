package Collections;
import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		//map is a interface of hashmap
		Map<Integer , String> map = new HashMap<>();
		map.put(101, "Java");
		map.put(102, "JS");
		//map.put(103, "Blockchain");
		map.put(103, "Java");
		//map.put(104, "DS");
		map.put(102, "DS");
		
		System.out.println(map);
	}
}


/* keys basically set
 *  and internally keys support set 
 * 
 * 
 * 
 * */
 