package ArrayUtil;

public class ArrayUtil {
	// int 배열을 double 배열로 변환
	static double[] intToDouble( int[] source ) {
		double[] d = new double[source.length];
		for(int i=0;i<source.length;i++) {
			d[i] = (double)source[i];
		}
		return d;
	}

	// double 배열을 int 배열로 변환
	static int[] doubleToInt(double[] source) {
		int[] i = new int[source.length];
		for(int j=0;j<source.length;j++) {
			i[j] = (int)source[j];
		}
		return i;
	}

	// int 배열 두 개를 연결한 새로운 배열 리턴
	static int[] concat(int[] s1, int[] s2) {
		int len = s1.length + s2.length;
		int[] concatIntArray = new int[len];
		for(int i=0;i<s1.length;i++) {
			concatIntArray[i] = s1[i];
		}
		int j=0;
		for(int i=s1.length;i<len;i++) {
			concatIntArray[i] = s2[j++];
		}
		return concatIntArray;
	}
}