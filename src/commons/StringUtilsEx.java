package commons;

import java.util.Iterator;

public class StringUtilsEx extends MyStringUtils{
	
	public static String join(Iterator<?> iterator, String separator) {
		if(iterator!=null&&separator!="")
		{
			System.out.println("list划分成功");
		}else {
			System.out.println("list划分失败");
		}
        return "桩模块";
    }
}
