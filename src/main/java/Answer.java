/**
 * Ŭ���� �̸�       Answer
 * ���� ����        1.0
 * ��¥            2019.12.03
 * ���۱�          joi0104
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Answer{
	int[] answerNum;
	
	Answer(){
		answerNum = new int[3];
	}
	
	/*������ ���䰪 ����*/
	public int[] createAnswer(){
		ArrayList<Integer> numberList = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Random random = new Random();
        for (int i = 0; i < 3; i++){ 
            int index = random.nextInt(numberList.size());
            answerNum[i] = numberList.get(index);                 //ArrayList���� ������ �� �ϳ� ������
            numberList.remove(index);                             //���� �� ArrayList���� �����ϱ�
        }
        return answerNum;
	}
}
