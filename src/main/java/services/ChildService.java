package services;

import dao.Repository;
import models.Child;
import models.District;
import models.Parent;
import models.School;

import java.util.Scanner;

public class ChildService {
    private Repository<Child> childDao = new Repository<>(Child.class);
    private Repository<Parent> parentDao = new Repository<>(Parent.class);
    private Repository<School> schoolDao = new Repository<>(School.class);
    Scanner sc = new Scanner(System.in);

    public void addParent(){

        var child = new Child();
        System.out.println("Введите ФИО: ");
        child.setFio(sc.nextLine());

        System.out.println("Выберете id школы");
        for(var t:schoolDao.findAll()){
            System.out.println(t.toString());
        }
        School school = schoolDao.findById(Integer.parseInt(sc.nextLine()));
        child.setSchool(school);

        childDao.add(child);




    }
}
