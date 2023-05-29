package Bai2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestOText {

    public static void main(String[] args) {

        File file = new File("list_song.txt");
        String arraySong[] = {" Hello califonia ", " We don’t talk any more", "Nắng ấm xa dần ", "Em của ngày hôm qua", "Thất tình"};

    }

    public static void writeDataToFileWithFileWriter(String[] arraySong) {
        try {
            FileWriter writer = new FileWriter("list_song.txt");
            for (String song : arraySong) {
                writer.write(song);
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("lỗi ");
            e.printStackTrace();
        }
    }
    public static void readDataToFileWithFileWrite() 
}
