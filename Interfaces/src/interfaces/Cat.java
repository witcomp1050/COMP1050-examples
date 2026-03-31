package interfaces;

//Cat class implements Pet interface
class Cat implements Pet {
 private String name;
 private String id;
 private boolean hasHairballs;

 public Cat(String name, String id, boolean hasHairballs) {
     this.name = name;
     this.id = id;
     this.hasHairballs = hasHairballs;
 }

 @Override
 public String getName() { return name; }

 @Override
 public String getId() { return id; }

 @Override
 public String makeSound() { return "Meow!"; }

 public boolean hasHairballs() { return hasHairballs; }
}

