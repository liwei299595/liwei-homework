package dingweiqi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;



public class Duqutxt {

	public ArrayList duqutxt(String filePath) throws Exception{
		String str=null;
		String str2=null;
		String str3=null;
		String str4=null;
		String str5=null;
		String str6=null;
		Date d1 = null;
		Date d2 = null;
		Date d3 = null;
		Date d4 = null;
		ArrayList List = new ArrayList(); 
		//File file = new File("D://ssss");
		//d3=ZhaoPian.zhaopian(file);
		try {
			String encoding="GBK"; 
			File file11=new File(filePath); 
			if(file11.isFile() && file11.exists()){ //判断文件是否存在 
				InputStreamReader read = new InputStreamReader( 
						new FileInputStream(file11),encoding);//考虑到编码格式 
				BufferedReader bufferedReader = new BufferedReader(read); 
				String str1 = null; 
				while((str1 = bufferedReader.readLine()) != null){ 
					//System.out.println(str);
					if(str1.indexOf("<time>",1)>0){
						str2=str1.substring(str1.indexOf("<time>",1)+1,str1.lastIndexOf("</time>"));
						//System.out.println(str2);
						str3=str2.substring(5,15)+" "+str2.substring(str2.lastIndexOf("T")+1,str2.lastIndexOf("Z"));
						//						System.out.println(str3);
						//						//Date date = new Date();
						//System.out.println("字符串转日期：" + ConvertDem.StrToDate(str3));
						d2= ConvertDem.StrToDate(str3);

						//						long diff = d3.getTime() - d2.getTime();
						//						long days = diff / (1000 * 60 * 60 * 24);
						//						System.out.println(days);
						//						if(diff==0){
						//							
						//							d4=d3;
						//							
						//						}
						List.add(d2);


					}
					if(str1.indexOf("<trkpt",1)>0){
						str4=str1.substring(str1.indexOf("<trkpt",1)+1,str1.lastIndexOf(">"));
						str5=str4.substring(6,36);//+","+str4.substring(str4.lastIndexOf("T")+1,str4.lastIndexOf("Z"));
						//System.out.println("坐标为："+str5);

					}
					///System.out.println(str1);
				} 

				read.close(); 
			}else{ 
				System.out.println("找不到指定的文件"); 
			} 
		} catch (Exception e) { 
			System.out.println("读取文件内容出错"); 
			e.printStackTrace(); 
		} 


		return List;

	} 
} 
