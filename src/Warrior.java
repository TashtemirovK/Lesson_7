public class Warrior extends Hero {
    public void applySuperAbility(){
        System.out.println("Warrior critical damage");
    }

    @Override
    public String having(int health, int damage, int superAbility) {
        return null;
    }
}
