package dingweiqi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDem {

	public static  Date date = null;


	public static String DateToStr(Date date) { 

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = format.format(date);
		return str;
	} 

	/**
	 * �ַ���ת��������
	 * @param str
	 * @return date
	 */
	public static Date StrToDate(String str) {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		try {
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	public static Date StrToDate1(String str) {

		SimpleDateFormat format = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");

		try {
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	//		public static void main(String[] args) {
	//			  
	//			   Date date = new Date();
	//			   System.out.println("����ת�ַ�����" + ConvertDem.DateToStr(date));
	//			   System.out.println("�ַ���ת���ڣ�" + ConvertDem.StrToDate(ConvertDem.DateToStr(date)));
	//			  
	//			}



}
