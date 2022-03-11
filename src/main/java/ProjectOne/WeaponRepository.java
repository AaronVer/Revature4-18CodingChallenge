package ProjectOne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Query;
import javax.transaction.Transactional;
import java.util.List;

//transactional will wrap a method with a transaction manager that opens and closes
//a transaction like in hibernate
//we can also define a transaction strategy ourselves (on revpro)
//@Repository
//@Transactional
public interface WeaponRepository extends JpaRepository<Weapon, Integer> {
    /*JPQL is a subset of HQL:
    all JPQL are valid HQL statements
     */

    /*
    Weapon save(Weapon UniqueWeapons);

    @Query("from UniqueWeapons")
    List<Weapon> findAll();

    //These retrieval methods need to be adjusted to fit with the variables

    //Weapon findByName(String name);

    //List<Weapon> findAllByPower(int power);

     */

}

/*
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class DigimonRepository {
    List<Digimon> digimons;
    public DigimonRepository(){
        digimons = new ArrayList<Digimon>();
        digimons.add(new Digimon(0, "abc", 10));
        digimons.add(new Digimon(1, "def", 20));
        digimons.add(new Digimon(2, "hij", 30));
    }
    public List<Digimon> getAllDigimon(){
        return digimons;
    }
    public List<Digimon> findAllDigimonByName(String name){
        return digimons.stream().filter(digimon -> digimon.getName().equals(name)).collect(Collectors.toList());
    }
}*/