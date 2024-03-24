import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void testWhenSecondPlayerWin(){
        Player petya =new Player(123, "Петя",120);
        Player vasya = new Player(124365, "Вася",100);
        Game game= new Game();
        game.register(petya);
        game.register(vasya);
        int actual = game.round("Вася","Петя");
        int expected = 2;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testWhenFirstPlayerWin(){
        Player petya =new Player(1, "Петя",120);
        Player vasya = new Player(2, "Вася",100);
        Game game= new Game();
        game.register(petya);
        game.register(vasya);
        int actual = game.round("Вася", "Петя");
        int expected = 1;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testWhenStrenghtsEquel(){
        Player petya =new Player(1, "Петя",100);
        Player vasya = new Player(2, "Вася",100);
        Game game= new Game();
        game.register(petya);
        game.register(vasya);
        int actual = game.round("Вася", "Петя");
        int expected = 0;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testWhenFirstNotExist(){
        Player petya =new Player(123, "Петя",100);

        Game game= new Game();
        game.register(petya);

        Assertions.assertThrows(NotRegisteredException.class,()->game.round("Жора","Петя"));

    }
    @Test
    public void testWhenSecondNotExist(){
        Player petya =new Player(123, "Петя",100);

        Game game= new Game();
        game.register(petya);

        Assertions.assertThrows(NotRegisteredException.class,()->game.round("Петя","Жора"));

    }


}
