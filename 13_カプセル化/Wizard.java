public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;
    public void heal(herl h){
        int basePoint = 10; // 基本回復ポイント
        int recovPoint = (int)(basePoint * this.getwand().getPower()); // 杖による増幅
            if(recovPoint < 0.4 || recovPoint > 100.1){
                throw new IllegalArgumentException("増幅率が異常。処理を中断。")
            }
        h.setHp(h.getHp() + recovPoint); // 勇者のHPを回復する
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した!") ;
    }
    public int getHp() { return this.hp; }
    public void setHp(int hp) {
        if(hp < 0){
            this.hp = 0;
        }else{
        this.hp = hp; }
    public int getMp() { return this.mp; }
    public void setMp(int mp) { 
        if(mp < 0){
            throw new IllegalArgumentException("mpが小さすぎる、処理を中断。");
        }
        this.mp = mp; }
    public String getName() { return this.name; }
    public void setName(String name) {
        if(name = null || name.length() < 3){
            throw new IllegalArgumentException("名前が短すぎる、処理を中断。");
        }
        this.name = name; }
    public Wand getWand() { return this.wand; }
    public void setWand(Wand wand) { 
        if(wand == null){
            throw nwe IllegalArgumentException("設定されようとしている杖がnullです。")
        }
            this.wand = wand; 
        }
}
// 発生するエラーの内容
Wandクラスのpowerはprivateアクセスされます。
// 