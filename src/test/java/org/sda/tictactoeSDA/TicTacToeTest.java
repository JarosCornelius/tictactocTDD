package org.sda.tictactoeSDA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TicTacToeTest {
    private TicTacToe ticTacToe;


    @BeforeEach
    public void setUp()
    {
        TicTacToe ticTacToe = new TicTacToe();
    }


    @Test
    public void whenXOutsideboards() {
        assertThatThrownBy(() -> ticTacToe.play(5, 2)).isInstanceOf(RuntimeException.class);
    }

    @Test
    public void whenYOutsideBoard()
    {

        assertThatThrownBy(() -> ticTacToe.play(2, 5)).isInstanceOf(RuntimeException.class);

    }




}