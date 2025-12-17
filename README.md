# 🍲 Recipe Generator

## Project Overview

The **Recipe Generator** is a foundational Java application designed to streamline the meal preparation process by suggesting recipes based on a user's available ingredients and personal culinary preferences. It moves beyond static recipe lists by utilizing algorithmic logic to match available stock with potential meals.

This project serves as a practical, real-world demonstration of core Java programming principles, offering a clear and well-structured example of how to build a functional application from the ground up.

## Key Features

The application provides the following core functionalities:

* **Ingredient-Based Search:** Users can input a list of ingredients they currently have, and the application will filter and suggest recipes that can be made using those items.
* **Preference Filtering:** Recipes can be filtered based on user preferences, such as dietary restrictions (e.g., vegetarian, vegan), cuisine type, or required preparation time.
* **Recipe Data Management:** The application efficiently manages a database of recipes, allowing for easy adding, viewing, and searching.
* **Persistent Storage:** Recipes are stored using file handling mechanisms, ensuring that the recipe database is persistent across application sessions (e.g., stored in a `.txt` or `.csv` file).
* **Basic User Interface:** Features a straightforward, console-based (or simple GUI) interface for easy user interaction.

## Technologies Used

This project is built using the following technologies and languages, focusing entirely on fundamental principles:

| Technology | Purpose |
| :--- | :--- |
| **Java (Core SE)** | The primary programming language. |
| **Data Structures** | Extensive use of collections like `ArrayList` and `HashMap` for efficient storage and retrieval of recipe and ingredient data. |
| **File I/O (`java.io`)** | Used for reading from and writing to local files to maintain the persistent recipe database. |
| **Object-Oriented Programming (OOP)** | Demonstrates solid OOP design through the creation of classes like `Recipe`, `Ingredient`, and `GeneratorService`. |

## Core Java Principles Demonstrated

This project is an excellent resource for anyone looking to understand or practice the following Java concepts:

1.  **Object-Oriented Design:** Implementation of classes (`Recipe`, `Ingredient`) with properties and methods, and the application of inheritance/composition principles.
2.  **Data Structures and Algorithms:** Efficient use of Java Collections Framework for complex data management, such as mapping ingredients to recipes and filtering large lists.
3.  **Exception Handling:** Robust use of `try-catch` blocks to manage potential runtime issues, particularly during file operations and user input parsing.
4.  **File Handling and Persistence:** Demonstrating how to read recipe data from an external source on startup and save modifications before shutdown, ensuring data durability.
5.  **User Input Management:** Proper use of the `Scanner` class or other input methods to safely and effectively gather information from the user.

## Getting Started

Follow these steps to set up and run the Recipe Generator application on your local machine.

### Prerequisites

* **Java Development Kit (JDK) 8 or newer** must be installed on your system.
* An Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or VS Code is recommended for development, but optional for execution.

### Installation and Setup

1.  **Clone the Repository:**
    ```bash
    git clone [https://github.com/raymondoyondi/Recipe-Generator.git](https://github.com/raymondoyondi/Recipe-Generator.git)
    cd Recipe-Generator
    ```

2.  **Compile the Code:**
    If using a command line (assuming source files are in `src/`):
    ```bash
    javac src/*.java
    ```
    *If using an IDE, the compilation step will be handled automatically.*

3.  **Run the Application:**
    Execute the main class (assuming it's named `Main` or `RecipeApp`):
    ```bash
    java Main
    # or
    java RecipeApp
    ```

## Usage

Upon starting the application, you will be presented with a main menu. The typical workflow involves:

1.  **Input Ingredients:** Select the option to list your available ingredients (e.g., "chicken, rice, broccoli").
2.  **Set Preferences (Optional):** Define any filters (e.g., "under 30 minutes prep time").
3.  **Generate Recipes:** The system processes the input and presents a list of suitable recipes.
4.  **View Details:** Select a recipe from the list to view its full instructions, required quantities, and nutritional information (if available in the data source).

## Future Enhancements

The project is continually open to improvements. Potential future features include:

* **GUI Implementation:** Migrating from a console-based interface to a modern graphical user interface (using Swing, JavaFX, or an alternative).
* **Database Integration:** Replacing simple file handling with a structured database (like SQLite or MySQL) for more scalable and robust recipe storage.
* **External API Integration:** Connecting to public recipe APIs (e.g., Edamam, Spoonacular) to expand the recipe database.
* **Advanced Matching:** Implementing a "near-match" algorithm that suggests recipes where only one or two minor ingredients are missing.

## Contributing

Contributions are welcome! If you have suggestions for new features, bug fixes, or improvements to the codebase or documentation, please follow these steps:

1.  Fork the repository.
2.  Create a new branch (`git checkout -b feature/AmazingFeature`).
3.  Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4.  Push to the branch (`git push origin feature/AmazingFeature`).
5.  Open a Pull Request.

## License

This project is licensed under the MIT License - see the `LICENSE` file for details.
