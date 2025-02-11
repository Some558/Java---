public class Wand {
    private String name; // 杖の名前
    private double power; // 杖の魔力
    public double getName(){
        return this.name;
    }
    public void setName(String name){
        if(name = null || name.length() < 3){
            throw new IllegalArgumentException("名前が短すぎる、処理を中断。");
        }
        this.name = name;
    }
    public double getPower(){
        return this.power;
    }
    public void setPower(double power){
        if(power < 0.5 || power > 100.0){
            throw new IllegalArgumentException("杖に設定されようとしている魔力が異常です")；
        }
        this.power = power;
    }
}
