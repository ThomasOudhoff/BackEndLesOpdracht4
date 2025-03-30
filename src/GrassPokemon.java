class GrassPokemon extends Pokemon {
    private String leafMove;
    private int leafHpDamage;

    public GrassPokemon(String type, int hp, String name, String leafMove, int leafHpDamage) {
        super(type, hp, name);
        this.leafMove = leafMove;
        this.leafHpDamage = leafHpDamage;
    }

    public String getLeafMove() {
        return leafMove;
    }

    public void setLeafMove(String leafMove) {
        this.leafMove = leafMove;
    }

    public int getLeafHpDamage() {
        return leafHpDamage;
    }

    public void setLeafHpDamage(int leafHpDamage) {
        this.leafHpDamage = leafHpDamage;
    }

    public void grassAttack() {
        System.out.println(getName() + " gebruikt " + leafMove + "!");
    }

    public void grassHpDamage() {
        System.out.println("Deze aanval doet " + leafHpDamage + " schade!");
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