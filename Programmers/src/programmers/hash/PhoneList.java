package programmers.hash;

import java.util.Arrays;
import java.util.Comparator;

/**
��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.

������ : 119
���ؿ� : 97 674 223
������ : 11 9552 4421
��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��, � ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
phone_book�� ���̴� 1 �̻� 1,000,000 �����Դϴ�.
�� ��ȭ��ȣ�� ���̴� 1 �̻� 20 �����Դϴ�.
*/
public class PhoneList {
	public static void main(String[] args) {
//		String[] phone_book = new String[] {"119", "97674223", "11911122", "1195524421"};
		String[] phone_book = new String[] {"123","456","789"};
		
		PhoneList app = new PhoneList();
		boolean valid = app.solution(phone_book);
		
		System.out.println(valid);
	}
	
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        //���� �� ���� �� ����
        Arrays.sort(phone_book, new Comparator<String>() {
 
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()) {
					return 9;
				}
				else if(o1.length() == o2.length()) {
					return String.CASE_INSENSITIVE_ORDER.compare(o1, o2);
				}
				else{
					return -1;
				}
			}
        	
		});
        
        //�迭�� ��ȸ�ϸ� startWith�� �̿��� ���翩�� Ȯ��
        for(int i = 0 ; i < phone_book.length ; i++) {
        	for(int j = i + 1 ; j < phone_book.length ; j++) {
        		if(phone_book[j].startsWith(phone_book[i])) {
        			answer = false;
        			break;
        		} 
        	}
        }
        
        return answer;
    }
}
