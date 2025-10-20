package add_kadai;

public class StudentInfo {
	private final String name;
	private int age;
	private double grade;
	
	public StudentInfo(String name, int age, double grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGrade() {
		return this.grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getName() {
		return this.name;
	}
	
	public void showInfo() {
		System.out.printf("名前：" + this.name + " " + "年齢:" + this.age + " " + "成績：" + this.grade);
	}
	
	public boolean isPassed() {
		return this.grade >= 60.0;
	}
}
