package com.stx.tr1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * 命令"display"类 Demo
 * 
 * @author stx
 * 
 */
public class Displayer {

	/**
	 * 读取文件，并显示在看控制台，命令格式如下:<br>
	 * display [文件全路径]<br>
	 * 本方法未处理IO类异常,抛给调用者处理<br>
	 * 
	 * @param file
	 * @throws IOException
	 */
	public static void displayFileInfo(String file) throws IOException {
		// 声明字符缓冲输入流对象
		BufferedReader br = null;
		// 声明字符缓冲输出流对象
		BufferedWriter bw = null;

		try {
			// 字节输入流 => 字符输入流
			Reader reader = new InputStreamReader(new FileInputStream(file)); // 文件
			// 将普通Reader包装成BufferedReader
			br = new BufferedReader(reader);

			// 字节输出流 => 字符输出流
			Writer writer = new OutputStreamWriter(System.out); // 控制台
			// 将普通Writer包装成BufferedWriter
			bw = new BufferedWriter(writer);

			// 用于保存每次读取(一行字符)字符串
			String strLine = null;
			// 使用循环来重复读取(一行字符)字符串
			while ((strLine = br.readLine()) != null) {
				// 将字符串写入此缓冲的输出流
				bw.write(strLine);
				// 写完一行后换行
				bw.newLine();
			}
		} finally {
			// 关闭输入流
			if (br != null) {
				br.close();
			}
			// 清空输出流缓存
			if (bw != null) {
				bw.flush();
			}
		}
	}
}
