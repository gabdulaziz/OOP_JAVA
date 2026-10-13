public abstract class Shape {
    private final String name;

    protected Shape(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract double_area();

    public void printInfo() {
        System.out.println(name + "area = " + area());
    }
}
