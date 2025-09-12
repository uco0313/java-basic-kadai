package kadai_018;

public class KatoExec_Chapter18 {
    public static void main(String[] args) {
        // 各クラスのインスタンスを生成
        KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();

        // setGivenNameメソッドで氏名をセット
        taro.setGivenName("太郎");
        ichiro.setGivenName("一郎");
        hanako.setGivenName("花子");

        // 各メソッドを実行
        taro.execIntroduce();
        ichiro.execIntroduce();
        hanako.execIntroduce();
    }
}