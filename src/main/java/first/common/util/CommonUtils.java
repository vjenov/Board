package first.common.util;

import java.util.UUID;

public class CommonUtils {
	public static String getRandonString(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
