package com.stx.tr1;

import java.io.IOException;
import java.util.Scanner;

/**
 * ����̨ģ���� Demo
 * 
 * ������
 * 
 * @author stx
 * 
 */
public class CmdSimulator {

	/**
	 * ����̨ģ����������
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// ����ɨ�������ı������(�ӿ���̨��ȡ������)
		Scanner s = new Scanner(System.in);
		// �����������ַ�������
		String cmdLine = null;

		while (true) {
			try {
				// ��ȡ�ӿ���̨�����һ���ַ���
				cmdLine = s.nextLine();

				// �Կո�Ϊ�ַ����ָ������������,��ð���������������ַ�������
				String[] subCmd = cmdLine.split("\\s+");
				// ��������display d:\test.txt
				// �Կո���Ϊ�ָ� ["display","d:\test.txt"]
				// subCmd[0] Ϊ "display"
				// subCmd[1] Ϊ "d:\test.txt"

				// System.out.println(Arrays.toString(subCmd));

				// �˳������ж�
				if ("exit".equals(subCmd[0]))
					break;

				// display�����ж�
				if ("display".equals(subCmd[0])) {
					// ��ȡ�ļ�����
					String file = subCmd[1];
					// ������ʾ��ľ�̬������ʾ�ļ���Ϣ(�����ļ�·������)
					Displayer.displayFileInfo(file);
				}

				// TODO
				// �˴��������������жϼ������ĵ���
				// TODO

			} catch (IOException e) {
				System.out.println("���ִ���,������Ϸ��������......");
			} catch (Exception e) {
				System.out.println("���ִ���,������Ϸ��������......");
			}

			System.out.println("���ٴ��������̨����......");

		}

		System.out.println("���ѳɹ��˳�����̨......");
	}
}
