package kata1;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    
    public static void main(String[] args) {
        Person person = new Person("Aitana Carreño",LocalDate.of(2000, Month.FEBRUARY, 9));
        System.out.println(person.getName()+ " "+ person.getAge());
    }
    
}
    

