package Entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class StudentExam extends BaseEntity {
    @OneToOne
    private Student student;

    @OneToOne
    private Exam exam;


    private Integer result;


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
