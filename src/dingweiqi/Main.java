package dingweiqi;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub




		ArrayList list1;
		ArrayList list2;
		Date d1 = null,d2;
		long days = 0;
		int i,j;
		File file = new File("E://ssss");
		String filePath ="E://ssss//20140624-213212.txt";
		//ZhaoPian.zhaopian(file);
		ZhaoPian z=new ZhaoPian();
		list1=z.zhaopian(file);
		Duqutxt d=new Duqutxt();
		list2=d.duqutxt(filePath);
		DuquZuoBiao zuobiao=new DuquZuoBiao();
		zuobiao.duquzuobiao(filePath);
		for(i=0;i<list1.size();i++){
			d1= (Date) list1.get(i);
			//System.out.println(list1);
			for(j=0;j<list2.size();j++){
				d2=(Date) list2.get(j);
				long diff = d1.getTime() - d2.getTime();
				days = diff / 1000;
				//System.out.println(days);
				if(days>=0&&days<=10){
				System.out.println("找到时间----GPX时间为:"+d2);
				System.out.println("找到时间----图片时间为:"+d1);
				System.out.println("时间差为:"+days+"秒");

			}
			
		}

	

}

//Duqutxt.duqutxt(filePath);
//d1=ZhaoPian.zhaopian(file);
//d2=Duqutxt.duqutxt(filePath);
//DuBi.dubi(list3, d2);


}

}
