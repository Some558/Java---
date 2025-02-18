// クラス名を正しい形式に修正
public class Main {
    public static void main(String[] args) {
        // StringBuilderのインスタンスを生成
        // StringBuilderは、可変の文字列を効率的に操作するためのクラスです。
        StringBuilder sb = new StringBuilder();
        // sbの初期状態: ""
        
        // 1から100までの数字をカンマ区切りでsbに追加
        // ループを使って1から100までの数字を順に処理します。
        for (int i = 0; i < 100; i++) {
            // sbに現在の数字(i + 1)を追加し、その後にカンマを追加します。
            // appendメソッドは、StringBuilderに文字列を追加します。
            sb.append(i + 1).append(",");
            // 例: i = 0 のとき、sbの状態: "1,"
            // 例: i = 1 のとき、sbの状態: "1,2,"
            // 例: i = 99 のとき、sbの状態: "1,2,3,...,99,100,"
        }
        
        // StringBuilderの内容を文字列に変換
        // toStringメソッドを使って、StringBuilderの内容をString型に変換します。
        String s = sb.toString();
        // sの状態: "1,2,3,...,99,100,"
        
        // 文字列をカンマで分割して配列に変換
        // splitメソッドを使って、文字列をカンマで分割し、String型の配列に変換します。
        String[] a = s.split(",");
        // aの状態: {"1", "2", "3", ..., "99", "100"}
        
        // 配列の内容を出力（追加）
        // 配列aの各要素を順に出力します。
        for (String str : a) {
            System.out.println(str);
            // 例: str = "1", "2", "3", ..., "99", "100"
        }
    }
}