package dinamupaha.backend.dinamupaha.controller;

//import dinamupaha.backend.dinamupaha.model.Email;
//import dinamupaha.backend.dinamupaha.service.EmailService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class EmailController {
//
//    @Autowired private EmailService emailService;
//
//    @PostMapping("/sendmail")
//    public String sendMail(@RequestBody Email email){
//        String status = emailService.sendSimpleMail(email);
//        return status;
//    }
//
//    @PostMapping("/sendmailwithattachment")
//    public String sendMailWithAttachment(@RequestBody Email email){
//        String status = emailService.sendMailWithAttachment(email);
//        return status;
//    }
//}
