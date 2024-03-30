# Sudoku Solver

Sudoku Solver is a Java-based application that allows users to play and solve Sudoku puzzles. It provides a simple command-line interface for interacting with the game.

## Features

- Sudoku board with a fixed size of 9x9.
- Single-player mode.
- Partially filled board with fixed cells.
- Logic for solving Sudoku puzzles using backtracking algorithm.
- Validation of user input to ensure compliance with Sudoku rules.

## Project Structure

The project is organized into three packages:

1. `board`: Contains the `Board` class representing the Sudoku board.
2. `player`: Contains the `Player` class representing the player.
3. `logic`: Contains the `Logic` class implementing the game logic.


## Classes

### `Board`

The `Board` class represents the Sudoku board and provides methods to access and manipulate the board configuration.

### `Player`

The `Player` class encapsulates player details and provides methods to retrieve player information.

### `Logic`

The `Logic` class implements the logic for solving Sudoku puzzles. It includes methods such as `setPosition()` to fill a cell, `resetPosition()` to revert a cell back to its original state, and `isWinner()` to check if the puzzle has been solved successfully.


