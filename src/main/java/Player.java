import java.util.Objects;

public class Player {
    protected int id;
    protected String name;
    protected int strenght;

    public Player(int id, String name, int strenght) {
        this.id = id;
        this.name = name;
        this.strenght = strenght;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strenght;
    }

    //  @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //   if (o == null || getClass() != o.getClass()) return false;
    //     Player player = (Player) o;
    //    return id == player.id && strenght == player.strenght && name.equals(player.name);
    //  }

    // @Override
    //  public int hashCode() {
    //       return Objects.hash(id, name, strenght);
    //   }
}
