package com.company;
import com.company.TPA.TpaTeamFactory;
import com.company.UTM.UtmTeamFactory;

public class Main {

    public static void main(String[] args) {
	UniverTeamFactory univerTeamFactory = new TpaTeamFactory();
    Dean dean = univerTeamFactory.getDean();
    Professor professor = univerTeamFactory.getProfessor();
    Cleaner cleaner = univerTeamFactory.getCleaner();


    System.out.println("Create UTM Faculty");
    dean.SitInTheOffice();
    professor.teach();
    cleaner.CleanUp();
    }
}
