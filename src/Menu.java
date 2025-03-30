import java.util.Scanner;
public class Menu {

    Scanner scanner = new Scanner(System.in);
    int typePokemon;

    String[] allPokemons = {
            "Charmander", "Vulpix", "Growlithe", "Torchic", "Cyndaquil",
            "Squirtle", "Psyduck", "Totodile", "Mudkip", "Piplup",
            "Bulbasaur", "Chikorita", "Treecko", "Turtwig", "Snivy",
            "Pikachu", "Magnemite", "Voltorb", "Shinx", "Yamper"
    };

    String[] firePokemons = {"Charmander", "Vulpix", "Growlithe", "Torchic", "Cyndaquil"};
    String[] waterPokemons = {"Squirtle", "Psyduck", "Totodile", "Mudkip", "Piplup"};
    String[] grassPokemons = {"Bulbasaur", "Chikorita", "Treecko", "Turtwig", "Snivy"};
    String[] electricPokemons = {"Pikachu", "Magnemite", "Voltorb", "Shinx", "Yamper"};

    public String[] getFirePokemons() {
        return firePokemons;
    }

    public String[] getWaterPokemons() {
        return waterPokemons;
    }

    public String[] getGrassPokemons() {
        return grassPokemons;
    }

    public String[] getElectricPokemons() {
        return electricPokemons;
    }
    public int getTypePokemon() {
        return typePokemon;
    }

    public void startKeuzeMenu() {
        System.out.print("Welk type Pokémon kies jij? Kies een nummer: \n" +
                "1. Fire 🔥\n" +
                "2. Water 🌊\n" +
                "3. Grass 🌿\n" +
                "4. Electric ⚡\n");
        typePokemon = scanner.nextInt();
        scanner.nextLine();
    }
}
