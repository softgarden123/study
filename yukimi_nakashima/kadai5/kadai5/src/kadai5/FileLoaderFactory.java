package kadai5;

public class FileLoaderFactory {

    public static FileLoader create(String path) {
        if (path == null) {
            throw new IllegalArgumentException("path は null にできません");
        }
        
        int index = path.lastIndexOf(".");
        if (index < 0) {
        	throw new StringIndexOutOfBoundsException("path にドットがありません");
        }
        //System.out.println(path.substring(index)); 
        String ext = path.substring(index + 1);
        
        switch (ext.toLowerCase()) {
        
            case "csv":
                return new CsvLoader(path);
            case "json":
                return new JsonLoader(path);
                
            default:
                throw new IllegalArgumentException("対応していないファイルタイプ: " + ext);
        }
        
    }
}
