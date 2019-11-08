package com.dragonmq.store;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author chenyang@koolearn-inc.com
 * @date 2019/11/8 10:29
 */
public class AppendFile {

    public static void main(String[] args) throws Exception {
        method1();
    }


    public static void method1() throws Exception {

        File file = new File("D:\\copy.txt");
        FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
        channel.map()
//        FileOutputStream outputStream = new FileOutputStream(file);
//        FileChannel channel = outputStream.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        String string = "java nio";
        buffer.put(string.getBytes());
        buffer.flip();     //此处必须要调用buffer的flip方法
        channel.write(buffer);
        channel.close();
//        outputStream.close();

    }
}
