package checkfailedtestcase;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		//test();
		//testone();
		//testtwo();
		//testthree();
		//palindromecheck();
		

	}

	private static void palindromecheck() {
		int num=123;
		
		int original=num;
		
		int reverse=0;
		
		while(num>0) {
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		
		if(original == reverse) {
			System.out.println("its a palindrome");
		}else {
			System.out.println("its a not palindrome");
		}
	}

	private static void testthree() {
		String value="he is an automationa test engineer";
		
		String[] values=value.split("\\s+");
		
		StringBuffer stb=new StringBuffer();
		
		for(int i=0;i<values.length;i++) {
			if(values[i].length()%2 != 0) {
				StringBuffer stb1=new StringBuffer();
				stb1.append(values[i]).reverse();
				stb.append(stb1);
			}else {
				stb.append(values[i]);
			}
			stb.append(" ");
		}
		System.out.print(stb.toString());
		
	}

	private static void testtwo() {
		int arr[]= {1,2,3,4,5,12,3,4};
		//find unique values
		
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			}
		}
		System.out.print(set);
	}

	private static void testone() {
		String value="rithesh";
		
		char[] ch=value.toCharArray();
		
		boolean[] visited=new boolean[ch.length];
		
		for(int i=0;i<ch.length;i++) {
			if(visited[i]){
				continue;
				}
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] == ch[j]) {
					count++;
					visited[j]=true;
				}
			}
			System.out.println(ch[i]+"-->"+count);
			}
		
//		Map<Character,Integer> map=new HashMap<>();
//		
//		for(int i=0;i<ch.length;i++) {
//			map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
//		}
//		
//		for(Entry<Character,Integer> m:map.entrySet()) {
//			System.out.println(m.getKey()+"->"+m.getValue());
//		}
		
	}

	private static void test() throws IOException {
		WebDriver driver;
		
		driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int brokencount=0;
		int validcount=0;
		
		for(WebElement ele:links) {
			String e=ele.getAttribute("href");
			
			 if (e == null || e.isEmpty() || !e.startsWith("http")) {
			        continue;
			    }

			
			URL url=new URL(e);
			HttpURLConnection http=(HttpURLConnection) url.openConnection();
			http.connect();
			http.setConnectTimeout(3000);
			
			int responsecode=http.getResponseCode();
			
			if(responsecode >= 400 && brokencount<5) {
				System.out.println(e+":broken links:"+responsecode);
					brokencount++;
			}else if( responsecode <= 200 && validcount <5) {
				System.out.println(e+":valid links:"+responsecode);
				validcount++;
			}	
			if(brokencount==5 && validcount==5) {
				break;
			}
			http.disconnect();
		}
		driver.quit();
	}

}
