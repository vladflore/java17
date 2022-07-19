package tech.vladflore.java17;

record HogwartsStudent(String name, House house) implements Wizard {

//    HogwartsStudent(String name, House house) {
//        if (name == null || name.isBlank()) {
//            throw new IllegalArgumentException("Must specify a name for the student");
//        }
//        this.name = "Dr. " + name;
//        this.house = house;
//    }

    HogwartsStudent {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Must specify a name for the student");
        }
        name = "Dr. " + name;
    }

    @Override
    public void performSpell() {
        System.out.println("Perform a spell");
    }

    @Override
    public String identify() {
        return "%s of house %s".formatted(name, house);
    }
}