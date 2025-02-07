public class Main {
    public static void main(String[] args){
        Hero h = new Hero();
        h.run();
        SuperHero sh = new SuperHero();
        Matango m = new Matango();
        sh.run();
        sh.attack(m);
    }
}
