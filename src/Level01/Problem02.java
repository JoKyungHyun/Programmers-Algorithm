package Level01;

public class Problem02 {
	
		   public static boolean solution(String s) {
		        boolean answer = true;
		        int sum1 = 0;
		        int sum2 = 0;
		        String[] array_word; 

		        array_word = s.split(""); //배열에 한글자씩 저장하기
		        
		        for(int i = 0; i<array_word.length;i++) {
		        	 if(array_word[i].equals("p")||array_word[i].equals("P")) {	
		          		sum1 = sum1 + 1;
		          	}if(array_word[i].equals("y")||array_word[i].equals("Y")) {
		          		sum2 = sum2 + 1;
		        	}
		        }
		        
		        if(sum1 == sum2) {
		        	return answer;
		        } else
		        	return false;
		    }
		}
