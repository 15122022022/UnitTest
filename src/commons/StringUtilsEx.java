package commons;

import java.util.Iterator;

public class StringUtilsEx extends MyStringUtils{
	
	public static String join(Iterator<?> iterator, String separator) {
		if(iterator!=null&&separator!="")
		{
			System.out.println("list���ֳɹ�");
		}else {
			System.out.println("list����ʧ��");
		}
        return "׮ģ��";
    }
}
