package ProjectOneTakeTwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.lang.annotation.*;
import java.util.List;
@Component
public class EQPCharacterService {
    EQPCharacterRepository eqpCharacterRepository;

    public EQPCharacterService(EQPCharacterRepository eqpCharacterRepository){
        this.eqpCharacterRepository = eqpCharacterRepository;
    }


    public List<EQPCharacter> findAllEQPCharacter(){
        return eqpCharacterRepository.findAll();
    }


    public EQPCharacter findEQPcharacterByName(String name){
        return eqpCharacterRepository.findByName(name);
    }

    public EQPCharacter saveEQPCharacter(EQPCharacter TakeTwoCharacters){
        return eqpCharacterRepository.save(TakeTwoCharacters);
    }

    public List<EQPCharacter> findAllEQPCharacterByLevel(int level){
            return eqpCharacterRepository.findAllByLevel(level);
        }



}
