public class ArrayLauncher {
	public static void main(String[] args){

	
		int[] a = {1, 3, 4, 2, 5};
		int[] b = {5, 2, 1, 3, 4, 7};
		String[] result = new String[b.length];
		int numderElem = 0;
		for(int i = 0; i < a.length; i++) {
			for (int j = 0;  j < b.length; j++) {
				
		
				if(a[i] == b[j]) {
					//result[numderElem] = String.format("%d %d", i, j);
					result[numderElem] = i + " " + j;
					numderElem++;
					break;
				}
			}
		}
		for(int c = 0; c < result.length; c++){
			System.out.println("Element #" + c + "= " + result[c]);
		}
	}
}
