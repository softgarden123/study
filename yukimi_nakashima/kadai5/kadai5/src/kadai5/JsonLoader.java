package kadai5;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonLoader implements FileLoader {
	
	private final String path;
	
	JsonLoader(String path){
		this.path = path;
	}

    @Override
    public List<Map<String, Object>> read() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        // JSON を直接 List<Map<String,Object>> に変換
        Map<String, Object> data = mapper.readValue(new File(this.path), new TypeReference<Map<String, Object>>() {});
        List<Map<String,Object>> users = (List<Map<String,Object>>) data.get("values");
        return users;
    }
}
