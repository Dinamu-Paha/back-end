package dinamupaha.backend.dinamupaha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int subjectId;
    private String subject;
    private String subjectInEnglish;

    public Subject() {

    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubjectInEnglish() {
        return subjectInEnglish;
    }

    public void setSubjectInEnglish(String subjectInEnglish) {
        this.subjectInEnglish = subjectInEnglish;
    }
}
