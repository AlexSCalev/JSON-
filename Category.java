package dto;

public class Category {
    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    private int id;
    private String name;
    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
