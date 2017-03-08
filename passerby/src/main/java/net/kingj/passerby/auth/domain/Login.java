package net.kingj.passerby.auth.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "AUTH.login")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Login implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loginID;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Date created = new Date();
    private Date updated = created;
    private String aboutMe;
    private boolean expired = false;
    private Date lastExpirationDate;
    private Boolean loginAllowed = true;

    private byte[] loginPhoto;

    public Long getLoginID() {
        return loginID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public Date getLastExpirationDate() {
        return lastExpirationDate;
    }

    public void setLastExpirationDate(Date lastExpirationDate) {
        this.lastExpirationDate = lastExpirationDate;
    }

    public Boolean getLoginAllowed() {
        return loginAllowed;
    }

    public void setLoginAllowed(Boolean loginAllowed) {
        this.loginAllowed = loginAllowed;
    }

    public byte[] getLoginPhoto() {
        return loginPhoto;
    }

    public void setLoginPhoto(byte[] loginPhoto) {
        this.loginPhoto = loginPhoto;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Login)) {
            return false;
        }
        if (this.loginID == null) {
            return super.equals(obj);
        }
        return this.loginID.equals(((Login) obj).getLoginID());
    }
}
