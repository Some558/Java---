public class Main {
    public static void heal(int hp){
        hp +=10;
        }
        public static void heal(Thief thief){
        thief.hp += 10;
        }

        public static void main(String[] args){
            int bashHp =25;
            Thief t = new Thief("アサカ", baseHP);
            heal(baseHP);
            System.out.println(baseHp + " :" + t.hp);
            heal(t);
            System.out.println(baseHp + " :" + t.hp);
        }
}

// このコードの実行結果
// tインスタンスが生み出され、名前はアサカ、hpは25、mpは5で初期化される。
// healメソッドが呼び出され、baseHPに10加算される。つまりbaseHPは35になる。
// 25 : 25
// healメソッドが呼び出され、t.hpに10加算される。つまりt.hpは35になる。
// 25 : 35


