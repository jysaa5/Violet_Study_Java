package dataStructureImp.list.linkedList;

//Main: ���� Ŭ����
public class Main {
	
	public static void main(String[] args) {
	
		LinkedList numbers = new LinkedList();
		
		//�� ó���� ��忡 ��� �߰�
		//numbers.addFirst(30);
		//numbers.addFirst(20);
		//numbers.addFirst(10);
		
		//�� �������� ��� �߰�
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		
		//node �ε��� 0���� ��ȯ�ȴ�.
		//System.out.println(numbers.node(0));
		//System.out.println(numbers.node(1));
		//System.out.println(numbers.node(2));
		
		//index: 1 , data: 15 -> 20�� �ڷ� �з��� 10�� 20���̿� 15�� ����.
		numbers.add(1, 15);
		numbers.add(2, 25);
	
	}

}