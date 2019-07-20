package programmers.hash;

import java.util.HashMap;

public class Marathon {
	public static void main(String[] args) {
		Marathon app = new Marathon();
		
		String[] participant = new String[] {"mislav", "stanko", "mislav", "ana"}; 
		String[] completion = new String[] {"stanko", "ana", "mislav"}; 
		
		String answer = app.solution(participant, completion);
		
		System.out.println(answer);
	}
	
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0 ; i < participant.length ; i++) {
        	map.put(participant[i], map.get(participant[i]) == null ? 1 : map.get(participant[i]) + 1);
        }
        
        for(int i = 0 ; i < completion.length ; i++) {
        	int cnt = map.get(completion[i]);
        	if(cnt == 1) {
        		map.remove(completion[i]);
        	}
        	else {
        		map.put(completion[i], cnt - 1);
        	}
        }
        
        if(!map.isEmpty()) {
        	for(String s : map.keySet()) {
        		answer = s;
        		break;
        	}
        }
        
        return answer;
    }
}
