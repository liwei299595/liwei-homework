package dingweiqi;

import java.util.ArrayList;
import java.util.Date;

public class DuBi {

	public static void dubi(ArrayList List1,ArrayList List2) throws Exception{
		int i,j;

		Date d1;
		Date d2;
		for(i=0;i<List1.size();i++){
			d1=(Date) List1.get(i);
			System.out.println("++++++++++++++++++++++++++"+List1);
			for(j=0;j<List2.size();j++){

                d2=(Date) List2.get(j);
				long diff = d1.getTime() - d2.getTime();
				long days = diff / (1000 * 60 * 60 * 24)/24/60;
				//System.out.println(days);
				if(days==0){
					System.out.println("找到时间----时间为:"+d1);

				}
				else{
					System.out.println("没有找到时间！");
				}
			}


		}


	}
}
