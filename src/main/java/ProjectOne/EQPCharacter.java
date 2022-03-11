package ProjectOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EQPcharactersTable")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EQPCharacter {
    @Id
    private String character_name;
    @Column
    private int level;
    @Column
    @Nullable
    private String weapon;

    // I have already created all variable and constructors with the annotations.
}
