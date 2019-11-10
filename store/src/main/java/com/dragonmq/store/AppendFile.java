package com.dragonmq.store;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author chenyang@koolearn-inc.com
 * @date 2019/11/8 10:29
 */
public class AppendFile {

    public static void main(String[] args) throws Exception {
        File file = new File("D:\\copy.txt");
        appendMsg(file,"java nio".getBytes());
    }


    public static void appendMsg(File file,byte[] bytes) throws Exception {

        MappedByteBuffer mappedByteBuffer = new RandomAccessFile(file, "rw").getChannel().map(FileChannel.MapMode.READ_WRITE,0,file.length());

        mappedByteBuffer.put(bytes);
    }
}
