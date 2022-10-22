package dinamupaha.backend.dinamupaha.service;

import dinamupaha.backend.dinamupaha.model.Subject;
import dinamupaha.backend.dinamupaha.model.Subtopic;
import dinamupaha.backend.dinamupaha.repository.SubjectRepo;
import dinamupaha.backend.dinamupaha.repository.SubtopicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepo subjectRepo;
    private SubtopicRepo subtopicRepo;

    public List<Subject> getSubjects(){
        return subjectRepo.findAll();
    }

    public List<Subtopic> getSubtopics(int subjectId){
        return subtopicRepo.findSubtopics(subjectId);
    }

    public Subtopic addSubtopic(Subtopic subtopic){
        return subtopicRepo.save(subtopic);
    }
}
