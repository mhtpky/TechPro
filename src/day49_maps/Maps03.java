package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class Maps03 {

	public static void main(String[] args) {
		Map<Integer,String> map1 = new HashMap<>();
        map1.put(101, "Ali, Can, Java");
        map1.putIfAbsent(102, "Veli, Yan, java");
        map1.put(103, "Ali, Yan, C#");
        
        System.out.println(map1.get(101)); // Ali, Can, Java > key 101 olan value'yu verir
        System.out.println(map1.get(105)); // null 
        
        System.out.println(map1.getOrDefault(105,"Aradiginiz key map'de yok")); // Aradiginiz key map'de yok
        
        System.out.println(map1.keySet()); // [101, 102, 103] >> Bir set olarak keyleri verir
        
        map1.replace(103, " Mesut, Aksu, Java"); // put ile de ayni islemi yapabiliriz
        System.out.println(map1); // {101=Ali, Can, Java, 102=Veli, Yan, java, 103= Mesut, Aksu, Java}
	
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("H", 1);
        map2.put("e", 1);
        map2.put("l", 2);
        map2.put("o", 3);
        System.out.println(map2); // {e=1, H=1, l=2, o=3}
        
        map2.compute("H", (key,value)->10); // key'i "H" olan value'yu 10 yap
        System.out.println(map2); // {e=1, H=10, l=2, o=3}
	
        map2.computeIfAbsent("A", v -> 15); // A yoksa ekle ve value 15 yap
        map2.computeIfAbsent("H", v -> 5);  // H yoksa ekle ve value 5 yap. varsa birsey yapma
        System.out.println(map2);
        
        map2.computeIfPresent("H", (key,value)->20); // key "H" olan value'yu 20 yap. yoksa bir sey yapma
        map2.computeIfPresent("M",(key,value)->20);
        System.out.println(map2);
	
	}

}
