package ru.skypro;

public class Slizerin extends Hogwarts{
    private int trick;
    private int determinamion;
    private int ambitions;
    private int power;

    public Slizerin(String name, int witchcraft, int transgrassy, int trick, int determinamion, int ambitions,int power) {
        super(name, witchcraft, transgrassy);
        this.trick = trick;
        this.determinamion = determinamion;
        this.ambitions = ambitions;
        this.power = power;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getAmbitions() {
        return ambitions;
    }

    public void setAmbitions(int ambitions) {
        this.ambitions = ambitions;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return this.getName()+"\nМагия: "+this.getWitchcraft()+"\nТрансгрессия: "+this.getTransgrassy()+"\nХитрость: " + trick +"\nРешительность: " + determinamion +
                "\nАмбициозность: " + ambitions +
                "\nЖажда власти: " + power;
    }
    public void compare (Slizerin slizerin) {
        if (this.getWitchcraft() + this.getTransgrassy() + this.trick + this.determinamion + this.ambitions + this.power >
                slizerin.getWitchcraft() + slizerin.getTransgrassy() + slizerin.trick + slizerin.determinamion + slizerin.ambitions + slizerin.power) {
            System.out.println(this.getName() + " в целом умнее, чем " + slizerin.getName());
        } else if (this.getWitchcraft() + this.getTransgrassy() + this.trick + this.determinamion + this.ambitions + this.power <
                slizerin.getWitchcraft() + slizerin.getTransgrassy() + slizerin.trick + slizerin.determinamion + slizerin.ambitions + slizerin.power) {
            System.out.println(slizerin.getName() + " в целом умнее, чем " + this.getName());
        } else {
            System.out.println("Способности студентов одинаковы");
        }
    }
}
