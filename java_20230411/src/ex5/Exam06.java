package ex5;
//규율은 날 자유롭게 만든다
//날 죽이지 못한 고통은 날 강하게 한다.
//아스키코드표 참고

public class Exam06 {
	
	public static void main(String[] args) {
	
		String str = "12345";
		int sum =0;
		
		
		//str.length()은 문자열의 길이 값
		for(int i =0; i< str.length(); i++) {
			char tmp =str.charAt(i);
			sum += (tmp-'0');
			
			
			/*for문 아래 부분이랑 같음.
			 * char tmp = str.charAt(i);
			 * int num = (tmp - '0');
			 * sum += num;
			 */
			
			
			// for문 아래 부분이랑 같음.
			//  sum += num;
			// == sum += (tmp-'0')
			// == sum += str.chatrAt(i)-0;
			
			//아스키 코드표 십진수 1은 49 이고 0이 48이어서 누적 값을 1로 하기위해 '0'을 빼줌
			
			
		}
		System.out.println("sum" + sum);
		
		} 

	}

