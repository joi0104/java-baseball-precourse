/**
 * Ŭ���� �̸�       GameScore
 * ���� ����        1.0
 * ��¥            2019.12.03
 * ���۱�          joi0104
 */

public class GameScore {
	int[] score;
	int[] answer;
	int[] input;
	
	GameScore() {
		score = new int[3];
		answer = new int[3];
		input = new int[3];
	}
	
	/*��ũ����ũ ���� ���� �Լ�*/
	public void checkStrike() {
		score[0]=0;                               //��ũ����ũ �� �ʱ�ȭ
		if(answer[0]==input[0]) score[0]++;
		if(answer[1]==input[1]) score[0]++;
		if(answer[2]==input[2]) score[0]++;
	}
	
	/*�� ���� ���� �Լ�*/
	public void checkBool() {
		score[1]=0;                               //�� �� �ʱ�ȭ
		if(input[0]==answer[1]) score[1]++;
		if(input[0]==answer[2]) score[1]++;
		if(input[1]==answer[0]) score[1]++;
		if(input[1]==answer[2]) score[1]++;
		if(input[2]==answer[0]) score[1]++;
		if(input[2]==answer[1]) score[1]++;
		
	}
	
	/*�������� �ƴ��� Ȯ���ϴ� �Լ�*/
	public void checkNothing() {
		score[2]=0;                               //���� �ʱ�ȭ
		if(score[0]==0 && score[1]==0) score[2]=1;
	}

	/*��Ʈ����ũ,��,���̰��� �� score�� �Լ�*/
	public int[] getScore(int[] answer, int[] input) {
		this.answer = answer;
		this.input = input;
		checkStrike();                           //��ũ����ũ Ȯ��
		checkBool();                             //�� Ȯ��
		checkNothing();                          //���� Ȯ��
		return score;
	}
	
}
