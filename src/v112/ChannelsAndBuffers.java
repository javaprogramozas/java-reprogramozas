package v112;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;

public class ChannelsAndBuffers {

    public static void main(String[] args) {
        readFile();
    }

    private static void readFile() {
        Path inputPath = Path.of("input.txt");

        try (FileChannel channel = FileChannel.open(inputPath)) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(10);
            ByteArrayOutputStream arrayOutput = new ByteArrayOutputStream();
            while (channel.read(byteBuffer) > 0) {
                byteBuffer.flip();
                arrayOutput.write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
                byteBuffer.clear();
            }
            System.out.println(arrayOutput);
        } catch (IOException e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }
    }

}
