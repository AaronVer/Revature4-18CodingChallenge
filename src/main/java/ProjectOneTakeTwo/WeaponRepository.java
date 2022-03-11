package ProjectOneTakeTwo;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface WeaponRepository extends JpaRepository<Weapon, Integer>  {

    Weapon save(Weapon TakeTwoWeapons);

    List<Weapon> findAll();

    //Weapon findByWeaponName(String WeaponName);

    //Continue making these for all of the Weapon properties

    //List<EQPCharacter> findAllByLevel(int level);

    //List<Weapon> findAllByLevelRequirement(int levelRequirement);
    //List<Weapon> findAllByBaseType(String baseType);
    //List<Weapon> findAllByDamage(int damage);
    //List<Weapon> findAllByAttackSpeed(double attackSpeed);
    //List<ProjectOneTakeTwo.Weapon> findAllByParryChance(double parryChance);
}
