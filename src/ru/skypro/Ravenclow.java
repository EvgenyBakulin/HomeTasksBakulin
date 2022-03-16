package ru.skypro;

public class Ravenclow extends Hogwarts{
    private int witness;
    private int wit;
    private int create;

    public Ravenclow(String name, int witchcraft, int transgrassy, int witness, int wit, int create) {
        super(name, witchcraft, transgrassy);
        this.witness = witness;
        this.wit = wit;
        this.create = create;
    }

    public int getWitness() {
        return witness;
    }

    public void setWitness(int witness) {
        this.witness = witness;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreate() {
        return create;
    }

    public void setCreate(int create) {
        this.create = create;
    }

    @Override
    public String toString() {
        return this.getName()+"\nМагия: "+this.getWitchcraft()+"\nТрансгрессия: "+this.getTransgrassy()+"\nМудрость: " + witness +"\nОстроумие: " + wit +
                "\nТворчество: " + create;
    }
    public void compare (Ravenclow ravenclow) {
        if (this.getWitchcraft() + this.getTransgrassy() + this.witness + this.wit + this.create >
                ravenclow.getWitchcraft() + ravenclow.getTransgrassy() + ravenclow.witness + ravenclow.wit + ravenclow.create) {
            System.out.println(this.getName() + " в целом умнее, чем " + ravenclow.getName());
        } else if (this.getWitchcraft() + this.getTransgrassy() + this.witness + this.wit + this.create <
                ravenclow.getWitchcraft() + ravenclow.getTransgrassy() + ravenclow.witness + ravenclow.wit + ravenclow.create) {
            System.out.println(ravenclow.getName() + " в целом умнее, чем " + this.getName());
        } else {
            System.out.println("Способности студентов одинаковы");
        }
    }
}
