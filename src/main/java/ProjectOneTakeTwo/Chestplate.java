package ProjectOneTakeTwo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TableChestplates")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Chestplate {
    @Id
    public String chestplate_name;
    @Column
    public int required_level;
    @Column
    public int physical_defense;
    @Column
    public int magic_defense;
    @OneToMany
    @JoinColumn(name = "chestplate_name")
    public List<EQPCharacter> eqpCharacter;
}
