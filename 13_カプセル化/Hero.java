// hpをprivateかしておいても、同じクラス内であればhpを上書きできる。
// つまり他のクラスからもsleepメソッドを呼び出せばhpを変更できる。
// ただしsleepはpublicを消しているので同じパッケージからのみ呼び出せる。
public class Hero{
    private int hp;
    private String name;

    void sleep(){
        this.hp = 100;
    }
    // 以下のようにgetNameを指定しておくことで、name自体がprivateされていても、
    // 呼び出し側でgeteNameを指定すれば呼び出せる。
    // このようなnameを返すだけのメソッドをgetterという。
    public Stirng getName(){
        return this.name;
    }
    // 以下のような特定のフィールドに値を代入するだけのメソッドをsetterという。
    // getterとsetterのことをaccessorと総称される。
    // getterとsetterを使うことで読み書きの制限ができる。
    // 内部設計を後から変更しやすい。
    public void setName(String name){
        this.name = name;
    }
}