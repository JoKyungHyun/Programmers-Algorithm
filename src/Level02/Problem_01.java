package Level02;

public class Problem_01 {
	public static long solution(int a, int b){
    long sum = 0;
    if(a > b){
        for(int i = 1; i < (a-b); i++){
            int index = i + b; 
        	sum = index + sum;
        }
        return sum + a + b;
    }else if(a < b) {
    	for(int i = 1; i < (b-a); i++){
            int index = i + a; 
        	sum = index + sum;
        }
        return sum + a + b;
    }else
    	return a;
	}
}
