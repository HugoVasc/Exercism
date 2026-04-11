class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter {

    public String toString(){
        return("Fighter is a Warrior");
    }

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        if(fighter.isVulnerable()){
            return 10;
        }
        else {
            return 6;
        }
    }
}

// TODO: define the Wizard class
class Wizard extends Fighter {

    public String toString(){
        return("Fighter is a Wizard");
    }

    private boolean preparedSpell = false;

    public void prepareSpell(){
        this.preparedSpell = true;
    }

    @Override
    public boolean isVulnerable() {
        if(preparedSpell){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        if(this.preparedSpell){
            return 12;
        }
        else {
            return 3;
        }
    }
}
