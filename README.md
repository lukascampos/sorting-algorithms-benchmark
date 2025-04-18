# 📊 Sorting Algorithms Benchmark

## 📌 Description

This project benchmarks the execution time of different sorting algorithms under various conditions.  
The goal is to compare their performance with different **input sizes** and **initial orderings**.

### 🧠 Sorting Algorithms Tested

- Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort
- Heap Sort
- Counting Sort
- Quick Sort

### 🧪 Test Cases

Each algorithm will be tested with array sizes of:

- **1,000 elements**
- **5,000 elements**
- **10,000 elements**
- **30,000 elements**

And under three input conditions:

- **Random order**
- **Sorted (ascending)**
- **Reverse order (descending)**

---

## 🛠️ Usage

1. Use existing implementations of the sorting algorithms (from libraries or trusted sources).
2. Measure the **execution time** for each case using a high-resolution timer.
3. Fill in the results table below.
4. Create **graphs** to visualize the results (in Excel or Google Sheets).
5. Submit:
   - The code used to run the benchmarks
   - The spreadsheet with results and graphs

---

## 📄 Results Table

Fill in the execution times (in milliseconds or seconds, be consistent):

| Algorithm      | 1,000 (Random) | 1,000 (Sorted) | 1,000 (Reverse) | 5,000 (Random) | 5,000 (Sorted) | 5,000 (Reverse) | 10,000 (Random)  | 10,000 (Sorted)  | 10,000 (Reverse)  | 30,000 (Random)  | 30,000 (Sorted)  | 30,000 (Reverse)  |
|----------------|----------------|----------------|-----------------|----------------|----------------|-----------------|------------------|------------------|-------------------|------------------|------------------|-------------------|
| Bubble Sort    |     0s 3ms     |     0s 3ms     |     0s 3ms      |     0s 28ms    |     0s 9ms     |     0s 13ms     |     0s 109ms     |     0s 22ms      |     0s 32ms       |     1s 108ms     |     0s 147ms     |     0s 257ms      |
| Selection Sort |     0s 3ms     |     0s 3ms     |     0s 2ms      |     0s 12ms    |     0s 11ms    |     0s 14ms     |     0s 27ms      |     0s 23ms      |     0s 34ms       |     0s 190ms     |     0s 134ms     |     0s 234ms      |
| Insertion Sort |     0s 2ms     |     0s 0ms     |     0s 3ms      |     0s 13ms    |     0s 0ms     |     0s 22ms     |     0s 44ms      |     0s 1ms       |     0s 77ms       |     0s 325ms     |     0s 1ms       |     0s 723ms      |
| Merge Sort     |     0s 1ms     |     0s 0ms     |     0s 0ms      |     0s 2ms     |     0s 1ms     |     0s 2ms      |     0s 3ms       |     0s 2ms       |     0s 2ms        |     0s 9ms       |     0s 5ms       |     0s 5ms        | 
| Heap Sort      |     0s 0ms     |     0s 0ms     |     0s 0ms      |     0s 2ms     |     0s 2ms     |     0s 2ms      |     0s 4ms       |     0s 3ms       |     0s 4ms        |     0s 8ms       |     0s 6ms       |     0s 6ms        |
| Counting Sort  |     0s 0ms     |     0s 0ms     |     0s 0ms      |     0s 0ms     |     0s 1ms     |     0s 2ms      |     0s 1ms       |     0s 1ms       |     0s 1ms        |     0s 2ms       |     0s 2ms       |     0s 2ms        |
| Quick Sort     |     0s 0ms     |     0s 0ms     |     0s 0ms      |     0s 1ms     |     0s 1ms     |     0s 0ms      |     0s 2ms       |     0s 1ms       |     0s 1ms        |     0s 7ms       |     0s 6ms       |     0s 6ms        |

![Sorting Performance Chart](./sorting-performance-chart.png)