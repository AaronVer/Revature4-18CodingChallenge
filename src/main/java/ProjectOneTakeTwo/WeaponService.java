package ProjectOneTakeTwo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.lang.annotation.*;
@Component
public class WeaponService {
    //EQPCharacterRepository eqpCharacterRepository;
    WeaponRepository weaponRepository;

    public WeaponService(WeaponRepository weaponRepository){
        this.weaponRepository = weaponRepository;
    }
    public List<Weapon> findAllWeapon(){
        return weaponRepository.findAll();
    }

    //The Service method and repository method names don't match, but that shouldn't be a problem.

    /*
        public Weapon findWeaponByName(String name){
            return weaponRepository.findByWeaponName(name);
        }

    public Weapon saveWeapon(Weapon TakeTwoWeapons){
            return weaponRepository.save(TakeTwoWeapons);
        }

    public List<Weapon> findAllWeaponByLevelRequirement(int levelRequirement){
            return weaponRepository.findAllByLevelRequirement(levelRequirement);
        }

    public List<Weapon> findAllWeaponByDamage(int damage){
        return weaponRepository.findAllByDamage(damage);
    }
    public List<Weapon> findAllWeaponByBaseType(String baseType){
        return weaponRepository.findAllByBaseType(baseType);
    }
    public List<Weapon> findAllWeaponByAttackSpeed(Double attackSpeed){
        return weaponRepository.findAllByAttackSpeed(attackSpeed);
    }
    public List<ProjectOneTakeTwo.Weapon> findAllWeaponByParryChance(Double parryChance){
        return weaponRepository.findAllByParryChance(parryChance);
    }

     */


}
