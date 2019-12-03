/**
 * Ŭ���� �̸�       GameRound
 * ���� ����        1.0
 * ��¥            2019.12.03
 * ���۱�          joi0104
 */

public class GameRound {
	Input input;
	Answer answer;
	GameScore score;
	boolean correct;
	
	GameRound(){
		input = new Input();
		answer = new Answer();
		score = new GameScore();
		correct = false;
	}
	
	/*���� ���� ����*/
	public void playGame() {
			int[] answerNum = answer.createAnswer();              //���䰪 ����
	
		while(!correct){
			int[] inputNum = input.getInput();                    //����ڿ��� �Է°� �ޱ�
			int[] scoreNum = score.getScore(answerNum,inputNum);  //���䰪�� �Է°��� �������� score �ޱ�
			printScore(scoreNum,answerNum);                       //score ����Ʈ�ϱ�
		};
	}
	
	/*score ����Ʈ�ϴ� �Լ�*/
	public void printScore(int[] scoreNum,int[] answerNum) {
		if(scoreNum[0]!=0) { System.out.print(scoreNum[0]+" ��Ʈ����ũ "); }
		if(scoreNum[1]!=0) { System.out.print(scoreNum[1]+" �� "); }
		if(scoreNum[2]!=0) { System.out.print("����"); }
		System.out.println();
	}
	
}
