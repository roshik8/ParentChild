package services;

import dao.Repository;
import models.District;
import models.Parent;

import java.util.Scanner;

public class ParentService {
    private Repository<Parent> parentDao = new Repository<>(Parent.class);
    private Repository<District> districtDao = new Repository<>(District.class);
    Scanner sc = new Scanner(System.in);

    public void addParent(){
        var parent = new Parent();
        System.out.println("Введите ФИО: ");
        parent.setFio(sc.nextLine());

        System.out.println("Выберете id адреса");
        for(var t:districtDao.findAll()){
            System.out.println(t.toString());
        }
        District dc = districtDao.findById(Integer.parseInt(sc.nextLine()));
        parent.setAdress(dc);

        parentDao.add(parent);


    }
}
