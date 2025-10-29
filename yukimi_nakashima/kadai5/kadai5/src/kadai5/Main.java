package kadai5;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // CSV 読み込み
            FileLoader csvLoader = FileLoaderFactory.create("src/testData/data.csv");
            
            List<Map<String, Object>> csvData = csvLoader.read();

            System.out.println("=== CSV ===");
            csvData.forEach(elements -> System.out.println(elements));
            
            System.out.println(""); // 1行空ける

            // JSON 読み込み
            FileLoader jsonLoader = FileLoaderFactory.create("src/testData/data.json");
            List<Map<String, Object>> jsonData = jsonLoader.read();

            System.out.println("=== JSON ===");
            jsonData.forEach(elements -> System.out.println(elements));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}