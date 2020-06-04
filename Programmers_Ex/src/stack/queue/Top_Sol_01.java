package stack.queue;

import java.util.Stack;

// ����: ž
/*
���� ����
���� ������ ž N�븦 �������ϴ�. ��� ž�� ����⿡�� ��ȣ�� ��/�����ϴ� ��ġ�� ��ġ�߽��ϴ�. 
�߻��� ��ȣ�� ��ȣ�� ���� ž���� ���� ž������ �����մϴ�. ����, �� �� ���ŵ� ��ȣ�� �ٸ� ž���� �۽ŵ��� �ʽ��ϴ�.
���� ��� ���̰� 6, 9, 5, 7, 4�� �ټ� ž�� �������� ���ÿ� ������ ��ȣ�� �߻��մϴ�. �׷���, ž�� ������ ���� ��ȣ�� �ְ��޽��ϴ�. 
���̰� 4�� �ټ� ��° ž���� �߻��� ��ȣ�� ���̰� 7�� �� ��° ž�� �����ϰ�, ���̰� 7�� �� ��° ž�� ��ȣ�� ���̰� 9�� �� ��° ž��,
 ���̰� 5�� �� ��° ž�� ��ȣ�� ���̰� 9�� �� ��° ž�� �����մϴ�. 
 ���̰� 9�� �� ��° ž�� ���̰� 6�� ù ��° ž�� ���� ������ ��ȣ�� � ž������ ������ �� �����ϴ�.

�۽� ž(����)|���� ž(����)
5(4)      |	4(7)
4(7)	  | 2(9)
3(5)	  | 2(9)
2(9)	  | -
1(6)	  | -

�� ���ʺ��� ������� ž�� ���̸� ���� �迭 heights�� �Ű������� �־��� �� �� ž�� �� ��ȣ�� ��� ž���� �޾Ҵ��� ����� �迭�� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
heights�� ���� 2 �̻� 100 ������ ���� �迭�Դϴ�.
��� ž�� ���̴� 1 �̻� 100 �����Դϴ�.
��ȣ�� �����ϴ� ž�� ������ 0���� ǥ���մϴ�.

����� ��
heights	        | return
[6,9,5,7,4]	    | [0,0,2,2,4]
[3,9,9,3,5,7,2]	| [0,0,0,3,3,3,6]
[1,5,3,6,7,6,5]	| [0,0,2,0,0,5,6]

����� �� ����

����� �� #1
�ռ� ������ ���� �����ϴ�.

����� �� #2
[1,2,3] ��° ž�� �� ��ȣ�� �ƹ��� �������� �ʽ��ϴ�.
[4,5,6] ��° ž�� �� ��ȣ�� 3��° ž�� �����մϴ�.
[7] ��° ž�� �� ��ȣ�� 6��° ž�� �����մϴ�.

����� �� #3
[1,2,4,5] ��° ž�� �� ��ȣ�� �ƹ��� �������� �ʽ��ϴ�.
[3] ��° ž�� �� ��ȣ�� 2��° ž�� �����մϴ�.
[6] ��° ž�� �� ��ȣ�� 5��° ž�� �����մϴ�.
[7] ��° ž�� �� ��ȣ�� 6��° ž�� �����մϴ�.

*/
// �ַ��: ������ �������.

class Solution_Top_Sol_01 {
	public int[] solution(int[] heights) {

		Stack<Integer> topOfHeights = new Stack<Integer>();

		int[] answer = new int[heights.length];

		int count = heights.length-1;
		
		// ���ÿ� ž�� ���̸� �ִ´�.
		for (int i = 0; i < heights.length; i++) {
			topOfHeights.push(heights[i]);
		}

		// ���ÿ��� ž�� ���̸� �����鼭 �迭�� �Ųٷ� ���鼭 �۽��� ���� ã��
		for (int k = 1; k < heights.length + 1; k++) {
			int h = topOfHeights.pop();
			

			for (int j = heights.length - k; j >= 0; j--) {
				if (heights[j] > h) {
					answer[count] = j + 1;
					break;
				}
			}
			
			count--;

		}

		return answer;

	}
}

public class Top_Sol_01 {

	public static void main(String[] args) {
		
		Solution_Top_Sol_01 sol = new Solution_Top_Sol_01();
		
		//int[] heights = {6,9,5,7,4};
		//int[] heights = {3,9,9,3,5,7,2};
		int[] heights = {1,5,3,6,7,6,5};
		
		int[] result = sol.solution(heights);
		
		for(int i: result)
		System.out.print(i);

	}

}