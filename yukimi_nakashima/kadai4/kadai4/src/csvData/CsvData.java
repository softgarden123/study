package csvData;

public class CsvData {
	String x, y, name, value;
	public CsvData(String x, String y, String name, String value){
		this.x = x;
		this.y = y;
		this.name = name;
		this.value = value;
	}
	
	public void PrintCsv() {
		System.out.println("x="+x+" "+"y="+y+" "+"name="+name+" "+"value="+value);
	}

}
