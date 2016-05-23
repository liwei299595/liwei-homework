package dingweiqi;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import com.drew.imaging.jpeg.JpegMetadataReader;
import com.drew.imaging.jpeg.JpegProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.MetadataException;
import com.drew.metadata.exif.ExifDirectory;

public class ZhaoPian {

	public ArrayList zhaopian(File file) throws Exception{
		String filePath ="D://ssss//20140624-213212.txt";
		File file1;
		Date d1 = null;
		Date d2 = null;
		ArrayList List = new ArrayList(); 
		Date s;
		int i;
		//		d2=Duqutxt.duqutxt(filePath);
		//		System.out.println("................................."+d2);


		File [] files = file.listFiles();
		for (i = 0; i < files.length; i++)
		{
			file1 = files[i];
			String name = file1.getName();
			//System.out.println(file1.getName());  //根据后缀判断
			if(name.trim().toLowerCase().endsWith(".jpg")) {  
				Metadata metadata = JpegMetadataReader.readMetadata(file1);
				Directory exif = metadata.getDirectory(ExifDirectory.class);
				Iterator tags = exif.getTagIterator();

				if(exif.containsTag(ExifDirectory.TAG_DATETIME_DIGITIZED)){
					System.out.println(file1.getName()+","+exif.getDescription(ExifDirectory.TAG_DATETIME_DIGITIZED)+","); 
					//System.out.println("字符串转日期：" + ConvertDem.StrToDate1(exif.getDescription(ExifDirectory.TAG_DATETIME_DIGITIZED)));
					d1= ConvertDem.StrToDate1(exif.getDescription(ExifDirectory.TAG_DATETIME_DIGITIZED));
					List.add(d1);
					//System.out.println("...................................................................................."+d1);
				}   

			}


		}
		//Duqutxt.duqutxt(filePath);
		return List;
	}
}
