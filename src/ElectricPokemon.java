class ElectricPokemon extends Pokemon {
    private String electricMove;
    private int electricHpDamage;

    public ElectricPokemon(String type, int hp, String name, String electricMove, int electricHpDamage) {
        super(type, hp, name);
        this.electricMove = electricMove;
        this.electricHpDamage = electricHpDamage;
    }

    public String getElectricMove() {
        return electricMove;
    }

    public void setElectricMove(String electricMove) {
        this.electricMove = electricMove;
    }

    public int getElectricHpDamage() {
        return electricHpDamage;
    }

    public void setElectricHpDamage(int electricHpDamage) {
        this.electricHpDamage = electricHpDamage;
    }

    public void thunderAttack() {
        System.out.println(getName() + " gebruikt " + electricMove + "!");
    }

    public void electricHpDamage() {
        System.out.println("Deze aanval doet " + electricHpDamage + " schade!");
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
