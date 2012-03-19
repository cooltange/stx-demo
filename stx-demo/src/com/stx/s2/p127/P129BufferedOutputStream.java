package com.stx.s2.p127;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 字节缓冲输入(出)流 示例
 * 
 * @author getan
 * 
 */
public class P129BufferedOutputStream {

	/**
	 * 使用字节缓冲输入(出)流 复制文件
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// 创建字节输入流
		InputStream in = new FileInputStream("d:\\1.txt");
		BufferedInputStream bis = new BufferedInputStream(in);

		// 创建字节输出流
		OutputStream out = new FileOutputStream("d:\\2.txt");
		BufferedOutputStream bos = new BufferedOutputStream(out);

		try {
			// 用于保存读取的单字节值
			int n = 0;
			// 使用循环来重复读取字节流
			while ((n = bis.read()) != -1) {
				// 将指定的字节写入此缓冲的输出流
				bos.write(n);
			}
		} finally {
			// 保证最后可以关闭字节缓冲输入(出)流
			bis.close();
			bos.close();
		}
	}
}