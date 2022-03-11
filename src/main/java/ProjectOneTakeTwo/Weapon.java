package ProjectOneTakeTwo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="TableWeapons")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Weapon {
    @Id
    String weapon_name;
    @Column
    int required_level;
    @Column
    int damage;
    @Column
    double attack_speed;
    @Column
    double parry_chance;
    @OneToMany
    @JoinColumn(name = "weapon_name")
    public List<EQPCharacter> eqpCharacter;
}
