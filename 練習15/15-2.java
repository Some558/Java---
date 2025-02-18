public class Main {
    // concatPathメソッドは、フォルダパスとファイル名を結合して完全なパスを返します。
    public String concatPath(String folder, String file) {
        // フォルダパスが「¥¥」で終わっていない場合、末尾に「¥¥」を追加します。
        if (!folder.endsWith("¥¥")) {
            folder += "¥¥";
        }
        // フォルダパスとファイル名を結合して返します。
        return folder + file;
    }
}