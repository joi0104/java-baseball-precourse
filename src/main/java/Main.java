/**
 * Ŭ���� �̸�      Main
 * ���� ����        1.0
 * ��¥            2019.12.03
 * ���۱�          joi0104
 */

public class Main {
	
	/*�����Լ�*/
	public static void main(String[] args) {
		GameRound round;
		CheckRestart restart = new CheckRestart();
		boolean again = true;

		while(again){
			round = new GameRound();           //���Ӷ��� ����
			round.playGame();                  //��������
			again = restart.isRestart();       //�������࿩�� ����
		}
		
		System.out.println("���α׷� ����");
	}
	
}