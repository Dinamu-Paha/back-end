package dinamupaha.backend.dinamupaha;

import dinamupaha.backend.dinamupaha.model.Subject;
import dinamupaha.backend.dinamupaha.model.Topic;
import dinamupaha.backend.dinamupaha.repository.SubjectRepo;
import dinamupaha.backend.dinamupaha.repository.TopicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DinamupahaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DinamupahaApplication.class, args);
	}
}

@Component
class DemoCommandLineRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {

	}

//	@Autowired
//	private SubjectRepo subjectRepo;

//	@Autowired
//	private TopicRepo topicRepo;

//	@Override
//	public void run(String... args) throws Exception {
//
//		Subject s1 = new Subject();
//		s1.setSubject("පරිසරය");
//		s1.setSubjectInEnglish("environment");
//
//		Subject s2 = new Subject();
//		s2.setSubject("සිංහල");
//		s2.setSubjectInEnglish("sinhala");
//
//		Subject s3 = new Subject();
//		s3.setSubject("ගණිතය");
//		s3.setSubjectInEnglish("mathes");
//
//		Subject s4 = new Subject();
//		s4.setSubject("ඉංග්රීසි");
//		s4.setSubjectInEnglish("english");
//
//		Subject s5 = new Subject();
//		s5.setSubject("බුද්ධි පරික්ෂණය");
//		s5.setSubjectInEnglish("iq");
//
//		subjectRepo.save(s1);
//		subjectRepo.save(s2);
//		subjectRepo.save(s3);
//		subjectRepo.save(s4);
//		subjectRepo.save(s5);

//		Topic t1 = new Topic();
//		t1.setTopic("පරිසරය1");
//		t1.setTopicInEnglish("env1");
//		t1.setSubject("environment");
//
//		Topic t2 = new Topic();
//		t2.setTopic("පරිසරය2");
//		t2.setTopicInEnglish("env2");
//		t2.setSubject("environment");
//
//		Topic t3 = new Topic();
//		t3.setTopic("පරිසරය3");
//		t3.setTopicInEnglish("env3");
//		t3.setSubject("environment");
//
//		Topic t4 = new Topic();
//		t4.setTopic("සිංහල1");
//		t4.setTopicInEnglish("sin1");
//		t4.setSubject("sinhala");
//
//		Topic t5 = new Topic();
//		t5.setTopic("සිංහල2");
//		t5.setTopicInEnglish("sin2");
//		t5.setSubject("sinhala");
//
//		Topic t6 = new Topic();
//		t6.setTopic("සිංහල3");
//		t6.setTopicInEnglish("sin3");
//		t6.setSubject("sinhala");
//
//		topicRepo.save(t1);
//		topicRepo.save(t2);
//		topicRepo.save(t3);
//		topicRepo.save(t4);
//		topicRepo.save(t5);
//		topicRepo.save(t6);
//	}
}