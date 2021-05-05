package fc_java_array;

import java.util.ArrayList;

public class Student {
	int stuNum;
	String stuName;
	ArrayList<Subject> subjectList = new ArrayList<>();
	
	public Student() {}
	public Student(int stuNum, String stuName) {
		this.stuNum = stuNum;
		this.stuName = stuName;
	}
	
	public void addSubject(String sub, int score) {
		Subject subject = new Subject();
		subject.setSubject(sub);
		subject.setScore(score);
		subjectList.add(subject);
	}

	public void showStudentInfo() {
		for(Subject s : subjectList) {
			System.out.println("학생 "+stuName+"("+stuNum+")의 "+s.getSubject()+"성적은 "+s.getScore()+"점 입니다.");
		}
	}

}
