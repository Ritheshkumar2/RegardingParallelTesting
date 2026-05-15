package example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOccurance {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		String name="rithesh";
		
		char[] ch=name.toCharArray();
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<ch.length;i++) {
			map.put(ch[i],map.getOrDefault(ch[i], 0)+1);
		}
		
		for(Entry<Character,Integer> m:map.entrySet()) {
			System.out.println(m.getKey()+"-->"+m.getValue());
		}
	}

}
