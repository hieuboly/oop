public class Introduction {
    public static void main(String[] args) {
        // In thông tin cá nhân
        System.out.println("NguyễnDuyHiệu\t123456\tINT2204\thieuboly\t24020134@vnu.edu.vn.com");

        // In bài hát từ 9 xuống 1
        for (int i = 9; i >= 1; i--) {
            if (i > 1) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down, pass it around,");
                if (i - 1 == 1) {
                    System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
                } else {
                    System.out.println((i - 1) + " bottles of beer on the wall, " + (i - 1) + " bottles of beer.");
                }
                System.out.println("Take one down, pass it around,");
            } else {
                // Khi còn 1 chai
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
                System.out.println("Take one down, pass it around,");
                System.out.println("No more bottles of beer on the wall.");
            }
        }
    }
}