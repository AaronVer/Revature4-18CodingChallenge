package ProjectOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.lang.annotation.*;
import java.util.List;
@Component
public class EQPCharacterService {
    //Make repository object
    CharacterRepository characterRepository;
    //This method needs to match the name of the class in order to work.
    @Autowired
    public EQPCharacterService(CharacterRepository characterRepository){
            this.characterRepository = characterRepository;
        }

        // This is case sensitive. The return statement must be the lowercase "characterRepository" and not the
        // upper-case "CharacterRepository".
    public List<EQPCharacter> findAllEQPCharacters(){
            return characterRepository.findAll();
        }

    //  public EQPCharacter findEQPCharacterByName(String character_name){return characterRepository.findByCharacter_name(character_name);}
    public EQPCharacter saveCharacter(EQPCharacter EQPcharater){
            return characterRepository.save(EQPcharater);
        }
}
