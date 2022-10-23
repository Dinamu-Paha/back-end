package dinamupaha.backend.dinamupaha.service;

import dinamupaha.backend.dinamupaha.model.Question;
import dinamupaha.backend.dinamupaha.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepo questionRepo;

    public Question addQuestion(Question question){
        return questionRepo.save(question);
    }

    public List<Question> getQuestion(int subjectId, int subtopicId){
        return questionRepo.getQuestion(subjectId, subtopicId);
    }
}
