package kadai_028;

public class JyankenExec_Chapter28 {
    public static void main(String[] args) {
        Jyanken_Chapter28 play = new Jyanken_Chapter28();
        
        // 自分の手と相手の手を文字列で取得
        String myChoice = play.getMyChoice();
        String opponentChoice = play.getRandom();

        // 自分の手と相手の手を出力
        System.out.println("自分の手は" + myChoice + ", 対戦相手の手は" + opponentChoice);

        // 勝敗判定
        play.playGame();
        
        // スキャナを閉じる
        play.cleanup(); 
    }
}