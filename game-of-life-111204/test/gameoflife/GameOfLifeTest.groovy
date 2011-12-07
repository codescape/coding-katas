package gameoflife

import org.junit.Test

class GameOfLifeTest {

    @Test
    void "world with a single living cell returns this cell if asked for living cells"() {
        assert new GameOfLife(new Cell(1, 1)).livingCells == [new Cell(1, 1)] as Set<Cell>
    }

    @Test
    void "a cell can be created with two coordinates"() {
        def cell = new Cell(1, 4)
        assert cell.x == 1
        assert cell.y == 4
    }

    @Test
    void "world with multiple living cells returns these cells if asked for living cells"() {
        assert new GameOfLife(new Cell(0, 0), new Cell(1, 1)).livingCells == [new Cell(0, 0), new Cell(1, 1)] as Set<Cell>
    }

    @Test
    void "world with a horzontal blinker evolves to vertical blinker"() {
        assert new GameOfLife(new Cell(0, 1), new Cell(1, 1), new Cell(2, 1)).evolve().livingCells == [new Cell(1, 0), new Cell(1, 1), new Cell(1, 2)] as Set<Cell>
    }

    @Test
    void "candidates for a cell returns all surrounding cells and the cell itself"() {
        assert new Cell(1, 1).candidates == [[0, 0], [0, 1], [0, 2], [1, 0], [1, 1], [1, 2], [2, 0], [2, 1], [2, 2]].collect { it as Cell } as Set<Cell>
    }

    @Test
    void "candidate will live it is in the list of living cells and has two neighbours"() {
        assert new Cell(1, 1).willLive([new Cell(0, 0), new Cell(1, 1), new Cell(2, 2)])
    }

    @Test
    void "cell is living if it is contained in the list of living cells"() {
        assert new Cell(1, 1).isAlive([new Cell(1, 1)])
    }

    @Test
    void "cell is dead if is is not contained in the list of living cells"() {
        assert !new Cell(1, 1).isAlive([new Cell(0, 0)])
    }

}
