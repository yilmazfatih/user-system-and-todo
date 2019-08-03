package usersystem.usersystem.entity;

import java.util.List;

public class User {
    private String id;
    private String name;
    private String surname;
    private String email;
    private List<String> languages;

    public User() {
    }

    public User(String id, String name, String surname, String email, List<String> languages) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.languages = languages;
    }

    public String getId() {
        return id;
    }

    public void setId(String a) {
        this.id = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", languages=" + languages +
                '}';
    }
}
