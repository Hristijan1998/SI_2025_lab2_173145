# SI_lab2_173145

**Name:** Христијан Чаушоски  
**Index:** 173145  

## Task 2: Control Flow Graph
![CFG](cfg.png)

## Task 3: Cyclomatic Complexity
- Formula: V(G) = E - N + 2P = 27 - 19 + 2 = 10
- Explanation: The function has 10 independent paths, each representing a possible logical route through the function.

## Task 4: Every Statement Testing
### Test Case:
- Input: item1 ("Apple", 2, 150, 0.0), item2 ("Banana", 12, 310, 0.1), item3 ("Pear", 1, 100, 0.2)
- Card Number: "1234567812345678"
- Covers all statements: normal flow, discount and non-discount, penalty conditions.

## Task 5: Multiple Condition Testing
### Condition:
```java
if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10)
```

### Truth Table:
| Price > 300 | Discount > 0 | Quantity > 10 | Result |
|-------------|--------------|----------------|--------|
| F           | F            | F              | F      |
| T           | F            | F              | T      |
| F           | T            | F              | T      |
| F           | F            | T              | T      |

- Minimum test cases: 4 (one for each row)

## Unit Tests
- Implemented in `SILab2Test.java` using JUnit 5
