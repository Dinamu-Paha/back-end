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
    private String role;
    private Boolean verified = false;

    public User(String firstName, String lastName, Date dob, String email, int mobileNumber, String homeDistrict, String divisionalSecretory, Year examinationYear, String password, String school, String districtOfSchool, String role) {

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
    }

    public int getId() {
        return id;
    }

    

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getHomeDistrict() {
        return homeDistrict;
    }

    public void setHomeDistrict(String homeDistrict) {
        this.homeDistrict = homeDistrict;
    }

    public String getDivisionalSecretory() {
        return divisionalSecretory;
    }

    public void setDivisionalSecretory(String divisionalSecretory) {
        this.divisionalSecretory = divisionalSecretory;
    }

    public Year getExaminationYear() {
        return examinationYear;
    }

    public void setExaminationYear(Year examinationYear) {
        this.examinationYear = examinationYear;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDistrictOfSchool() {
        return districtOfSchool;
    }

    public void setDistrictOfSchool(String districtOfSchool) {
        this.districtOfSchool = districtOfSchool;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }
}
