package dinamupaha.backend.dinamupaha.service;

import dinamupaha.backend.dinamupaha.model.Email;

public interface EmailService {
    String sendSimpleMail(Email email);
    String sendMailWithAttachment(Email email);
}
