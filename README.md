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


## Task 4: Independent Paths

1. Valid item with no discount, valid 16-digit numeric card → normal flow.
2. `allItems == null` → throws "list can't be null" exception.
3. An item has null or empty name → throws "Invalid item!" exception.
4. An item has `price > 300`, `discount > 0`, or `quantity > 10` → penalty applied via `sum -= 30`.
5. Item has `discount > 0` → discounted price is added.
6. Invalid card number (not 16 digits or contains non-digits) → throws "Invalid card number" or "Invalid character" exception.

---

## Task 5: Multiple Condition Test Cases

### Condition:
```java
if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10)

## Notes

- The CFG and complexity are based on the latest version of the `checkCart` method.
