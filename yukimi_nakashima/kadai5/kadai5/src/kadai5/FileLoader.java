package kadai5;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface FileLoader {
	List<Map<String, Object>> read() throws IOException;
}