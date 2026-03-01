/*
Project: Locate Largest Element in 2D Array

Goal:
- Prompt user for number of rows and columns
- Create 2D double array
- Read user input into array
- Find largest value in array
- If multiple max values:
    -> choose smallest row index
    -> then smallest column index
- Return a Location object containing:
    - maxValue
    - row index (x)
    - column index (y)

Implementation Plan:
1) In main:
   - Read rows & columns
   - Create double[][] array
   - Fill array
   - Call locateLargest()
   - Print result in required format

2) In locateLargest():
   - Initialize maxValue to a[0][0]
   - Track row (x) and column (y)
   - Traverse array with nested loops
   - Update only if strictly greater
     (this automatically preserves smallest row/col in ties)

3) Create Location class with:
   - double maxValue
   - int x
   - int y
*/