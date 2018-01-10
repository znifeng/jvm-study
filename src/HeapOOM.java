import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;

public class HeapOOM {
	/**
	 * VM参数： -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
	 * @author zni.feng
	 *
	 */
	static class OOMObject{}

	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();
		System.out.println(ManagementFactory.getRuntimeMXBean().getInputArguments());
		while(true){
			list.add(new OOMObject());
		}
	}

}
