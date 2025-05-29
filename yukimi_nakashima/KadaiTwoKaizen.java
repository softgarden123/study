import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KadaiTwoKaizen {
    public static void main(String[] args) {
        //事前準備
        List<String> drinkList = Arrays.asList("コーラ", "ペプシ", "", "ペプシ", " セブンアップ ", "マウンテンデデデ", "", "ペプシ", "ビックル", "コカ・コーラ");

        System.out.print("空文字(\"\")以外のものを抽出：");
        System.out.println(removeEmptyStrings(drinkList));

        System.out.print("”マウンテンデデデ” を ”マウンテンデュー” に修正：");
        System.out.println(correctMountaindew(drinkList));

        System.out.print("文字列の先頭及び末尾にあるスペース削除：");
        System.out.println(trimSpaces(drinkList));

        System.out.print("文字列が3文字以下のものを抽出：");
        System.out.println(filterShortStrings(drinkList));

        System.out.print("”ペプシ” の数：");
        System.out.println(countPepsi(drinkList));

        System.out.print("”コーラ” が含まれる名前をカウント：");
        System.out.println(countColaNames(drinkList));
    }

    //空文字(””)以外のものを抽出する
    public static List<String> removeEmptyStrings(List<String> drinks) {
        return drinks.stream()
                     .filter(drink -> !drink.isEmpty())
                     .collect(Collectors.toList());
    }

    //”マウンテンデデデ” を ”マウンテンデュー” に修正
    public static List<String> correctMountaindew(List<String> drinks) {
        return drinks.stream()
                     .map(drink -> drink.replace("マウンテンデデデ", "マウンテンデュー"))
                     .collect(Collectors.toList());
    }

    //文字列の先頭及び末尾にあるスペース削除(なければ削除不要)
    public static List<String> trimSpaces(List<String> drinks) {
        return drinks.stream()
                     .map(String::trim)
                     .collect(Collectors.toList());
    }

    //文字列が3文字以下のものを抽出
    public static List<String> filterShortStrings(List<String> drinks) {
        return drinks.stream()
                     .filter(drink -> drink.length() <= 3)
                     .collect(Collectors.toList());
    }

    //”ペプシ” の数をカウント
    public static long countPepsi(List<String> drinks) {
        return drinks.stream()
                     .filter(drink -> drink.equals("ペプシ"))
                     .count();
    }

    //”コーラ” が含まれる名前をカウント
    public static long countColaNames(List<String> drinks) {
        return drinks.stream()
                     .filter(drink -> drink.contains("コーラ"))
                     .count();
    }
}