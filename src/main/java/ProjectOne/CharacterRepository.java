package ProjectOne;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
// This was automatically made when I added @Repository
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

//transactional will wrap a method with a transaction manager that opens and closes
//a transaction like in hibernate
//we can also define a transaction strategy ourselves (on revpro)
@Repository
@Transactional
public interface CharacterRepository extends JpaRepository<EQPCharacter, Integer> {
    /*JPQL is a subset of HQL:
    all JPQL are valid HQL statements
     */
    EQPCharacter save(EQPCharacter EQPcharactersTable);

    @Query("FROM EQPcharactersTable")
    List<EQPCharacter> findAll();

    //@Query("FROM EQPcharactersTable")
    //EQPCharacter findByCharacter_name(String character_name);
}


//I have no need for finding characters by power as that isn't a stat
    // my objects have. Instead, I should use this as a reference for making
    // useful queries.
    //List<Digimon> findAllByPower(int power);


