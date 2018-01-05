package com.company.do_not_open;

@Miracle
@ЦеВірус
public class RefSheldon {

    public Long id;
    public String name;
    public String surname;
    public int age;

    private String secret = "23454";

    private String getSuperSecret() {
        return "qwerty432423";
    }

    public RefSheldon(Long id, String name, String surname, int age, String secret) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public RefSheldon() {
    }
}
