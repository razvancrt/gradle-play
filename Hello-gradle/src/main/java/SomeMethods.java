public class SomeMethods {
	
	public static int add(int i, int j) {
		return i+j;
	}
	
	@SuppressWarnings("unused")
	private static int addPrivate(int pi, int pj) {
		return pi+pj;
	}
	
	public void longRunningMethod(int seconds) throws Exception {
		Thread.sleep(5000);
	}
}