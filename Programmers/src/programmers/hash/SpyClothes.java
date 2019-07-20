package programmers.hash;

import java.util.HashMap;

public class SpyClothes{
    public static void main(String[] args){
        SpyClothes app = new SpyClothes();
        String[][] clothes = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int count = app.solution(clothes);
        System.out.println(count);
    }

    public int solution(String[][] clothes){
        int count = 0;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String[] item : clothes){
            map.put(item[1], map.getOrDefault(item[1], 0) + 1);
        }

        
        for(String key : map.keySet()){
            if(count == 0) {
                count = map.get(key) + 1;
            }
            else{
                count = count * (map.get(key) + 1);
            }
        }
        
        return count - 1;
    }
}