public class Cleric {
    String name;
    int hp = 50;
    final int maxhp = 50;
    int mp = 10;
    final int maxmp = 10;

    public void selfAid(){
        this.mp -= -5;
        this.hp = this.maxhp;
    }
    public int pray(int sec) {
    System.out.println(this.name + "は" + sec + "秒間天に祈った！");

    // 論理上の回復量を乱数を用いて決定する
    int recover = new Random().nextInt(3) + sec;

    // 実際の回復量を計算する
    int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

    this.mp += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した");
    return recoverActual;
    }
}
