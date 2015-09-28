package mx.iteso.observer;

/**
 * Created by giovanni on 24/09/2015.
 */
public class Scorer {
    private String name;
    private int number;
    private String position;
    private String team;

    public Scorer(String name, int num, String pos, String team){
        this.name = name;
        this.number = num;
        this.position = pos;
        this.team = team;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int num) {
        this.number = num;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String toString(){
        return "Name: " + name + ", Number: " + number + ", Position: " + position + ", Team: " + team;
    }
}
