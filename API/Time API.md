※本記事はスッキリわかるJava入門　第4班を参照しています。

## Time APIによく使われる5つの代表的なクラス
1. Instant：世界におけるある瞬間の時刻を7秒単位で厳密に指し示す
1. ZonedDateTime：世界におけるある瞬間の時刻を7秒単位で厳密に指し示す
1. LocalDateTime：日常的に使われる曖昧な日時を保持
1. Duration：二つの異なる時刻や日付の期間を保持
1. Period：二つの異なる時刻や日付の期間を保持

### Instant
エポックからの経過時間をナノ秒数で格納する
```java:Instant.md
import java.time.*;

public class Main{
    public class Main{
        public static void main(String[] args){
            // 現在日時を取得
            Instant i1 = Instant.now();
        }
    }
}
```

### ZonedDateTime
エポックからの経過時間ではなく、東京におけるなどを指定できる。
つまりタイムゾーン情報を含める。
```java:ZonedDateTime.md
public class Main{
    public class Main{
        public static void main(String[] args){
            // 現在時刻を取得
            ZonedDateTime z1 = ZonedDateTime.now();
            // 東京時間2023年1月2日3時4分5秒6ナノ秒を指定して取得
            ZonedDateTime z2 = ZonedDateTime.of(2023, 1, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
        }
    }
}
```

### 曖昧な日時
日常生活の会話の中では、月と日だけで話すような会話が一般的。
全てがナノ秒表されると使いにくいため、曖昧な日時で表すことが重要です。
そういった時、MonthDayは月と日だけの表示だから便利。

### LocalDateTime
タイムゾーン情報だけは格納しない。
```java:LocalDateTime.md
public class Main{
    public class Main{
        public static void main(String[] args){
            // 現在時刻を取得
            LocalDateTime l1 = LocalDateTime.now();
            // 2024年1月1日9時5分を指定して取得
            // 秒とナノは0にしておくことで表さない
            LocalDateTime z2 = LocalDateTime.of(2024, 1, 1, 9, 5, 0, 0);
        }
    }
}
```

### その他の日時変更メソッドを活用したコード例
parse
format

```java:Main.java.md
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
```

Periodクラス
```java:Main2.java.md

import java.time.*;

public class Main2 {
    public static void main(String[] args) {
        // d1に2023年1月1日を代入する
        // d1 = 2023-01-01
        LocalDate d1 = LocalDate.of(2023, 1, 1);
        
        // d2に2023年1月4日を代入する
        // d2 = 2023-01-04
        LocalDate d2 = LocalDate.of(2023, 1, 4);

        // 3日間を表すPeriodを2通りの方法で生成
        // p1 = P3D (3日間)
        Period p1 = Period.ofDays(3);
        
        // p2にd1からd2までの期間を代入する
        // p2 = P3D (3日間)
        Period p2 = Period.between(d1, d2);

        // d2のさらに3日後を計算する
        // d3 = 2023-01-07
        LocalDate d3 = d2.plus(p2);
    }
}
```

