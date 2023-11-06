public class Entity {
    private double HP ;
    private double mana;
    private double AD;
    private double AP;
    private double MS;
    private Point location;
    private String name;
    private int Team;

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getAD() {
        return AD;
    }

    public void setAD(double AD) {
        this.AD = AD;
    }

    public double getAP() {
        return AP;
    }

    public void setAP(double AP) {
        this.AP = AP;
    }

    public double getMS() {
        return MS;
    }

    public void setMS(double MS) {
        this.MS = MS;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeam() {
        return Team;
    }

    public void setTeam(int team) {
        Team = team;
    }
}
