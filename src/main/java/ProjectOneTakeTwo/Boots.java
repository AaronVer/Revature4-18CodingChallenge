package ProjectOneTakeTwo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TableBoots")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Boots {
    @Id
    public String boots_name;
    @Column
    public int required_level;
    @Column
    public int physical_defense;
    @Column
    public int magic_defense;
    @Column
    public int evasion;
    //@OneToMany
    //@JoinColumn(name = "boots_name")
    //public List<EQPCharacter> eqpCharacter;
}
