/**
 * Ŭ���� �̸�      Input
 * ���� ����        1.0
 * ��¥            2019.12.03
 * ���۱�          joi0104
 */

import java.util.Scanner;

public class Input{
	int[] inputNum;
	
	public Input() {
		inputNum = new int[3];
	}
	
	/*����ڿ��� �Է°��� �޴� �Լ�*/
	public int[] getInput() {
        System.out.print("���ڸ� �Է����ּ���: ");
        Scanner sc = new Scanner(System.in);
        String str_input = sc.next();
        inputNum[0] = (int)str_input.charAt(0) - 48;
        inputNum[1] = (int)str_input.charAt(1) - 48;
        inputNum[2] = (int)str_input.charAt(2) - 48;
        return inputNum;
    }
	
}