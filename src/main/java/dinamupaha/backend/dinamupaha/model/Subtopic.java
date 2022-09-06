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
}
