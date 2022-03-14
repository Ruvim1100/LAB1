package com.company.TPA;

import com.company.Cleaner;
import com.company.Dean;
import com.company.Professor;
import com.company.UniverTeamFactory;

public class TpaTeamFactory implements UniverTeamFactory {
    @Override
    public Dean getDean() {
        return new DeanTpa();
    }

    @Override
    public Professor getProfessor() {
        return new GIProfessor();
    }

    @Override
    public Cleaner getCleaner() {
        return new CleanerTpa();
    }
}
