package kadai5;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.sf.orangesignal.csv.CsvConfig;
import jp.sf.orangesignal.csv.CsvReader;

public class CsvLoader implements FileLoader {
	private final String path;
	
	CsvLoader(String path){
		this.path = path;
	}
	
	@Override	
	public List<Map<String, Object>> read() throws IOException {
			List<Map<String, Object>> result = new ArrayList<>();
			CsvConfig config = new CsvConfig(',', '"', '"');
	        try (CsvReader reader = new CsvReader(new FileReader(this.path), config)) {

	            // 1行目をヘッダーとして取得
	            List<String> headers = reader.readValues();
	            if (headers == null) {
	                return result; // ファイルが空なら終了
	            }

	            List<String> row;
	            while ((row = reader.readValues()) != null) {
	                if (row.stream().allMatch(s -> s == null || s.isEmpty())) continue;

	                Map<String, Object> map = new HashMap<>();
	                for (int i = 0; i < headers.size() && i < row.size(); i++) {
	                    map.put(headers.get(i), row.get(i));
	                }
	                result.add(map);
	            }
	        }

	        return result;
	    }
}
