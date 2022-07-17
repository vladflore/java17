public abstract sealed class HogwartsHouse permits Gryffindor, Hafflepuff, Ravenclaw, Slytherin {
    public abstract String name();

    public abstract String colors();

    public abstract String founder();

    public abstract String animal();

    public String details() {
        return String.format("%-13s - %-20s - %-20s - %-10s", name(), colors(), founder(), animal());
    }
}
