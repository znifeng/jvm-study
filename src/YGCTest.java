/**
 * @author zni.feng
 */
import java.lang.management.ManagementFactory;

public class YGCTest {
	/**
	 * VM参数： -verbose:gc -XX:+UseSerialGC  -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 */
	private static final int _1MB= 1024 * 1024;
	
	public static void main(String[] args) {
		System.out.println(ManagementFactory.getRuntimeMXBean().getInputArguments());//打印JVM参数
		byte[] allocation1, allocation2, allocation3, allocation4;
		allocation1 = new byte[2*_1MB];
		allocation2 = new byte[2*_1MB];
		allocation3 = new byte[2*_1MB];
		allocation4 = new byte[4*_1MB]; //出现一次YGC
		System.out.println("exit");
	}

}
