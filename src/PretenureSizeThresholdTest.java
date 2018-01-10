/**
 * @author zni.feng
 */
public class PretenureSizeThresholdTest {
	/**
	 * VM args: -verbose:gc -XX:+UseSerialGC  -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 * -XX:PretenureSizeThreshold=3145728
	 * (3145728=3*1024*1024=3MB)
	 * @param args
	 */
	
	private static final int _1MB=1024*1024;
	public static void main(String[] args) {
		byte[] allocation;
		allocation = new byte[4*_1MB];
		
	}

}
