package io_nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferOperation {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile aFile = new RandomAccessFile("E:\\SE2_Eclipse\\se2_day4\\src\\io_nio\\sample.txt","rw");
		
		
		FileChannel channel = aFile.getChannel();
		
		ByteBuffer buf = ByteBuffer.allocate(48);
		
		int b = channel.read(buf);		// returns no of bytes read from the stream to the buffer
		
		while(b!=-1) {
		
		buf.flip();
		
		while(buf.hasRemaining())
			System.out.print((char)buf.get());
	
		buf.clear();
		
		b = channel.read(buf);
		
		}
	}

}
