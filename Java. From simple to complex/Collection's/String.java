public final class String {
	implements java.io.Serializable, Comparable<Stirng>, CharSequence {	

	private final char value[];

	private iny hash;

	private static final long serialVersionUID = -6849794470754667710L;
	public int compareTo(String anotherString) {
		int len1 = value.length;
		int len2 = anotherString.value.length;
		int lim = Math.min(len1, len2);
		char v1[] = value;
		char v2[] = notherString.value;


		int k = 0;
		while(k < lim) {
			char c1 = v1[k];
			char c2 = v2[k];
			if(c1 != c2) {
				return c1 - c2;
			}

			k++
		}
		return len1 - len2;
	}
}
