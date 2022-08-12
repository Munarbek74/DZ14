package com.company;

public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }
    public void coding() {
        System.out.println("Код жазат");
    }

    public String toString() {
        return "Программисттин аты: " + getName() + " кылган иши: " + getDesignatoin() + " компаниянын аты: " + getCompanyName();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
