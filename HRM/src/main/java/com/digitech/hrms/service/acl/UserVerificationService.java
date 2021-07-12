package com.digitech.hrms.service.acl;

import com.digitech.hrms.entity.acl.User;
import java.io.UnsupportedEncodingException;
import javax.mail.MessagingException;

public interface UserVerificationService {

    public void sendVerificationEmail(User user, String siteURL)
            throws MessagingException, UnsupportedEncodingException;

    public boolean verify(String verificationCode);
}
