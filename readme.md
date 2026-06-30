### Calculator 실습
- Java 실습 과제 목적으로 만들어진 콘솔 계산기입니다.
- main = level1 / main2 = level2 입니다.

### 📂 프로젝트 구조

```text
+---main
|   +---java
|   |       Main.java
|   |
|   \---resources
+---main2
|   +---java
|   |   |   Main.java
|   |   |
|   |   +---Calculator
|   |   |       ArithmeticCalculator.java
|   |   |       Calculator.java
|   |   |       CircleCalculator.java
|   |   |
|   |   \---Operator
|   |           AddOperator.java
|   |           DivideOperator.java
|   |           ModOperator.java
|   |           MultiplyOperator.java
|   |           Operator.java
|   |           SubtractOperator.java
```

### 실행법

1. `main / java / Main`은 Level 1이 실행됩니다. 또는 `main2 / java / Main`은 Level 2가 실행됩니다.
2. 터미널 콘솔에 보이는 안내대로 명령어를 입력하여 원하는 기능을 실행합니다.
3. 메뉴 구성: `1.사칙연산` | `2.원의넓이` | `3.결과 삭제` | `4.결과 조회` | `exit 종료`

### 기능 구현

* **#사칙연산** - double 타입의 a,b 값과 사칙연산 기호를 입력 받아 계산합니다.
* **#원의넓이계산** - 반지름값을 입력받아 원의 넓이를 계산합니다.