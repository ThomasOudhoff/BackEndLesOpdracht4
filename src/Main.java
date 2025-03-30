public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.startKeuzeMenu();

        PokemonSelector selector = new PokemonSelector(menu);
        selector.choosePokemon();
        selector.chooseOpponent();
        selector.printMatch();

        Pokemon jouwPokemon = selector.getGekozenPokemon();
        if (jouwPokemon instanceof WaterPokemon) {
            ((WaterPokemon) jouwPokemon).splashAttack();
            ((WaterPokemon) jouwPokemon).aquaDamage();
        } else if (jouwPokemon instanceof FirePokemon) {
            ((FirePokemon) jouwPokemon).fireAttack();
            ((FirePokemon) jouwPokemon).flameHpDamage();
        } else if (jouwPokemon instanceof GrassPokemon) {
            ((GrassPokemon) jouwPokemon).grassAttack();
            ((GrassPokemon) jouwPokemon).grassHpDamage();
        } else if (jouwPokemon instanceof ElectricPokemon) {
            ((ElectricPokemon) jouwPokemon).thunderAttack();
            ((ElectricPokemon) jouwPokemon).electricHpDamage();
        }

    }
}
