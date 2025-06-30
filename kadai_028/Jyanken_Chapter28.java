package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");

			String input = scanner.next();

			if ((input.equals("r")) || (input.equals("s")) || (input.equals("p"))) {
				return input;

			} else {
				System.out.println("入力が正しくありません。再度入力してください");
				continue;
			}
		}
	}

	public String getRandom() {
		String[] challenger = { "r", "s", "p" };

		int c = (int) (Math.floor(Math.random() * 2));

		return challenger[c];

	}

    //勝敗を判定する
    public void playGame() {
        HashMap<String, String> choice = new HashMap<String, String>();

        choice.put("r", "グー");
        choice.put("s", "チョキ");
        choice.put("p", "パー");

        String me = this.getMyChoice(); // 元の入力値を保持
        String you = this.getRandom(); // 元の入力値を保持

        System.out.println("自分の手は" + choice.get(me) + ",対戦相手は" + choice.get(you)); // 人間に理解しやすい形で表示

        //あいこ
        if ( me.equals(you) ) {
            System.err.println("あいこです");
        }

        ///自分が勝った場合
        if ((me.equals("r") && you.equals("s")) || (me.equals("s") && you.equals("p"))
                || (me.equals("p") && you.equals("r"))) {
            System.out.println("自分の勝ちです");
        }
        //自分が負けた場合
        if ((me.equals("r") && you.equals("p")) || (me.equals("s") && you.equals("r"))
                || (me.equals("p") && you.equals("s"))) {
            System.out.println("自分の負けです");
        }
        
    }
    
}
        
    
    


