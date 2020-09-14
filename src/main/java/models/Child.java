package models;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="children")
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="fio")
    private String fio;

    private int age;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="school_id")
    private School school;

    @ManyToMany(mappedBy = "children")
    private Set<Parent> parents = new HashSet<>();

    public int getId() {
        return id;
    }


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Set<Parent> getParents() {
        return parents;
    }

    public void setParents(Set<Parent> parents) {
        this.parents = parents;
    }

    public Child() {
    }
}
