package dinamupaha.backend.dinamupaha.controller;

import dinamupaha.backend.dinamupaha.model.Subject;
import dinamupaha.backend.dinamupaha.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
