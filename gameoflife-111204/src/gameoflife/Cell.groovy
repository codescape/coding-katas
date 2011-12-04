package gameoflife

import groovy.transform.Canonical

@Canonical
class Cell {

    int x
    int y

    def getCandidates() {
        (-1..1).collect { dx -> (-1..1).collect { dy -> new Cell(x + dx, y + dy)}}.flatten() as Set<Cell>
    }

    def willLive(livingCells) {
        isAlive(livingCells) && livingNeighbours(livingCells) == 2 || livingNeighbours(livingCells) == 3
    }

    def livingNeighbours(livingCells) {
        (candidates - this).count { it.isAlive(livingCells) }
    }

    def isAlive(livingCells) {
        this in livingCells
    }

}
