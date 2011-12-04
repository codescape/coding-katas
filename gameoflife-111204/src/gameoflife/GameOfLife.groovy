package gameoflife

class GameOfLife {

    def livingCells = []

    GameOfLife(Cell... livingCells) {
        this.livingCells = livingCells as Set<Cell>
    }

    def evolve() {
        new GameOfLife(livingCells.candidates.flatten().findAll { it.willLive(livingCells) } as Cell[])
    }

}
