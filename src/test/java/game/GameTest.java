package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    Game game = new Game();

    @Test
    void testPaperAgainstPaper() {
        // given
        Player player1 = new Player(1);
        Player player2 = new Player(1);

        // when
        Player winner = game.gewinner(player1, player2);

        // then
        assertNull(winner);
    }

    @Test
    void testRockAgainstRock() {
        // given
        Player player1 = new Player(2);
        Player player2 = new Player(2);

        // when
        Player winner = game.gewinner(player1, player2);

        // then
        assertNull(winner);
    }

    @Test
    void testScissorsAgainstScissors() {
        // given
        Player player1 = new Player(3);
        Player player2 = new Player(3);

        // when
        Player winner = game.gewinner(player1, player2);

        // then
        assertNull(winner);
    }

    @Test
    void testPaperAgainstRock() {
        // given
        Player player1 = new Player(1);
        Player player2 = new Player(2);

        // when
        Player winner = game.gewinner(player1, player2);

        // then
        assertEquals(player1, winner);
    }

    @Test
    void testPaperAgainstScissors() {
        // given
        Player player1 = new Player(1);
        Player player2 = new Player(3);

        // when
        Player winner = game.gewinner(player1, player2);

        // then
        assertEquals(player2, winner);
    }

    @Test
    void testRockAgainstPaper() {
        // given
        Player player1 = new Player(2);
        Player player2 = new Player(1);

        // when
        Player winner = game.gewinner(player1, player2);

        // then
        assertEquals(player2, winner);
    }

    @Test
    void testRockAgainstScissors() {
        // given
        Player player1 = new Player(2);
        Player player2 = new Player(3);

        // when
        Player winner = game.gewinner(player1, player2);

        // then
        assertEquals(player1, winner);
    }

    @Test
    void testScissorsAgainstPaper() {
        // given
        Player player1 = new Player(3);
        Player player2 = new Player(1);

        // when
        Player winner = game.gewinner(player1, player2);

        // then
        assertEquals(player1, winner);
    }

    @Test
    void testScissorsAgainstRock() {
        // given
        Player player1 = new Player(3);
        Player player2 = new Player(2);

        // when
        Player winner = game.gewinner(player1, player2);

        // then
        assertEquals(player2, winner);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionForPlayer1() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Player player1 = new Player(4);
            Player player2 = new Player(2);
            game.gewinner(player1, player2);
        });

        assertEquals("Illegal sign found", exception.getMessage());
    }

    @Test
    void shouldThrowIllegalArgumentExceptionForPlayer2() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Player player1 = new Player(2);
            Player player2 = new Player(4);
            game.gewinner(player1, player2);
        });

        assertEquals("Illegal sign found", exception.getMessage());
    }
}
