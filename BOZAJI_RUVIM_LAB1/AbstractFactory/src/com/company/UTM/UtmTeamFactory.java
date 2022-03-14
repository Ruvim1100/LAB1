package com.company.UTM;
import com.company.Cleaner;
import com.company.Dean;
import com.company.Professor;
import com.company.UniverTeamFactory;

public class UtmTeamFactory implements UniverTeamFactory {
    @Override
    public Dean getDean() {
        return new DeanUtm();
    }

    @Override
    public Professor getProfessor() {
        return new TMPSProffesor();
    }

    @Override
    public Cleaner getCleaner() {
        return new CleanerUtm();
    }
}
