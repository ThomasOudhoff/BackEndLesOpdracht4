import java.util.*;

public class Pokemon {
    private String type;
    private int hp;
    private String name;

    public Pokemon(String type, int hp, String name) {
        this.type = type;
        this.hp = hp;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void pokemonAttack() {
        System.out.println(name + " valt aan!");
    }

    public void pokemonLoseHP() {
        System.out.println(name + " verliest " + hp / 5 + " HP!");
    }
}
