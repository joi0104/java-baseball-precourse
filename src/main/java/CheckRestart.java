/**
 * Ŭ���� �̸�       GameRestart
 * ���� ����        1.0
 * ��¥            2019.12.03
 * ���۱�          joi0104
 */

import java.util.Scanner;

public class CheckRestart {
	boolean restart;
	
	CheckRestart(){
		restart = true;
	}
	
	/*����ڿ��� ���࿩�� ���� �Լ�*/
	public boolean isRestart() {
		System.out.println("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���");
        Scanner sc = new Scanner(System.in);
        int inputRestart = sc.nextInt();               //����ڿ��� ���࿩�θ� ����
		return restart;
	}

}