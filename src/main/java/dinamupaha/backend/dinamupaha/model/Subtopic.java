package dinamupaha.backend.dinamupaha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subtopic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int subTopicId;
    private String subTopic;
    private String subTopicInEnglish;

    public int getSubTopicId() {
        return subTopicId;
    }

    public void setSubTopicId(int subTopicId) {
        this.subTopicId = subTopicId;
    }

    public String getSubTopic() {
        return subTopic;
    }

    public void setSubTopic(String subTopic) {
        this.subTopic = subTopic;
    }

    public String getSubTopicInEnglish() {
        return subTopicInEnglish;
    }

    public void setSubTopicInEnglish(String subTopicInEnglish) {
        this.subTopicInEnglish = subTopicInEnglish;
    }
}
