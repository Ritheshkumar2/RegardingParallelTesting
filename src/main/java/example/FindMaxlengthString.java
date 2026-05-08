package example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindMaxlengthString {

	public static void main(String[] args) {
		//test();
		//testone();
		hashmaprelated();
	}

	private static void hashmaprelated() {
		String v="rithesh";
		char[] ch=v.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<ch.length;i++) {
			map.put(ch[i],map.getOrDefault(ch[i], 0)+1);
		}
		
		for(Entry<Character,Integer> e:map.entrySet()) {
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
		
	}

	private static void testone() {
		String val="aabbcc";//output=a2b2bc2
		
		char[] ch=val.toCharArray();
		
		int count=1;
		StringBuffer stb=new StringBuffer();
		
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i] == ch[i+1]) {
				count++;
			}else {
				stb.append(ch[i]).append(count);
				count=1;
			}
		}
		stb.append(ch[ch.length-1]).append(count);
		System.out.print(stb.toString());
		
	}

	private static void test() {
		String[] value= {"automation","automationone","automationtwo"};
		
		String max1=value[0];
		
		for(int i=0;i<value.length;i++) {
			if(value[i].length() > max1.length()) {
				max1=value[i];
			}
		}
		System.out.println(max1);
		
		int arr[]= {1,2,3,4,5};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
		
	}

}
