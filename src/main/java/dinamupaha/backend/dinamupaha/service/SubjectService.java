package dinamupaha.backend.dinamupaha.service;

import dinamupaha.backend.dinamupaha.model.Subject;
import dinamupaha.backend.dinamupaha.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepo subjectRepo;

    public List<Subject> getSubjects(){
        return subjectRepo.findAll();
    }
}
