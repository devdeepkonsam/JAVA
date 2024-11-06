// script.js

const boardSize = 100; // 10x10 board
const players = [
  { position: 0, color: 'red' },
  { position: 0, color: 'blue' },
];
let currentPlayerIndex = 0;
const board = document.getElementById('board');
const diceResult = document.getElementById('diceResult');
const playerTurn = document.getElementById('playerTurn');

// Define snakes and ladders
const snakesLadders = {
  16: 6, 47: 26, 49: 11, 56: 53, 62: 19, 64: 60, 87: 24, 93: 73, 95: 75, 98: 78,
  1: 38, 4: 14, 9: 31, 21: 42, 28: 84, 36: 44, 51: 67, 71: 91, 80: 99
};

// Initialize the board
for (let i = boardSize; i > 0; i--) {
  const cell = document.createElement('div');
  cell.classList.add('cell');
  cell.id = `cell-${i}`;
  cell.textContent = i;
  board.appendChild(cell);
}

// Roll Dice
function rollDice() {
  const dice = Math.floor(Math.random() * 6) + 1;
  diceResult.textContent = `Dice: ${dice}`;
  movePlayer(dice);
}

// Move Player
function movePlayer(dice) {
  const player = players[currentPlayerIndex];
  let newPosition = player.position + dice;
  
  // Check if player goes beyond the board
  if (newPosition > boardSize) {
    newPosition = player.position; // Stay in place
  } else if (snakesLadders[newPosition]) {
    newPosition = snakesLadders[newPosition]; // Move to snake/ladder end
  }
  
  updatePlayerPosition(player, newPosition);
  
  // Check for win
  if (newPosition === boardSize) {
    alert(`Player ${currentPlayerIndex + 1} wins!`);
    resetGame();
  } else {
    // Switch turns
    currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
    playerTurn.textContent = `Player ${currentPlayerIndex + 1}'s Turn`;
  }
}

// Update Player Position
function updatePlayerPosition(player, newPosition) {
  const oldCell = document.getElementById(`cell-${player.position}`);
  if (oldCell) oldCell.innerHTML = player.position || '';

  player.position = newPosition;
  
  const newCell = document.getElementById(`cell-${newPosition}`);
  if (newCell) {
    const playerToken = document.createElement('div');
    playerToken.classList.add('player');
    playerToken.style.backgroundColor = player.color;
    newCell.appendChild(playerToken);
  }
}

// Reset Game
function resetGame() {
  players.forEach(player => player.position = 0);
  document.querySelectorAll('.player').forEach(el => el.remove());
  currentPlayerIndex = 0;
  playerTurn.textContent = "Player 1's Turn";
}
