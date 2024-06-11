import java.util.*;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int max = health;
        int relay = 0;
        
        HashMap<Integer,Integer> attack = new HashMap<>();
        
        for(int[] a : attacks) {
            attack.put(a[0],a[1]);
        }
        
        for(int i = 0; i <= attacks[attacks.length-1][0]; i++) { // 초
            if(attack.containsKey(i)) {
                health -= attack.get(i);
                relay = 0;
            } else {
                health += bandage[1];
                relay = relay + 1;
                if(relay == bandage[0]) {
                    health += bandage[2];
                    relay = 0;
                } 

                if(health >= max) {
                    health = max;
                }
            }
            
            
            if(health <= 0) {
                return -1;
            }
        }
        
        if(health <= 0) {
            answer = -1;
        } else {
            answer = health;
        }
        return answer;
    }
}