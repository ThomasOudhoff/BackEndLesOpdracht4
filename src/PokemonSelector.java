import java.util.*;

public class PokemonSelector {

    private Menu menu;
    private int type;
    private List<String> allePokemons = new ArrayList<>();
    private Random rand = new Random();
    private String tegenstander;
    private String gekozenNaam;
    private Pokemon gekozenPokemon;

    public PokemonSelector(Menu menu) {

        this.menu = menu;
        this.type = menu.getTypePokemon();
        allePokemons.addAll(Arrays.asList(menu.getFirePokemons()));
        allePokemons.addAll(Arrays.asList(menu.getWaterPokemons()));
        allePokemons.addAll(Arrays.asList(menu.getGrassPokemons()));
        allePokemons.addAll(Arrays.asList(menu.getElectricPokemons()));
    }

    public void choosePokemon() {
        Scanner scanner = new Scanner(System.in);
        String[] gekozenLijst;

        if (type == 1) {
            gekozenLijst = menu.getFirePokemons();
        } else if (type == 2) {
            gekozenLijst = menu.getWaterPokemons();
        } else if (type == 3) {
            gekozenLijst = menu.getGrassPokemons();
        } else if (type == 4) {
            gekozenLijst = menu.getElectricPokemons();
        } else {
            System.out.println("Geen geldig type gekozen.");
            return;
        }

        System.out.println(Arrays.toString(gekozenLijst));

        while (true) {
            System.out.print("Typ de naam van de Pokémon die je kiest: ");
            gekozenNaam = scanner.nextLine();

            if (Arrays.asList(gekozenLijst).contains(gekozenNaam)) {
                break;
            } else {
                System.out.println("Ongeldige naam, probeer het opnieuw.");
            }
        }

        if (type == 1) {
            gekozenPokemon = new FirePokemon("Fire", 100, gekozenNaam, "Flamethrower", 25);
        } else if (type == 2) {
            gekozenPokemon = new WaterPokemon("Water", 100, gekozenNaam, "Bubblebeam", 20);
        } else if (type == 3) {
            gekozenPokemon = new GrassPokemon("Grass", 100, gekozenNaam, "Leaf Blade", 22);
        } else if (type == 4) {
            gekozenPokemon = new ElectricPokemon("Electric", 100, gekozenNaam, "Thunder Shock", 30);
        }

        System.out.println("Je hebt " + gekozenNaam + " gekozen!");
    }

    public void chooseOpponent() {
        int index = rand.nextInt(allePokemons.size());
        tegenstander = allePokemons.get(index);
        System.out.println("Je tegenstander is: " + tegenstander);
    }

    public void printMatch() {
        System.out.println("⚔️ MATCH ⚔️");
        System.out.println("Jouw Pokémon is: " + gekozenNaam);
        System.out.println("Je tegenstander is: " + tegenstander);
    }

    public void startBattle() {
        gekozenPokemon.pokemonAttack();
        gekozenPokemon.pokemonLoseHP();
    }
    public Pokemon getGekozenPokemon() {
        return gekozenPokemon;
    }
    public String getTegenstanderNaam() {
        return tegenstander;
    }


}