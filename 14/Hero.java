public class Hero {
    String name;
    int hp;

    // コンストラクタ
    public Hero(String name) {
        this.name = name; // this.name は現在のオブジェクトの name フィールドを指す
        this.hp = 100;    // this.hp は現在のオブジェクトの hp フィールドを指す
    }

    // boolean型のequalsメソッド。Object型の変数oを受け取る
    public boolean equals(Object o) {
        // もし現在のオブジェクト(this)が引数のオブジェクト(o)と同じインスタンスならtrueを返す
        if (this == o) {
            return true;
        }
        // もしoがHero型のインスタンスであるならば、
        if (o instanceof Hero h) {
            // もしこのnameとh.nameが等しい値ならば、
            if (this.name.equals(h.name)) {
                // trueを返す
                return true;
            }
        }
        // そうでなければfalseを返す
        return false;
    }
}
