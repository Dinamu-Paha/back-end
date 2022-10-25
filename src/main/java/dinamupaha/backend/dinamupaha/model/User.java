package dinamupaha.backend.dinamupaha.model;

import com.fasterxml.jackson.databind.DatabindException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
import java.time.Year;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    private Date dob;
    private String email;
    private int mobileNumber;
    private String homeDistrict;
    private String divisionalSecretory;
    private Year examinationYear;
    private String password;
    
    private String school;
    private String districtOfSchool;
    private Boolean role;
    private Boolean verified = false;
    int verificationCode;

    public User(String firstName, String lastName, Date dob, String email, int mobileNumber, String homeDistrict, String divisionalSecretory, Year examinationYear, String password, String school, String districtOfSchool, Boolean role, int verificationCode) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.homeDistrict = homeDistrict;
        this.divisionalSecretory = divisionalSecretory;
        this.examinationYear = examinationYear;
        this.password = password;
        this.school = school;
        this.districtOfSchool = districtOfSchool;
        this.role = role;
        this.verificationCode = verificationCode;
    }

}
