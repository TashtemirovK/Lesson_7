public class Medic extends Hero {

    public int healPoints;

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }


    public void applySuperAbility(){
        System.out.println("Medic fil in health");
    }

    @Override
    public String having(int health, int damage, int superAbility) {
        return null;
    }
}
