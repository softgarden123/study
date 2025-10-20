package csvData;

import java.io.FileReader;
import java.util.List;

import jp.sf.orangesignal.csv.CsvConfig;
import jp.sf.orangesignal.csv.CsvReader;

public class CsvPrinter {
	public static void main(String[] args) throws Exception {

		CsvConfig config = new CsvConfig(',', '"', '"'); // 区切り文字にカンマ、囲み文字とエスケープ文字にダブルクォーテーションを指定
		config.setIgnoreEmptyLines(true); // 空行を無視する
		config.setSkipLines(1); // ヘッダーをスキップする
		
		try (FileReader file = new FileReader("src/testData/Data.csv");
             CsvReader reader = new CsvReader(file, config)) {
			List<String> values;
			while ((values = reader.readValues()) != null) { // 読み込む行がなくなるまでループ処理を行う
				String x = values.get(0);
				String y = values.get(1);
				String name = values.get(2);
				String value = values.get(3);

				CsvData data = new CsvData(x, y, name, value);
				data.PrintCsv();
			}
		}
	}
}
