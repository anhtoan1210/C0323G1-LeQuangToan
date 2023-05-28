package ss16_io_text_file.copy_file_text;

public class Main {
    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        System.out.println(copyFileText.readFile("src/ss16_io_text_file/copy_file_text/filetext.txt"));
        copyFileText.writeFile("src/ss16_io_text_file/copy_file_text/file_coppy.txt", copyFileText.readFile("src/ss16_io_text_file/copy_file_text/filetext.txt"));
    }


}
