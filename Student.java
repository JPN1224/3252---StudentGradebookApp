//Joseph Nulty

public class Student {
	
	private String fullName;
	private String courseName;
	private double test1, test2, test3;
	
	public void setFullName(String name){
		fullName = name;
	};
	public void setCourseName(String course){
		courseName = course;
	};
	public void setScores(double t1, double t2, double t3){
		test1 = t1;
		test2 = t2;
		test3 = t3;
	};
	public double getAverage() {
		return  (test1 + test2 + test3)/3;
	};
	public String getLetterGrade() {
		if(getAverage() >= 90) {
			return  "A";
		}
		else if(getAverage() >= 80) {
			return  "B";
		}
		else if(getAverage() >= 70) {
			return  "C";
		}
		else if(getAverage() >= 60) {
			return  "D";
		}
		else {
			return  "F";
		}
	};
	public String getStudentReport() {
		String avgFor = String.format("%.2f", getAverage());
		return  "\n--Student Report--\nName: " + fullName + "\nCourse: " + courseName + "\nScores: " + test1 + ", " + test2 + ", " + test3 + "\nAverage: " + avgFor + "\nGrade: " + getLetterGrade() +"\n";  
	};
}

