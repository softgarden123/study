package kadai3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class LoadJson {

    // データクラスを定義
    public static class GetJson {
        private int id;
        private String name;
        private List<String> sikaku;

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public List<String> getSikaku() { return sikaku; }
        public void setSikaku(List<String> sikaku) { this.sikaku = sikaku; }
    }

    // Json読み込みメソッド
    public GetJson readFromFile(String path) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File(path), GetJson.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}