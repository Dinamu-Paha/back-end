package dinamupaha.backend.dinamupaha.controller;

import dinamupaha.backend.dinamupaha.model.Question;
import dinamupaha.backend.dinamupaha.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @PostMapping("/addquestion")
    public Question addQuestion(@RequestBody Question question){
         return questionService.addQuestion(question);
    }

    @GetMapping("/getquestion/{subjectId}/{subtopicId}")
    public List<Question> getQuestion(@PathVariable("subjectId") int subjectId, @PathVariable("subtopicId") int subtopicId){
        return questionService.getQuestion(subjectId, subtopicId);
    }
}
