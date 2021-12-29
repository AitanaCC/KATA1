package kata1;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }


    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        return toYears(LocalDate.now().toEpochDay()-birthdate.toEpochDay());
        
    }

    private int toYears(long days) {
        return (int)(days/365.25);
    }
   
}

