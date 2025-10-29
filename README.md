> **Note: Language Context**
>
> Please note that this project was written in **German** as part of my `Ausbildung` (German vocational training). Therefore, all variable names, comments, and package/class names are in German.

---

# Java OOP Demo: Camera & Lens

## About This Project

This project is a classic, textbook demonstration of core **Object-Oriented Programming (OOP)** principles.

Instead of focusing on a complex algorithm, this project focuses on **clean architecture** and the relationship between objects. It models a `Camera` that "has a" `Lens`.

## Core OOP Concepts Demonstrated

### 1. Composition (The "HAS-A" Relationship)
This is the central concept of the project.
* A `Camera` object **has a** `Lens` object as one of its `private` fields.
* The `Camera` class "delegates" work to the `Lens` class (e.g., the `Camera.toString()` method calls `objektiv.toString()` to get the lens details).
* This demonstrates a "Composition over Inheritance" design pattern.

### 2. Encapsulation
* All class variables (fields) in both `Camera` and `Lens` are `private`.
* Access to this data is controlled *only* through public methods (Getters and Setters like `getBrand()`, `setObjektiv()`).

### 3. Constructor Validation
* The `Lens` constructor contains logic (`if (min > max)`) to validate input and throws an `IllegalArgumentException` if the data is invalid. This ensures that an "impossible" lens object can never be created.

### 4. `static` vs. Instance Variables
* The `Camera` class uses `public static int anzahlCam` to act as a *class-level counter*, tracking the total number of `Camera` objects instantiated.

### 5. `@Override` and `StringBuilder`
* Both classes feature a custom `@Override` of the `toString()` method.
* `StringBuilder` is used for efficient string concatenation to create a clean, human-readable
