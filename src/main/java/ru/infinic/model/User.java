package ru.infinic.model;

import javax.persistence.*;


@Table(name = "users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String lastname;

    @Column
    private int age;

    @Column
    private String profession;

    public User(String name, String lastname, int age, String profession) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.profession = profession;
    }

    public User() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getRole() {
        return profession;
    }

    public void setRole(String role) {
        this.profession = profession;
    }
}
