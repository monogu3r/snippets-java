package snippets.java;

public class StringUtils {

    /**
     * 引数で渡された文字配列の各要素から、前方一致する部分を返します。
     * 
     * @param strArray
     *        検索する文字配列
     * @return 前方一致した文字列
     */
    public static String getStartsWithString(String[] strArray) {
        // 引数チェック
        if (strArray == null || strArray.length == 0 || strArray[0] == null) {
            return "";
        }
        
        String startsWith = strArray[0];
        int length = startsWith.length();
        while (length > 0) {
            startsWith = startsWith.substring(0, length);
            boolean matched = true;
            for (String str : strArray) {
                if (!str.startsWith(startsWith)) {
                    matched = false;
                    break;
                }
            }
            if (matched) {
                return startsWith;
            }
            length--;
        }
        return "";
    }

}
