Wizard w = new Wizard();
Character c = w;
c.fireball(m);
// これはエラーになる。
// 箱cの中身がHeroなのかWizardなのかわからなくなる。
// キャラクターの一種であることは分かる。

Slime s = new Slime();
Monster m = new Slime();
// これならばどちらも箱の中身はスライムになる。
// どんな型の箱に入っているかは関係ない。

Character c = new Wizard();
Wizard w = (Wizard) c;
// キャスト演算子によって、強引にWizardだとみなせる。

Character c = new Wizard();
Hero h = (Hero) c;
// このコードのコンパイルは成功するが、動作時にエラーとなる。
// Characterの箱に入っているWizardを、Heroとしてhに代入しているから。
