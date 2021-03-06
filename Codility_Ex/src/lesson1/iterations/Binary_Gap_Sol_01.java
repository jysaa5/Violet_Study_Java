package lesson1.iterations;

// 문제: BinaryGap
/*
A binary gap within a positive integer N is any maximal sequence of
consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
For example, number 9 has binary representation 1001 and contains a binary gap of length 2. 
The number 529 has binary representation 1000010001 and contains two binary gaps: 
one of length 4 and one of length 3.
The number 20 has binary representation 10100 and contains one binary gap of length 1.
The number 15 has binary representation 1111 and has no binary gaps. 
The number 32 has binary representation 100000 and has no binary gaps.

Write a function:
class Solution { public int solution(int N); }
that, given a positive integer N, returns the length of its longest binary gap. 
The function should return 0 if N doesn't contain a binary gap.
For example, given N = 1041 the function should return 5,
because N has binary representation 10000010001 and so its longest binary gap is of length 5. 
Given N = 32 the function should return 0,
because N has binary representation '100000' and thus no binary gaps.

Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..2,147,483,647].
*/
/*
1. 문제 요약
- 양의 정수 N내의 이진 간격은 다음의 최대 시퀀스이다.
- N의 이진 표현에서 양쪽끝이 1로 둘러싸인 연속적인 0이다. 
- 예를 들어, 숫자 9는 이진표현 1001이고 길이 2의 이진 간격을 포함한다.
- 숫자 529는 이진 표현 1000010001을 가지며 두개의 이진 간격을 포함한다.
- 길이 4중 하나와 길이 3중 하나이다.
- 숫자 20은 이진 표현 10100을 가지며 길이 1의 이진 간격 하나를 포함한다.
- 숫자 15는 이진 표현 1111을 가지며 이진 간격이 없다.
- 숫자 32는 이진 표현 100000이며 이진 간격이 없다.

2. 솔루션
- for문
- if문

3. 시간복잡도

4. Total Score
1) Task Score: 100%
2) Correctness: 100%
3) Performance: 100%
*/
class Binary_Gap_Solution {
	
	public int solution(int N) {
		// 정수를 이진수로 만들기
		String binaryStr = Integer.toBinaryString(N);

		int binaryGap = 0;

		int count = 0;

		int[] numOfOne;
		int oneOfIdx = 0;

		for (int i = 0; i < binaryStr.length(); i++) {

			if (binaryStr.charAt(i) == '1') {
				oneOfIdx++;
			}

		}

		numOfOne = new int[oneOfIdx];

		if (numOfOne.length == 1) {
			return 0;
		}

		int j = 0;
		for (int i = 0; i < binaryStr.length(); i++) {

			if (binaryStr.charAt(i) == '1') {
				numOfOne[j] = i;
				j++;

			}

		}

		for (int k = numOfOne.length - 1; k >= 0; k--) {

			if (k >= 1) {
				count = numOfOne[k] - numOfOne[k - 1]-1;
			}
			if (count > binaryGap) {
				binaryGap = count;
			}
		}

		return binaryGap;

	}
}

public class Binary_Gap_Sol_01 {

	public static void main(String[] args) {

		Binary_Gap_Solution sol = new Binary_Gap_Solution();

		int N = 1041;
		System.out.println(sol.solution(N));

	}

}
