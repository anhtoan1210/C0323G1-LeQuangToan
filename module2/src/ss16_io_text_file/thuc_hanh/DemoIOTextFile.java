package ss16_io_text_file.thuc_hanh;

import java.io.File;

public class DemoIOTextFile {
    public static void main(String[] args) {
        File file = new File("hello.txt");
        if (file.exists()) {
            System.out.println("thao tác với file");
        } else {
            System.out.println("file không tồn tại");
        }

    }
}
