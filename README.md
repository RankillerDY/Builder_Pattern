# Builder Design Pattern

## Mô tả

Dự án này minh họa việc áp dụng Builder Design Pattern trong Java. Builder Pattern là một trong những Creational Design Patterns, được sử dụng để xây dựng các đối tượng phức tạp bằng cách sử dụng các đối tượng đơn giản và tiếp cận từng bước một. Pattern này đặc biệt hữu ích khi các đối tượng cần được tạo ra với nhiều biến thể khác nhau.

### Builder Design Pattern

Builder Pattern được sử dụng khi bạn muốn tạo các đối tượng phức tạp mà không cần phải ghép nối nhiều tham số trong một constructor. Pattern này giúp tách rời quá trình xây dựng một đối tượng từ phần thể hiện của nó, cho phép cùng một quá trình xây dựng có thể tạo ra các biểu diễn khác nhau.

#### Đặc điểm chính của Builder Design Pattern:
- **Tạo đối tượng phức tạp**: Cho phép tạo ra các đối tượng phức tạp bằng cách sử dụng các đối tượng đơn giản và tiếp cận từng bước một.
- **Tách rời xây dựng và biểu diễn**: Tách rời quá trình xây dựng đối tượng từ phần thể hiện của nó, giúp mã nguồn dễ dàng mở rộng và bảo trì.

#### Lợi ích của Builder Design Pattern:
- **Giảm độ phức tạp của mã nguồn**: Giảm số lượng tham số trong constructor, tránh việc tạo ra các constructor với quá nhiều tham số.
- **Tăng tính linh hoạt**: Cho phép tạo ra các biến thể khác nhau của đối tượng bằng cách sử dụng cùng một quá trình xây dựng.

## Cài đặt và sử dụng

### Yêu cầu hệ thống

- Java Development Kit (JDK) 8 trở lên.

### Hướng dẫn cài đặt

1. **Clone repository:**
   ```bash
   git clone https://github.com/RankillerDY/builder-design-pattern.git
   cd builder-design-pattern
   ```

2. **Biên dịch các file mã nguồn:**
   ```bash
   javac -d bin src/*.java
   ```

3. **Chạy chương trình:**
   ```bash
   java -cp bin Client
   ```

## Cấu trúc dự án

```plaintext
builder-design-pattern/
├── Product/
│   └── House.java
├── ProductBuilder/
│   └── HouseBuilder.java
├── ProductInterface/
│   └── Builder.java
├── Client.java
└── README.md
```

## Giới thiệu về các thành phần

### Product
`House.java` là lớp Product đại diện cho đối tượng phức tạp được xây dựng.

### ProductBuilder
`HouseBuilder.java` là lớp Builder chịu trách nhiệm xây dựng các phần của đối tượng `House`.

### ProductInterface
`Builder.java` là interface định nghĩa các phương thức mà một Builder cần phải cài đặt.

### Client
`Client.java` là lớp Client sử dụng Builder Pattern để tạo ra đối tượng `House`.
