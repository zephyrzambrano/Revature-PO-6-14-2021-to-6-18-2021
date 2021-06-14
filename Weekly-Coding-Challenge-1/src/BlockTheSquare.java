
public class BlockTheSquare {
	
	public static int blockPlayer(int a, int b) {
		
		/*
		 * Tic Tac Toe Board
		 * 
		 * 0 1 2
		 * 3 4 5
		 * 6 7 8
		 */
		
		int[][] winCombinations = { // length == 8
				{0, 1, 2}, // left to right
				{3, 4, 5}, // left to right
				{6, 7, 8}, // left to right
				{0, 3, 6}, // top to bottom
				{1, 4, 7}, // top to bottom
				{2, 5, 8}, // top to bottom
				{0, 4, 8}, // diagonal top left to bottom right
				{2, 4, 6} // diagonal top right to bottom left
		};
		
		int[] currentCombination = new int[3];
		
		for (int[] combination : winCombinations) {
			
			boolean hasA = false;
			boolean hasB = false;
			
			for (int i = 0; i < 3; i = i + 1) {
				if (combination[i] == a) {
					hasA = true;
				}
				else if (combination[i] == b) {
					hasB = true;
				}
			}
			
			if (hasA == true && hasB == true) {
				currentCombination = combination;
			}
			
		}
		
		for (int i = 0; i < 3; i = i + 1) {
			
			if (currentCombination[i] != a && currentCombination[i] != b) {
				return currentCombination[i];
			}
			
		}
		
		return 0;
		
	}
	
}
