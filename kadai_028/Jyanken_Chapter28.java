package kadai_028;

import java.util.Scanner;

public class Jyanken_Chapter28 {
 int playerHand = -1;
 int computerHand = 0;
 String[] computerBox = {"パー", "チョキ", "グー"};
 Scanner scanner = new Scanner(System.in); // Scanner のインスタンスをクラスフィールドにする

 public String getMyChoice() {
     System.out.println("じゃんけんの手を入力してください");
     System.out.println("グーはrockのrを入力してください");
     System.out.println("チョキはscissorsのsを入力してください");
     System.out.println("パーはpaperのpを入力しましょう");

     String input = scanner.next();

     if(input.equals("r")) {
         System.out.println("自分の手はグーです");
         playerHand = 2;
         return "グー";
     } else if (input.equals("s")) {
         System.out.println("自分の手はチョキです");
         playerHand = 1;
         return "チョキ";
     } else if (input.equals("p")) {
         System.out.println("自分の手はパーです");
         playerHand = 0;
         return "パー";
     } else {
         System.out.println("入力された文字は正しくありません。再度入力してください。");
         return getMyChoice(); // 再度メソッドを呼び出す
     }
 }

 public String getRandom() {
     computerHand = (int) Math.floor(Math.random() * 3);
     System.out.println("コンピュータは" + computerBox[computerHand] + "を出しました。");
     return computerBox[computerHand];
 }

 public void playGame() {
     if (((playerHand - computerHand + 3) % 3) == 1) {
         System.out.println("プレイヤーの勝ちです");
     } else if ((playerHand - computerHand + 3) % 3 == 0) {
         System.out.println("あいこです");
     } else {
         System.out.println("プレイヤーの負けです");
     }
 }

 public void cleanup() {
     scanner.close(); // プログラム終了後に Scanner を閉じる
 }
}