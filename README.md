🐢 Turtle Drawing Program
A Java-based Turtle Graphics Program that lets you draw shapes and patterns on a canvas using simple commands.
This project demonstrates Object-Oriented Programming (OOP) concepts like inheritance, composition, and encapsulation in a fun and interactive way.

✨ Features
🖊️ Pen & Line Drawing

The Pen class uses the Line class to draw on the Canvas.
The Point class is used across Pen, Line, and Canvas to manage positions.
🐢 Turtle Graphics

The Turtle class extends Pen.
The turtle moves around the canvas and draws based on commands.
Commands include:
F → Move forward
+ → Turn right
🎮 User Control Modes

Free Mode (Arrow Control) → Control the turtle with arrow keys.
Command Mode (F+F+F+F) → Enter commands like F+F+F+F to draw shapes.
Predefined Mode → Automatically draw shapes like a Square 🟥 or Zigzag 🌀.
🎨 Canvas Drawing

A simple canvas pops up in a JFrame window where all drawings are rendered.
📂 Project Structure
TURTLE/
│── Main.java
│
├── App/
│   └──App.java 
│
├── Commands/
│   ├── Finalrun.java
│   ├── Arrow.java
│   ├── ArrowRun.java
│   ├── BuiltIn_Cmd.java
│   ├── BuiltIn_Cmd_Run.java
│   └── T_Run.java
│
├── Drawing/
│   ├── Canvas.java
│   ├── Line.java
│   └── Pen.java
│
├── Geometry/
│   └── Point.java
│
└── Turtle/
    └── Turtle.java

🚀 Getting Started
🔧 Prerequisites
Java Development Kit (JDK 17+) installed
Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or terminal
▶️ Run the Program
Clone this repository:
git clone https://github.com/your-username/turtle-drawing-program.git
Open in your Java IDE or navigate in terminal.

Run Main.java.

Select a mode when prompted:

1 → Free Mode (Arrow keys)

2 → Command Mode (F+F+F+F)

3 → Predefined Shapes (Square/Zigzag)

🖼️ Example Usage In Mode 1, move the turtle around freely with your arrow keys 🕹️

Entering this command sequence in Mode 2:

F, then +, then F, then +, then F, then +, then F

Will draw a square on the canvas ✅

In Mode 3, There are two options press 1 for Square and 2 for Zigzag.

📌 GitHub: gihub.com/ashhadmatlub
