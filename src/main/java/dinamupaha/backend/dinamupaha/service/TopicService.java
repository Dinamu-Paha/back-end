package dinamupaha.backend.dinamupaha.service;

import dinamupaha.backend.dinamupaha.model.Topic;
import dinamupaha.backend.dinamupaha.repository.TopicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepo topicRepo;

   public List<Topic> getTopics(String subject){
       return topicRepo.findBySubject(subject);
   }
}
