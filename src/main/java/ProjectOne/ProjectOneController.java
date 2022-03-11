package ProjectOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Despite having two kinds of objects involved in this program instead of just one
// object like the Digimon program has, I will attempt to make only a singular controller for
// this program. It should be able to access methods for both the object types.
@RestController
public class ProjectOneController {
    EQPCharacterService EQPcharacterServiceO;
    //WeaponService WeaponServiceO;
    @Autowired
    public ProjectOneController(EQPCharacterService EQPcharacterServiceO){
        this.EQPcharacterServiceO = EQPcharacterServiceO;
        //Now I am going to have to activate the second controller in this method.
        //SecondController(WeaponServiceO);
    }
    // I am going to see if it's possible to install a second controller now.
    //@Autowired
    //public void SecondController(WeaponService WeaponServiceO){
    //    this.WeaponServiceO = WeaponServiceO;
    //    System.out.println("SecondController method activated");
    //}
    // With controllers theoretically established, I can begin coding methods in CharacterService and
    // weapon service to be activated via this class.
    @GetMapping
        public List<EQPCharacter> getEQPCharacter(){
            return EQPcharacterServiceO.findAllEQPCharacters();
        }
}
        //@GetMapping
    //    public List<Digimon> getDigimon(){
    //        return digimonService.findAllDigimon();
    //    }

    // After some deliberations, I have decided to simplify ProjectOne by allowing a single item to be
    // equipped by several character, using a one-to-many relationship instead of one-to-one. This also eliminates
    // the need for the UnusedEquipment array.

    // Required methods to be activated through user command:

    //1. Return all character names
    //2. Return all equipment names
    //3. Have user create a new character by entering their name and level
    //4. Have user create a new weapon by entering the weapon name and base type
    //5. Have user retrieve all information from a specific character
    //6 Have user retrieve all information from a specific weapon
    //7. Have user assign a weapon to a character by entering character name followed by weapon name.





