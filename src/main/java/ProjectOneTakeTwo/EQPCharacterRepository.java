package ProjectOneTakeTwo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

//transactional will wrap a method with a transaction manager that opens and closes
//a transaction like in hibernate
//we can also define a transaction strategy ourselves (on revpro)
@Transactional
public interface EQPCharacterRepository extends JpaRepository<EQPCharacter, Integer>  {

    //Digimon save(Digimon digimon);

    EQPCharacter save(EQPCharacter TakeTwoCharacters);

    //List<Digimon> findAll();
    List<EQPCharacter> findAll();

    EQPCharacter findByName(String name);

    List<EQPCharacter> findAllByLevel(int level);
}
