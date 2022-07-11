package bai1;

public class main {
    public static void main(String[] args) {
//        5 cuốn sách thuộc lớp ProgrammingBook
        ProgrammingBook b1 = new ProgrammingBook(11, "Trọng", 23, "Đào Văn Trọng", "Java", "A4");
        ProgrammingBook b2 = new ProgrammingBook(12, "Bình", 27, "Đào Văn Trọng", "Java", "A4");
        ProgrammingBook b3 = new ProgrammingBook(13, "Hiếu", 24, "Đào Văn Trọng", "Tiếng Việt", "A4");
        ProgrammingBook b4 = new ProgrammingBook(14, "Dĩnh", 26, "Đào Văn Trọng", "Mẹ đẻ", "A4");
        ProgrammingBook b5 = new ProgrammingBook(15, "Phương", 50, "Đào Văn Trọng", "Java", "A4");
//        5 cuốn sách thuộc lớp FictionBook
        FictionBook b6 = new FictionBook(16, "Nam", 70, "K.a", "Viễn tưởng 1");
        FictionBook b7 = new FictionBook(17, "Hoàng", 30, "K.a", "Viễn tưởng 2");
        FictionBook b8 = new FictionBook(18, "Ba", 60, "K.a", "Viễn tưởng 1");
        FictionBook b9 = new FictionBook(19, "Quang Anh", 40, "K.a", "Viễn tưởng 5");
        FictionBook b10 = new FictionBook(20, "Đức Anh", 300, "K.a", "Viễn tưởng 4");
//        Tổng tiền 10 cuốn sách
        System.out.println(b5.sum + b10.sum1);
//        Số sách ProgrammingBook có language là "Java".
        System.out.println(b5.count);
//         Số sách Fiction có category là “Viễn tưởng 1”.
        System.out.println(b10.count1);
//        Đếm số sách Fiction có giá <100
        System.out.println(b10.count2);

    }
}
