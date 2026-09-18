# COMP 1050 Computer Science II: class examples

Every Java program shown on the lecture slides, one folder per lecture in the order the course teaches them.
Each `SlideNN.java` is the complete, runnable program behind slide NN of that lecture; each folder's own README
lists friendly aliases and any notes. Every program was compiled and run on JDK 25 before it went on a slide.

| Folder | Lecture | Programs |
|---|---|---|
| [`01-getting-started-with-java/`](01-getting-started-with-java/) | Getting Started with Java | 8 |
| [`02-java-fundamentals/`](02-java-fundamentals/) | Java Fundamentals | 49 |
| [`03-methods-arrays-files-tests/`](03-methods-arrays-files-tests/) | Methods, Arrays, File I/O & Unit Tests | 15 |
| [`04-classes-objects-composition/`](04-classes-objects-composition/) | Classes, Objects, Encapsulation & Composition | 19 |
| [`05-inheritance-polymorphism-abstract/`](05-inheritance-polymorphism-abstract/) | Inheritance, Polymorphism & Abstract Classes | 11 |
| [`06-interfaces-generics-collections/`](06-interfaces-generics-collections/) | Interfaces, Generics & Collections | 13 |
| [`07-lists-iterators-stacks-queues/`](07-lists-iterators-stacks-queues/) | Lists, Iterators, Stacks & Queues | 14 |
| [`08-sets-maps-equality-hashing/`](08-sets-maps-equality-hashing/) | Sets, Maps, Equality & Hashing | 13 |
| [`09-recursion/`](09-recursion/) | Recursion & Reasoning About Execution | 10 |
| [`10-javafx-fundamentals/`](10-javafx-fundamentals/) | JavaFX Fundamentals & Application Structure | 10 |
| [`11-events-lambdas-fxml/`](11-events-lambdas-fxml/) | Events, Lambdas, FXML & Scene Builder | 10 |
| [`12-gui-integration-persistence/`](12-gui-integration-persistence/) | GUI Integration, Persistence & Usability | 10 |
| [`13-exam-2-review/`](13-exam-2-review/) | Exam 2 Review | 5 |

## Running an example

- **Eclipse (course IDE):** File → Import → Git → Projects from Git → Clone URI with this repository's address, then open any folder in the Package Explorer. Right-click a `SlideNN.java` file → Run As → Java Application. Each file is self-contained, so no project setup is needed beyond JDK 25.
- **Terminal:** `cd` into a folder and run `java Slide07.java` (JDK 25 compiles and runs a single file in one step).
- **JavaFX examples** (the three JavaFX lectures): copy the file into the course JavaFX starter or a JavaFX assignment project and run it with Maven goal `javafx:run`; plain `java` cannot find the JavaFX libraries.
- **JUnit examples** (files that contain `@Test`): copy them into the `src/test/java` folder of any course project and Run As → JUnit Test.

## Using these examples

Read, run, change, predict, run again. Break one on purpose and read the error. Copying an example into an assignment
is allowed when the assignment's AI and collaboration rules allow it, and you must be able to explain every line.

© Yetunde Longe-Folajimi. Shared with students of COMP 1050 at Wentworth Institute of Technology for their own study; not for
redistribution.
