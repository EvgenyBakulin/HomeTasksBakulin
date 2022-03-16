package ru.skypro;

public class Hufflepuff extends Hogwarts{
    private int honesty;
    private int loyality;
    private int industry;

    public Hufflepuff(String name, int witchcraft, int transgrassy, int honesty, int loyality, int industry) {
        super(name, witchcraft, transgrassy);
        this.honesty = honesty;
        this.loyality = loyality;
        this.industry = industry;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getLoyality() {
        return loyality;
    }

    public void setLoyality(int loyality) {
        this.loyality = loyality;
    }

    public int getIndustry() {
        return industry;
    }

    public void setIndustry(int industry) {
        this.industry = industry;
    }
    @Override
    public String toString() {
        return this.getName()+"\nМагия: "+this.getWitchcraft()+"\nТрансгрессия: "+this.getTransgrassy()+"\nЧестность: " + honesty +"\nВерность: " + loyality +
                "\nТрудолюбие: " + industry;
    }
    public void compare (Hufflepuff hufflepuff) {
        if (this.getWitchcraft()+this.getTransgrassy()+this.industry+this.loyality+this.honesty>
                hufflepuff.getWitchcraft()+hufflepuff.getTransgrassy()+hufflepuff.honesty+hufflepuff.loyality+hufflepuff.industry) {
            System.out.println(this.getName()+" в целом умнее, чем "+hufflepuff.getName());
        }
        else if (this.getWitchcraft()+this.getTransgrassy()+this.industry+this.loyality+this.honesty<
                hufflepuff.getWitchcraft()+hufflepuff.getTransgrassy()+hufflepuff.honesty+hufflepuff.loyality+hufflepuff.industry) {
            System.out.println(hufflepuff.getName()+" в целом умнее, чем "+this.getName());
        }
        else {
            System.out.println("Способности студентов одинаковы");
        }
    }
}
