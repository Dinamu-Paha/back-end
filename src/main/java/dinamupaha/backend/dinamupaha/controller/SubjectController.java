package dinamupaha.backend.dinamupaha.controller;

import dinamupaha.backend.dinamupaha.model.Subject;
import dinamupaha.backend.dinamupaha.model.Subtopic;
import dinamupaha.backend.dinamupaha.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;
    @GetMapping("/getsubjects")
    public List<Subject> getSubjects(){
        return subjectService.getSubjects();
    }

    @GetMapping("/getsubtopic/{subjectId}")
    public List<Subtopic> getSubtopics(@PathVariable("subjectId") int subjectId){
        return subjectService.getSubtopics(subjectId);
    }

    @PostMapping("/addsubtopic")
    public Subtopic addSubtopic(@RequestBody Subtopic subtopic){
//        return subjectService.addSubtopic(subtopic);
        return subtopic;
    }
}
