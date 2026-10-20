City Racer (Strategy Pattern in Java)

Simple practice task exploring the strategy design pattern in Java. 
The goal was to build a player whose movement logic can be swapped dynamically at runtime without any if-else checks.

How it works:
MoveStrategy is a basic interface with a single move method.
Concrete strategies like Walking, Skateboarding, and Jetpack each handle their own speed and output. 
The Player class holds a reference to a MoveStrategy and simply delegates the move call to it. 
Using setStrategy, we can instantly switch movement modes mid-run.

How to run:
Run Main.java in IntelliJ IDEA or compile and run using terminal:

javac src/Main.java
java -cp src Main
