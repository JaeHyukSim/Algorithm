//���� n�� �Է¹޾� n���� ��� �Ҽ� ���ϱ� 
//Hint : �ڱ� �ڽź��� ���� ������ ���������, �ϳ��� ���������� �Ҽ��� �ƴ�. 
//�Ҽ� : ����� 1�� �ڱ��ڽŻ�. 
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� �Է¹��� 
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է�:");
		int number=scan.nextInt();
		
		//�Ҽ� ���� �Ǵ�
		/*
		 * boolean bCheck=true; int i=2; while(true) { bCheck=false; if(number%i==0 &&
		 * i!=number) { System.out.println("�Ҽ��� �ƴմϴ�."); break; } else bCheck=true;
		 * if(i==number) { System.out.println("�Ҽ��Դϴ�."); break; } i++; }
		 */

		//�Է¹��� �������� ��� �Ҽ��� ����϶� 
		//1~100������ �Ҽ� ��� 
		//1�� ����� �ִ°�? 2�� ����� �ִ°�? 
		//10(i)�� ����� �ִ°�? (j�� ��������) 
		//�Է¹��� �� ������ ���� 2���� ���캸��...

		for(int i=2;i<=number;i++) {	
			boolean bCheck=true; 
			int j=2; 
			int factor=0;
			while(j<i) { 
				//�Ҽ��� �ƴ� (���� �������� ���� ����) ==> ��� ���� +1
				if(i%j==0) 
					factor+=1;
				j++; 
			}
			//�Ҽ��̷���.... ����� �� ���� �����... ����� 0����... �Ҽ�...
			if(factor==0) {
				System.out.printf("%d\t",i);	
			}	
		}	
		
		
	}

}
