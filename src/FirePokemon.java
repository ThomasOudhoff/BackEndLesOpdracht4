class FirePokemon extends Pokemon {
    private String spitFlame;
    private int flameHpDamage;

    public FirePokemon(String type, int hp, String name, String spitFlame, int flameHpDamage) {
        super(type, hp, name);
        this.spitFlame = spitFlame;
        this.flameHpDamage = flameHpDamage;
    }

    public String getSpitFlame() {
        return spitFlame;
    }

    public void setSpitFlame(String spitFlame) {
        this.spitFlame = spitFlame;
    }

    public int getFlameHpDamage() {
        return flameHpDamage;
    }

    public void setFlameHpDamage(int flameHpDamage) {
        this.flameHpDamage = flameHpDamage;
    }

    public void fireAttack() {
        System.out.println(getName() + " doet " + spitFlame + " aanval!");
    }

    public void flameHpDamage() {
        System.out.println("Deze aanval doet " + flameHpDamage + " schade!");
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
