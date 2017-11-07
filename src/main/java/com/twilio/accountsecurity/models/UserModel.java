package com.twilio.accountsecurity.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String email;
    private Integer authyId;
    private String password;
    private UserRoles role;

    public UserModel(Integer id, String username, String email, Integer authyId, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.authyId = authyId;
        this.password = password;
    }

    public UserModel() {
    }

    public UserModel(String username, String email, Integer authyId, String password) {
        this.username = username;
        this.email = email;
        this.authyId = authyId;
        this.password = password;
    }

    public UserModel(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserModel userModel = (UserModel) o;

        if (id != null ? !id.equals(userModel.id) : userModel.id != null) return false;
        if (username != null ? !username.equals(userModel.username) : userModel.username != null)
            return false;
        if (email != null ? !email.equals(userModel.email) : userModel.email != null)
            return false;
        if (authyId != null ? !authyId.equals(userModel.authyId) : userModel.authyId != null)
            return false;
        if (password != null ? !password.equals(userModel.password) : userModel.password != null)
            return false;
        return role != null ? role.equals(userModel.role) : userModel.role == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (authyId != null ? authyId.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserRoles getRole() {
        return role;
    }

    public void setRole(UserRoles role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAuthyId() {
        return authyId;
    }

    public void setAuthyId(Integer authyId) {
        this.authyId = authyId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person [id="
                + id
                + ", username="
                + username
                + ", authyId="
                + authyId
                + "]";
    }

}