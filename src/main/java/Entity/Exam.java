package Entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Exam extends BaseEntity {
    private String onSubject;

    @OneToOne(mappedBy = "exam")
    private StudentExam studentExam;

    public StudentExam getStudentExam() {
        return studentExam;
    }

    public void setStudentExam(StudentExam studentExam) {
        this.studentExam = studentExam;
    }

    public String getOnSubject() {
        return onSubject;
    }

    public void setOnSubject(String onSubject) {
        this.onSubject = onSubject;
    }
}
