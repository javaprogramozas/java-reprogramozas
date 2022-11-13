package v113;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class ChannelsAndBuffersAlternative {

    public static void main(String[] args) {
        readFile();
    }

    private static void readFile() {
        Path inputPath = Path.of("input.txt");
        CharsetDecoder decoder = StandardCharsets.UTF_8.newDecoder();

        try (FileChannel channel = FileChannel.open(inputPath)) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(9);
            CharBuffer charBuffer = CharBuffer.allocate(9);
            while (channel.read(byteBuffer) > 0) {
                byteBuffer.flip();
                decoder.decode(byteBuffer, charBuffer, false);
                charBuffer.flip();
                System.out.print(charBuffer);
                charBuffer.clear();
                byteBuffer.compact();
            }
            if (byteBuffer.hasRemaining()) {
                CoderResult result = decoder.decode(byteBuffer, charBuffer, true);
                if (result != CoderResult.UNDERFLOW) {
                    System.out.println("Hibás karakteres bemenet");
                }
            }
        } catch (IOException e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }
    }

}
