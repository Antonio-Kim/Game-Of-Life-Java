# Conway's Game of Life
This is Java implementation of Conway's Game of Life using Javax Swing.

![game-of-life](https://user-images.githubusercontent.com/31913979/173228523-dac0ef58-b7db-4a6b-b78f-3627fe3c47d5.gif)

You can interactively play with the game by using following keyboard buttons:
- **Enter**: randomize the squares in the game
- **Backspace**: clear the squares
- **Spacebar**: iterate the next stage of the game

User can left click on the mouse to turn on and turn off the squares. 

## Settings
You can turn off the automation by removing the newScheduleThreadPool on GamePanel.java. Changing the number of cells are also available
on GamePanel.java, with *CELLSIZE*. Changing the window size will restart the game in blank space. Background color and cell color change also be changed here

---
### Future consideration
- Change to JavaFX instead of Java Swing
- Add UI panel so that user can change settings interactively
