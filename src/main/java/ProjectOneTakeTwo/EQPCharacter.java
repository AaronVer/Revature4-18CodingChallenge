package ProjectOneTakeTwo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="TakeTwoCharacters")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EQPCharacter {
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private int level;
    @ManyToOne(fetch=FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "weapon_name")
    //@Column
    public Weapon weapon;
    @ManyToOne(fetch=FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "helmet_name")
    //@Column
    public Helmet helmet;
    @ManyToOne(fetch=FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "chestplate_name")
    //@Column
    public Chestplate chestplate;
    @ManyToOne(fetch=FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "boots_name")
    //@Column
    public Boots boots;
    // Don't forget to swap "String" back to being the name of the column once you swap back to one-to-many

    //It seems the coding within this table is correct, but the Weapon, Chestplate, Helmet, and Boots tables
    // do not have the write coding to properly support a one-to-many relationship themselves.
    // It does work when the relationships are disabled, however.


}
