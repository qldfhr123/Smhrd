

package 이중for문;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class lottoTest {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> lottoNumbers = new ArrayList<>();
        
      //로또 번호 갯수를 뽑기 [로또번호는 총 45개]
        while (lottoNumbers.size() < 6) {
            int randomNumber = random.nextInt(45) + 1;
            
            // 중복된 숫자가 없을 경우에만 추가
            if (!lottoNumbers.contains(randomNumber)) {
                lottoNumbers.add(randomNumber);
            }
        }

        System.out.println("이번주 로또 번호는 : " + lottoNumbers);
    }
}