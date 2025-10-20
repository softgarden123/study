package add_kadai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public void main(String[] args) {
		StudentInfo ichiro = new  StudentInfo("一郎", 18, 75.0);
		StudentInfo jiro = new  StudentInfo("二郎", 17, 60.0);
		StudentInfo saburo = new  StudentInfo("三郎", 17, 59.9);
		
		List <StudentInfo> students = new ArrayList<StudentInfo>(Arrays.asList(ichiro, jiro, saburo));
		StudentsInfo studentsInfo = new StudentsInfo(students);
		
		showStudentsInfo(studentsInfo);
	}
	
	private void showStudentsInfo(StudentsInfo studentsInfo) {
		List <StudentInfo> students = studentsInfo.getStudentInfoList();
		for(StudentInfo student : students) {
			 student.showInfo();
		}
	}
	
	
}
