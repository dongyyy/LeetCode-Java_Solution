public boolean isValidSudoku(char[][] board) {
	    	boolean[] validationCheck = new boolean[9];
	    	
	    	for(int i = 0 ; i < 3 ; i++) {
	    		for(int j = 0 ; j < 9 ; j++) {
	    			Arrays.fill(validationCheck, false);
	    			for(int k = 0 ; k < 9 ; k++) {
	    				if(i == 0) { //width x 9
	    					if('.' == board[j][k]) continue;
	    					int val = Character.getNumericValue(board[j][k]);
	    					if(validationCheck[val-1]) return false;
	    					validationCheck[val-1] = true;
	    				}
	    				else if(i == 1) { //height x 9
	    					if('.' == board[k][j]) continue;
	    					int val = Character.getNumericValue(board[k][j]);
	    					if(validationCheck[val-1]) return false;
	    					validationCheck[val-1] = true;
	    				}
	    				else if(i == 2) { //sub-boxes x 9
	    					if('.' == board[(j/3*3)+(k/3)][j%3*3+k%3]) continue;
	    					int val = Character.getNumericValue(board[(j/3*3)+(k/3)][j%3*3+k%3]);
	    					if(validationCheck[val-1]) return false;
	    					validationCheck[val-1] = true;
	    				}
	    			}
	    		}
	    	}
	    	
			return true;
	    }
