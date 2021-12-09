# Operating System Chooser
Thank you for taking the time to look at my resume projects! I'm still a bit new to GitHub and Git, so pardon the formatting :) .

## Overview
This is the first project on my resume, an operating system chooser created using Java in NetBeans. There are three main parts to this project: 
- Operating System Classes
- A Decision Tree
- A User Client Class

This project uses advanced data structures, inheritance, and searching and sorting.

### Operating System Classes
The first class used in this project is the `OperatingSystem.java` class. This class is used as a base class so the more advanced operating system classes (Windows, MacOS, and Linux) can inherit from it. The class `OperatingSystem.java` contains public get and set methods of different variables, including: `name`, `releaseData`, `cost`, and `use`. A `toString()` method is also found in `OperatingSystem.java`.

The `Windows.java`, `MacOS.java`, and `Linux.java` classes are all similar in nature; they are all derived classes from the `OperatingSystem.java` class. Each class continues the use of the previous variables from `OperatingSystem.java`, however, each class also adds another unique variable (with its own get, set, and updated `toString()` method) to differentiate from each other. `Windows.java` adds the `assistant` variable, `MacOS.java` adds the `updatedDesign` variable, and `Linux.java` adds the `preinstalledApps` variable.

### Decision Tree
The decision tree used in this project is an advanced data structure that uses many parts:
- A nested Binary Tree, `BinTree`, to create the node and branch structure
- Methods to add Yes and No nodes (`addYesNode` and `addNoNode`)
- Methods to search the Decision tree and sort the Yes/No nodes (`searchTreeAndAddYesNode` and `searchTreeAndAddNoNode`)

Near the end of the class, there are the methods `queryBinTree` (both default and parameterized constructors) and `askQuestion`. `askQuestion` is a method that is found in the parameterized `queryBinTree`, which is used to ask a question and add the input to the current node. `queryBinTree` is used to create and continue the question/answer flow for the `UserClient.java` class.

### User Client/Interface
The `UserClient.java` class used in this project is the interface that interacts with the user. There are three main parts to this class:
- An `options()` method, which outputs the user's options
- A `genericOS()` method, which  allows the user to select a generic OS (Linux, MacOS, or Windows) from Yes/No choices
- A `specificOS()` method, which allows the user to select a specific OS from their given generic OS option

The `options()` method uses `java.util.Scanner` to allow the program to read keyboard input. When the user runs `UserClient.java`, they have an option to choose a generic OS, to choose a specific OS, or to exit the program. If they choose generic OS, the `genericOS()` method runs, if they choose the specific OS, the `specificOS()` method runs, and if they choose to exit the program, the program terminates.

The `genericOS()` method creates a new DecisionTree called `tree`, which allows the program to ask premade questions and, based on the output, to recommend a generic OS.

The `specificOS()` method creates a new ArrayList `specificOSList`, which is used to store the specific OS variations, including Windows 7/8/10, macOS Big Sur/Catalina, or Linux Mint/Ubuntu. The method then asks questions to gain user preference to recommend a specific OS.
