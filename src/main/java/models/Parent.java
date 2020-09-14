package models;

import models.Child;
import models.District;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="parents")
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="fio")
    private String fio;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "parent_child",
            joinColumns = { @JoinColumn(name = "parent_id") },
            inverseJoinColumns = { @JoinColumn(name = "child_id") }
    )
    private Set<Child> children = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="adress_id")
    private District adress;

    public Parent(){

    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Set<Child> getChildren() {
        return children;
    }

    public void setChildren(Set<Child> children) {
        this.children = children;
    }

    public District getAdress() {
        return adress;
    }

    public void setAdress(District adress) {
        this.adress = adress;
    }
    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + fio;
    }
}
