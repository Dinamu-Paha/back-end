package dinamupaha.backend.dinamupaha.controller;

import dinamupaha.backend.dinamupaha.model.Image;
import dinamupaha.backend.dinamupaha.model.Question;
import dinamupaha.backend.dinamupaha.model.UserQuiz;
import dinamupaha.backend.dinamupaha.service.QuestionService;
import dinamupaha.backend.dinamupaha.util.ImageUtility;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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
    @Data
    public static class QuestionStructure{
        String name;
        String password;
    }
    @PostMapping("/addquestionwithimage")
    public String uplaodImage(@RequestPart("image") List<MultipartFile> image,
                              @RequestPart("text") Question question) {


        return "Image uploaded successfully: ";
    }

    @GetMapping("/getquestion/{subjectId}/{subtopicId}")
    public List<Question> getQuestion(@PathVariable("subjectId") int subjectId, @PathVariable("subtopicId") int subtopicId){
        return questionService.getQuestion(subjectId, subtopicId);
    }

    @GetMapping("/getquestion")
    public List<Question> getQuestionNoCond(){
        return questionService.getQuestionNoCond();
    }

    @GetMapping("/getquestion/{subjectId}")
    public List<Question> getQuestionBySubject(@PathVariable("subjectId") int subjectId){
        return questionService.getQuestionBySubject(subjectId);
    }

    //returing list of quizz names
    @GetMapping("/getquizzes")
    public List<String> getQuizzes(){
        return questionService.getQuizzes();

    }

    //return question of a quiz
    @GetMapping("/getquestionsofquiz/{quizName}")
    public List<Question> getQuestionsOfQuiz(@PathVariable("quizName") String quizName){
        return questionService.getQuestionsOfQuiz(quizName);
    }

    //add quiz marks for a child
    @PostMapping("/addquizmarksforstudent")
    public UserQuiz addQuizMarksForStudent(@RequestBody UserQuiz userQuiz){
        return questionService.addQuizMarksForStudent(userQuiz);
    }

    @GetMapping("/getquizmarksofstudent/{userId}")
    public List<UserQuiz> getQuizMarksOfStudent(@PathVariable("userId") int userId){
        return questionService.getQuizMarksOfStudent(userId);
    }

    @GetMapping("getpastpapers")
    public List<Question> getPastpaper(){
        return questionService.getPastpaper();
    }

    @GetMapping("getpastpaperofyear/{year}")
    public List<Question> getPastpaperOfYear(@PathVariable("year") int year){
        return questionService.getPastpaperOfYear(year);
    }
}
