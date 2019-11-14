package com.dragonmq.store;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author chenyang@koolearn-inc.com
 * @date 2019/11/8 10:29
 */
public class AppendFile {
    static Logger logger = LoggerFactory.getLogger(AppendFile.class);

    protected final AtomicInteger wrotePosition = new AtomicInteger(0);
    File file;
    RandomAccessFile randomAccessFile;

    FileChannel channel;

    MappedByteBuffer mappedByteBuffer;


    public AppendFile() {
        try {
            file = new File("D:\\data\\message");
            randomAccessFile=new RandomAccessFile(file, "rw");
            channel=randomAccessFile.getChannel();
            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 1 * 1024 * 1024);
        }catch (IOException ex){
            logger.error("excepton:{}",ex);
        }
    }

    public static void main(String[] args) throws Exception {
        File file = new File("D:\\copy.txt");
    }


    public void appendMsg(byte[] bytes)  {
            mappedByteBuffer.position(wrotePosition.get());
            mappedByteBuffer.put(bytes);
            wrotePosition.addAndGet(bytes.length);

    }

}
