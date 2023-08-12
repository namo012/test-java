package studentVO;

public class Score {
	private int point;
	private Student studentId;
	private Subject subject;
	
	public Score(int point, Student studentId, Subject subject) {
		this.point = point;
		this.studentId = studentId;
		this.subject = subject;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Student getStudentId() {
		return studentId;
	}

	public void setStudentId(Student studentId) {
		this.studentId = studentId;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
}
