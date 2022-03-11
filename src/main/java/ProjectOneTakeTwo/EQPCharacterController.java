package ProjectOneTakeTwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EQPCharacterController {
    EQPCharacterService eqpCharacterService;
    //WeaponService weaponService;

    @Autowired
    public EQPCharacterController(EQPCharacterService eqpCharacterService){
        this.eqpCharacterService = eqpCharacterService; System.out.println("Character controller activated."); }

    //@Autowired
    //public EQPCharacterController(WeaponService weaponService){
    //    this.weaponService = weaponService; System.out.println("Weapon controller activated."); }

    @GetMapping
    public List<EQPCharacter> getEQPCharacter(){
        return eqpCharacterService.findAllEQPCharacter();
    }

    // Required methods to be activated through user command:

    //1. Have user create a new character by entering their name and level
    //2. Have user create a new weapon by entering the weapon name and base type
    //3. Have user retrieve all information from a specific character
    //4 Have user retrieve all information from a specific weapon
    //5. Have user assign a weapon to a character by entering character name followed by weapon name.

    //Fetch all information from a specific character
    @GetMapping("Cname/{name}")
        public EQPCharacter getEQPCharacterByName(@PathVariable String name){
            return eqpCharacterService.findEQPcharacterByName(name);
        }

        @GetMapping("Clevel/{lev}")
        public List<EQPCharacter> getEQPCharacterByLevel(@PathVariable int lev){
            return eqpCharacterService.findAllEQPCharacterByLevel(lev);
        }
    //Create new character
    @PostMapping()
    public EQPCharacter postEQPCharacter(@RequestBody EQPCharacter TakeTwoCharacters){
        return eqpCharacterService.saveEQPCharacter(TakeTwoCharacters);
    }

    //Create and validate new weapon
    // This method must create a new object without immedietly uploading it to the database, so
    // that confirmation can be run on it first.
    /*
    @PostMapping()
    public Weapon Weapon(@RequestBody Weapon TakeTwoWeapons){
        return weaponService.saveWeapon(TakeTwoWeapons);
        // ONLY ACTIVATE THIS METHOD WHEN THE WEAPON CONTROLLER IS ACTIVE
    }

     */


}
