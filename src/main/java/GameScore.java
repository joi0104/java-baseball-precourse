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
	

	/*��Ʈ����ũ,��,���̰��� �� score�� �Լ�*/
	public int[] getScore(int[] answer, int[] input) {
		this.answer = answer;
		this.input = input;
		checkStrike();                           //��ũ����ũ Ȯ��
		return score;
	}
	
}