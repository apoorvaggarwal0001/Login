import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDeletion {
	public static int sizeOfResultantHashMap(ConcurrentHashMap<Integer,String> hashMap) {
		Set<Integer> set1=hashMap.keySet();
		
		for(Integer integer: set1) {
			if(integer%4==0)
				hashMap.remove(integer);
		}
		return hashMap.size();
	}
}
	
class main1{	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		ConcurrentHashMap<Integer, String> map2=new ConcurrentHashMap<>();
		
		for(int i=0;i<x;i++) {
			map2.put(sc.nextInt(), sc.next());
		}
		
		System.out.println(HashMapDeletion.sizeOfResultantHashMap(map2));
	}
}
