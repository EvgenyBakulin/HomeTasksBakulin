package ru.skypro;

public class Griffindor extends Hogwarts{
    private int nobility;
    private int honour;
    private int brave;

    public Griffindor(String name, int witchcraft, int transgrassy, int nobility, int honour, int brave) {
        super(name, witchcraft, transgrassy);
        this.nobility = nobility;
        this.honour = honour;
        this.brave = brave;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBrave() {
        return brave;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }
    @Override
    public String toString() {
        return this.getName()+"\nМагия: "+this.getWitchcraft()+"\nТрансгрессия: "+this.getTransgrassy()+"\nБлагородсто: " + nobility +"\nЧесть: " + honour +
                "\nХрабрость: " + brave;
    }
    public void compare (Griffindor griffindor) {
        if (this.getWitchcraft() + this.getTransgrassy() + this.nobility + this.honour + this.brave >
                griffindor.getWitchcraft() + griffindor.getTransgrassy() + griffindor.honour + griffindor.nobility + griffindor.brave) {
            System.out.println(this.getName() + " в целом умнее, чем " + griffindor.getName());
        } else if (this.getWitchcraft() + this.getTransgrassy() + this.nobility + this.honour + this.brave <
                griffindor.getWitchcraft() + griffindor.getTransgrassy() + griffindor.nobility + griffindor.honour + griffindor.brave) {
            System.out.println(griffindor.getName() + " в целом умнее, чем " + this.getName());
        } else {
            System.out.println("Способности студентов одинаковы");
        }
    }
}
