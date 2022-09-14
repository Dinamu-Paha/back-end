package dinamupaha.backend.dinamupaha.service;

import dinamupaha.backend.dinamupaha.model.File;
import dinamupaha.backend.dinamupaha.repository.FileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.Multipart;
import java.io.IOException;
import java.util.stream.Stream;

@Service
public class FileService {
    @Autowired
    private FileRepo fileRepo;

    public File store(MultipartFile file) throws IOException {

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

//        File FileDB = new File(fileName, file.getContentType(), file.getBytes());
        File FileDB = new File();
        FileDB.setName(fileName);
        FileDB.setType(file.getContentType());
        FileDB.setData(file.getBytes());

        System.out.println(fileName);
        System.out.println(file.getContentType());
        System.out.println(file.getBytes());

        return fileRepo.save(FileDB);
    }
    public File getFile(String id) {
        return fileRepo.findById(id).get();
    }

    public Stream<File> getAllFiles() {
        return fileRepo.findAll().stream();
    }
}

