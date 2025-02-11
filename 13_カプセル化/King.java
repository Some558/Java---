// nameがHeroクラスでprivateされていた場合、以下コードはコンパイルエラーとなる。
public class King {
    void talk(Hero h){
        System.out.println(h.name);
    }
}
// しかし、呼び出し元がgetNameなら以下で呼び出せる。
public class King {
    void talk(Hero h){
        System.out.println(h.getName);
    }
}
