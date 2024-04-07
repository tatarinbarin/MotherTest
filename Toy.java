import java.util.Random;

/**
 * класс игрушка
 */
public class Toy {

    Random rnd = new Random();

    protected String id; // ID
    protected String name; // наименование
    protected int quantity; // количество
    protected int luckyChance; // шанс выпада в %

    public Toy(String id, String name, int quantity, int luckyChance) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.luckyChance = luckyChance;
    }

    // #region Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getLuckyChance() {
        return luckyChance;
    }
    // #endregion

    @Override
    public String toString() {
        return String.format("ID:%s - Наименование:%s - Кол-во:%s - Шанс:%s", 
        id, name, quantity, luckyChance);
    }

}
