package com.company.TPA;
import com.company.Professor;

public class GIProfessor implements Professor {
    @Override
    public void teach() {
        System.out.println("Я преподаю Инженерную графику");
    }
}
