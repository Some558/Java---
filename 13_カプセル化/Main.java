// setNameメソッドを呼び出そうとするたびに以下の検査が行われる。
private String name;
public void setName {
    if(name == null){
        throw new IllegalArgumentExeption
            ("名前がnullである。処理を中断");
    }
}

// 例えば以下のようなコードで呼び出す。
public class Main{
    public static void main(String[] args){
        Hero h = new Hero();
        h.setName
    }
}
