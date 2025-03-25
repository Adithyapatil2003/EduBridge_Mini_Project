# 🏏 IPL Auction Game in Java

## 🚀 Overview
The **IPL Auction Game** is a two-player Java-based console application that simulates an IPL-style cricket auction. Players answer IPL trivia questions to increase their budget and then participate in bidding for popular cricket players. The game concludes with a voting system to determine the stronger team.

---

## 💻 How to Run

1. Install **Java** (JDK 8 or above) on your system.
2. Compile the program using:
    ```bash
    javac IPL_AUCTION.java
    ```
3. Run the program using:
    ```bash
    java IPL_AUCTION
    ```

---

## 🎯 Gameplay Instructions

### 🟡 Start Screen
- Enter `I` → View instructions.
- Enter `P` → Start the game.

### 🔵 Team Selection
- Player 1 and Player 2 select their IPL teams from the following:
    - `CSK`, `RR`, `DD`, `RCB`, `KKR`, `KXIP`, `MI`, `SRH`.

### 🔥 Trivia Questions
- Each player answers one IPL-related question.
- A correct answer adds **25cr** to their budget.

### ⚡ Auction Phase
- 30 cricket players are auctioned one by one.
- **Base price** starts at **2cr**.
- Players can:
    - **Raise the bid** → Press `R`
    - **Quit the bid** → Press `Q`
- Each raise:
    - **+0.2cr** if the bid is below **5cr**.
    - **+0.5cr** if the bid reaches or exceeds **5cr**.
- The player with the highest bid wins the player, and the cost is deducted from their purse.

### 🗳️ Voting Phase
- 10 virtual voters vote for the stronger squad.
- Press `1` → Vote for **Player 1’s team**.
- Press `2` → Vote for **Player 2’s team**.

### 🏅 Result
- The team with the most votes is declared the stronger squad.
- If votes are tied, both teams are declared equally strong.

---


## 🔥 Technologies Used

- **Java:** Core programming language.  
- **Random Class:** For generating random questions.  
- **Scanner Class:** For taking user input.  

---

## 🙌 Contributors
- **Adithya M Patil**

✅ **Enjoy the IPL Auction Game! 🏏🎯**
