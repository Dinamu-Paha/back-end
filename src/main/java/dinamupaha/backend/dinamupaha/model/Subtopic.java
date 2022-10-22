package dinamupaha.backend.dinamupaha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subtopic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sub_topic_id;
    private int subject_id;
    private String sub_topic;

    public int getSub_topic_id() {
        return sub_topic_id;
    }

    public void setSub_topic_id(int sub_topic_id) {
        this.sub_topic_id = sub_topic_id;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public String getSub_topic() {
        return sub_topic;
    }

    public void setSub_topic(String sub_topic) {
        this.sub_topic = sub_topic;
    }

    public String getSub_topic_in_english() {
        return sub_topic_in_english;
    }

    public void setSub_topic_in_english(String sub_topic_in_english) {
        this.sub_topic_in_english = sub_topic_in_english;
    }

    private String sub_topic_in_english;
}
