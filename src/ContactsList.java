class Person {

    String name;
    String phoneNumber;
    String email;

    // método construtor de uma classe Java
    public Person(String name, String phoneNumber, String email) {

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

    // métodos setter - alterar valores
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}