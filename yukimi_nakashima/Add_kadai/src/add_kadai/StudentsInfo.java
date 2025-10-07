package add_kadai;

import java.util.List;

public class StudentsInfo {
	private final List<StudentInfo> student;
	public StudentsInfo(List<StudentInfo> student) {
		this.student = student;
	}
	
	public List<StudentInfo> getStudentInfoList(){
		return this.student;
	}
}
