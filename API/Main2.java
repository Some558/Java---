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
