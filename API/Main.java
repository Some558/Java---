import java.time.*;
import java.time.format.*;

public class Main {
    public static void main(String[] args) {
        // fmtに文字列書式を指定して代入する
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        // ldateにfmtで指定した書式をもとに引数の文字を代入する。
        // ldate = 2023-09-22
        LocalDate ldate = LocalDate.parse("2023/09/22", fmt);

        // 1000日後を計算する
        // ldatep = 2026-06-18
        LocalDate ldatep = ldate.plusDays(1000);
        // 変数strにfmt書式のldatepを代入する
        // str = "2026/06/18"
        String str = ldatep.format(fmt);
        // strをもとに出力する
        System.out.println("1000日後は" + str);

        // 現在日時との比較
        // now = 現在の日付 (例: 2025-02-18)
        LocalDate now = LocalDate.now();
        // もし現在の日付がldatepより後であれば、以下を出力する
        if (now.isAfter(ldatep)) {
            System.out.println("本日は、その日より未来です。");
        }
    }
}
