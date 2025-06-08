# Христијан Чаушоски - 173145

## Software Testing - Laboratory Exercise 2

### Task Description

This lab involves:

- Writing unit tests for the `checkCart` method in the `SILab2` class.
- Drawing the Control Flow Graph (CFG).
- Calculating the Cyclomatic Complexity.
- Identifying independent execution paths.

---

## Task 1: Unit Tests

Unit tests are written in the `SILab2Test.java` file using **JUnit**.  
The tests cover the following scenarios:

- `allItems` is null → throws exception.
- An item with null or empty name → throws exception.
- An item with discount and high price triggers penalty and applies discount.
- An item with no discount is added normally.
- Valid and invalid credit card numbers.

---

## Task 2: Control Flow Graph

![Control Flow Graph](CFG.png)

---

## Task 3: Cyclomatic Complexity

- **Formula**:  
  \[
  V(G) = E - N + 2P = 22 - 18 + 2 = 6
  \]

- **Explanation**:  
  The Cyclomatic Complexity is 6, which means there are 6 independent paths through the function. This value is based on:
  - **18 nodes**
  - **22 edges**
  - **1 connected component (P = 1)**

---
