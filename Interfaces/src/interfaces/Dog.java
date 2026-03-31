package interfaces;

class Dog implements Pet {
    private String name;
    private String id;

    public Dog(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() { return name; }

    @Override
    public String getId() { return id; }

    @Override
    public String makeSound() { return "Woof!"; }
}
