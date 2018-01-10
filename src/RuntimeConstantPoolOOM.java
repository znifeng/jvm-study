import java.util.ArrayList;
import java.util.List;

public class RuntimeConstantPoolOOM {
	/**
	 * VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
	 * @param args
	 */
	public static void main(String[] args) {
		//使用List保持常量池引用，避免Full GC回收常量池行为
		List<String> list = new ArrayList<String>();
		int i=0;
		while(true){
			list.add(String.valueOf(i++).intern());
		}

	}

}
