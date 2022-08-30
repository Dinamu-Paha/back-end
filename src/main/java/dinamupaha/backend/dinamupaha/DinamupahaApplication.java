package dinamupaha.backend.dinamupaha;

import dinamupaha.backend.dinamupaha.model.Subject;
import dinamupaha.backend.dinamupaha.repository.SubjectRepo;
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

//@Component
//class DemoCommandLineRunner implements CommandLineRunner {
//
//	@Autowired
//	private SubjectRepo subjectRepo;
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		Subject s1 = new Subject();
//		s1.setSubject("පරිසරය");
//		Subject s2 = new Subject();
//		s2.setSubject("සිංහල");
//		Subject s3 = new Subject();
//		s3.setSubject("ගණිතය");
//		Subject s4 = new Subject();
//		s4.setSubject("ඉංග්රීසි");
//		Subject s5 = new Subject();
//		s5.setSubject("බුද්ධි පරික්ෂණය");
//
//		subjectRepo.save(s1);
//		subjectRepo.save(s2);
//		subjectRepo.save(s3);
//		subjectRepo.save(s4);
//		subjectRepo.save(s5);
//
//	}
//}