package spring.mvc;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

    @NotNull
    private int id;

    @Size(min = 2, max = 30)
    private String name;
    
   @Min(18)
    private int age;

    private String email;
    
    private String password;
    
    private String country;
    
    private List<String> languages;
    
    private String description;
 
    public User() {
    }

    public User(int id, String name, int age, String email) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public User(int id, String name, int age, String email, String password, String country, List<String> languages, String description) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.country = country;
        this.languages = languages;
        this.description = description;
    }

    public User(int id) {
        this(id, "", 18, "");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (getClass() != obj.getClass()) {
            return false;
        } else {
            return id == ((User) obj).id;
        }
    }

}
