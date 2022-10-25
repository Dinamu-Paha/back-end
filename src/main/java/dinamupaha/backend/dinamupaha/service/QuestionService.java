package dinamupaha.backend.dinamupaha.service;

import dinamupaha.backend.dinamupaha.model.Question;
import dinamupaha.backend.dinamupaha.model.UserQuiz;
import dinamupaha.backend.dinamupaha.repository.QuestionRepo;
import dinamupaha.backend.dinamupaha.repository.UserQuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepo questionRepo;
    @Autowired
    private UserQuizRepo userQuizRepo;

    public Question addQuestion(Question question){
        return questionRepo.save(question);
    }

    public List<Question> getQuestion(int subjectId, int subtopicId){
        return questionRepo.getQuestion(subjectId, subtopicId);
    }

    public List<Question> getQuestionNoCond(){
        return questionRepo.findAll();
    }

    public List<Question> getQuestionBySubject(int subjectId){
        return questionRepo.getQuestionBySubject(subjectId);
    }

    public List<String> getQuizzes(){
        return questionRepo.getQuizzes();
    }

    public List<Question> getQuestionsOfQuiz(String quizName){
        return questionRepo.getQuestionsOfQuiz(quizName);
    }

    public UserQuiz addQuizMarksForStudent(UserQuiz userQuiz){
        return userQuizRepo.save(userQuiz);
    }

    public List<UserQuiz> getQuizMarksOfStudent(int userId){
        return userQuizRepo.getQuizMarksOfStudent(userId);
    }

    public List<Integer> getPastpaper(){
        return questionRepo.getPastpaper();
    }

    public List<Question> getPastpaperOfYear(int year){
        return questionRepo.getPastpaperOfYear(year);
    }

    public List<Question> getQuestionOfPastpaperAndSubtopic(int subtopicId){
        return questionRepo.getQuestionOfPastpaperAndSubtopic(subtopicId);
    }
}
