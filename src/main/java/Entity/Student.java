package Entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Student extends BaseEntity{
    private String name;

    private String surname;

    @OneToOne(mappedBy = "student")
    private StudentExam studentExam;

    public StudentExam getStudentExam() {
        return studentExam;
    }

    public void setStudentExam(StudentExam studentExam) {
        this.studentExam = studentExam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
