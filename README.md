📌 Project Overview | 專案概述

This project focuses on the mathematical foundations of Deep Learning, specifically implementing matrix multiplication and numerical differentiation using the Central Difference Method in Java. It demonstrates how to approximate gradients, which is the core mechanism of backpropagation in neural networks.

本專案聚焦於 深度學習 的數學基礎，主要實作內容包含矩陣乘法運算，以及使用 Java 實作「中心差分法」進行數值微分。本實驗旨在展示如何透過程式逼近函數梯度，這是神經網路中反向傳播（Backpropagation）的核心機制。

🎯 Learning Objectives | 學習目標

Linear Algebra: Implement matrix multiplication $C = A \times B$ from scratch using nested loops.

Calculus Simulation: Apply the Central Difference Method to estimate the derivative of $f(x) = x^2$.

Error Analysis: Quantify the difference between numerical approximations and theoretical analytical solutions.

線性代數：使用嵌套迴圈從零實作矩陣乘法 $C = A \times B$。

微積分模擬：應用中心差分法估算函數 $f(x) = x^2$ 的導數。

誤差分析：量化數值逼近結果與理論解析解之間的差異。

🧮 Mathematical Model | 數學模型

1. Matrix Multiplication (矩陣乘法)

For matrices $A (m \times n)$ and $B (n \times p)$, the resulting matrix $C$ is calculated as:


$$C_{ij} = \sum_{k=0}^{n-1} A_{ik} B_{kj}$$

2. Numerical Derivative (數值微分)

Using the Central Difference approximation:


$$f'(x) \approx \frac{f(x+h) - f(x-h)}{2h}$$


Compared against the exact derivative for $f(x)=x^2$, which is $f'(x) = 2x$.

💻 Implementation Details | 實作細節

Language: Java 11+

Classes:

MatrixMath: Handles matrix multiplications and console formatting.

CalculusMath: Defines the target function $f(x)$ and computes derivatives.

Accuracy: Uses double precision for all floating-point calculations to minimize rounding errors.

🚀 Usage | 執行方式

Clone the repository:

git clone [https://github.com/tch107146/JAVA-0303-Assignments-3.git](https://github.com/tch107146/JAVA-0303-Assignments-3.git)


Compile:

javac JAVA_0303_Assignments_3.java


Run:

java JAVA_0303_Assignments_3


Follow the prompts to enter point $x$ and interval $h$ (e.g., $x=2, h=0.0001$).

📄 Deliverables Checklist | 作業繳交清單

[x] Source Code: JAVA_0303_Assignments_3.java

[x] README: This documentation file.

[x] Screenshot: Output of matrix results and error analysis (screenshot.png).

[x] IEEE Paper: Final report generated via XeLaTeX.

Author: 蔡晟旭 (tch107146)

Department: CSIE, National Penghu University of Science and Technology