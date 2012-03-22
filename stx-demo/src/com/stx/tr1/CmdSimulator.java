package com.stx.tr1;

import java.io.IOException;
import java.util.Scanner;

/**
 * 控制台模拟器 Demo
 * 
 * 运行类
 * 
 * @author stx
 * 
 */
public class CmdSimulator {

	/**
	 * 控制台模拟器主方法
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建扫描输入文本类对象(从控制台获取输入流)
		Scanner s = new Scanner(System.in);
		// 声明命令行字符串变量
		String cmdLine = null;

		while (true) {
			try {
				// 获取从控制台输入的一行字符串
				cmdLine = s.nextLine();

				// 以空格为字符串分割符解析命令行,获得包含了命令及参数的字符串数组
				String[] subCmd = cmdLine.split("\\s+");
				// 例如输入display d:\test.txt
				// 以空格作为分隔 ["display","d:\test.txt"]
				// subCmd[0] 为 "display"
				// subCmd[1] 为 "d:\test.txt"

				// System.out.println(Arrays.toString(subCmd));

				// 退出命令判断
				if ("exit".equals(subCmd[0]))
					break;

				// display命令判断
				if ("display".equals(subCmd[0])) {
					// 获取文件参数
					String file = subCmd[1];
					// 调用显示类的静态方法显示文件信息(传递文件路径参数)
					Displayer.displayFileInfo(file);
				}

				// TODO
				// 此处完成其他命令的判断及相关类的调用
				// TODO

			} catch (IOException e) {
				System.out.println("出现错误,请输入合法命令参数......");
			} catch (Exception e) {
				System.out.println("出现错误,请输入合法命令及参数......");
			}

			System.out.println("请再次输入控制台命令......");

		}

		System.out.println("您已成功退出控制台......");
	}
}
