package dinamupaha.backend.dinamupaha.controller;

import dinamupaha.backend.dinamupaha.model.Topic;
import dinamupaha.backend.dinamupaha.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/gettopics/{subject}")
    public List<Topic> getTopics(@PathVariable("subject") String subject){
        return topicService.getTopics(subject);
    }
}
