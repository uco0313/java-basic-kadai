package kadai_018;

public abstract class Kato_Chapter18 {
    public String familyName = "加藤"; // 課題の要件に合わせて初期値を設定
    public String givenName; // 氏名はsetGivenNameメソッドで設定
    public String address = "東京都中野区〇×"; // 課題の要件に合わせて初期値を設定

    // 氏名をセットするメソッドを追加
    public void setGivenName(String name) {
        this.givenName = name;
    }

    public void commonIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address + "です");
    }

    abstract public void eachIntroduce();

    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
        System.out.println();
    }
}