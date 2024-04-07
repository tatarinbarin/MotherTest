/**
 * класс игрушка
 */
public class Toy {

    private int id; // ID
    private String name; // наименование
    private int quantity; // количество
    private double weight; // шанс выпада в %

    public Toy(int id, String name, int quantity, double weight) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    // #region Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }
    // #endregion


    //#region Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //#endregion


    @Override
    public String toString() {
        return String.format("ID:%s - Наименование:%s - Кол-во:%s - Вес:%s", 
        id, name, quantity, weight);
    }

}
