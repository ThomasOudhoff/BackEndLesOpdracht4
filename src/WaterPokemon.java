class WaterPokemon extends Pokemon {
    private String waterAttack;
    private int waterHpDamage;

    public WaterPokemon(String type, int hp, String name, String waterAttack, int waterHpDamage) {
        super(type, hp, name);
        this.waterAttack = waterAttack;
        this.waterHpDamage = waterHpDamage;
    }

    public String getWaterAttack() {
        return waterAttack;
    }

    public void setWaterAttack(String waterAttack) {
        this.waterAttack = waterAttack;
    }

    public int getWaterHpDamage() {
        return waterHpDamage;
    }

    public void setWaterHpDamage(int waterHpDamage) {
        this.waterHpDamage = waterHpDamage;
    }

    public void splashAttack() {
        System.out.println(getName() + " gebruikt " + waterAttack + "!");
    }

    public void aquaDamage() {
        System.out.println("Deze aanval doet " + waterHpDamage + " schade!");
    }

    @Override
    public void pokemonAttack() {
        super.pokemonAttack();
    }

    @Override
    public void pokemonLoseHP() {
        super.pokemonLoseHP();
    }
}