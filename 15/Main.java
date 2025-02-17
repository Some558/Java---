// Java.utilクラスを全てインポートする
import java.util.*;
// メインクラスをここから書いていく 
public class Main {
    // メインメソッドを書いていく
    public static void main(String[] args){
        // Calendar型の変数cにカレンダーインスタンスを代入する
        Calendar c = Calendar.getInstance();
        // cに指定の日付をセットする
        c.set(2023, 8, 18, 5, 53, 20);
        // cのカレンダーの月を9（10月）に変更する
        c.set(Calendar.MONTH, 9);
        // Date型の変数dにcのgetTime値を代入する
        Date d = c.getTime();
        // 変数dの日付を出力する
        System.out.println(d);
        // Date型変数のnowに現在時刻を代入する
        Date now = new Date();
        // cに変数nowの日付を代入する
        c.setTime(now);
        // int型の変数yにcの年数を代入する
        int y = c.get(Calendar.YEAR);
        // 変数yに入っている年数を出力する
        System.out.println("今年は" + y + "年です");
    }
}

//出力結果：今年は2025年です
