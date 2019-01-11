      //1, 2, 3, 5, 8, ... : 피보나치 수열
			//f(n) = f(n-1) + f(n-2)
			//f(5) = f(4) + f(3)
		 	//f(4) = f(3) + f(2)
			//1. 2 갈래씩 뻗어나가서 n번 반복하므로 시간복잡도: O(2^n), 공간복잡도: O(1)
			//2. 다이나믹 프로그래밍 -> 공간복잡도: O(n) 시간복잡도: O(n)
			//	 다이나믹 프로그래밍을 위해 우 점화식을 찾아야한다.(n을 구하기 위해 전 단계의 답을 그 다음 단계에 어떻게 써먹을 수 있는가를 찾는게 관건)
		
			//1.
//		   public static int climbStairs(int n) {
//		        if(n==1){ return 1;}
//		        else if(n==2){ return 2;}
//		        else {return (climbStairs(n-1) + climbStairs(n-2));}
//		    }
		   
		   //2.
		   public static int climbStairs(int n) {
		        if(n<=0){ return 0;}
			   	if(n==1){ return 1;}
		        int[] d = new int[n+1]; 
		        d[1] = 1;
		        d[2] = 2;
		        for(int i = 3 ; i<= n ; i++){
			        d[i] = d[i-1] + d[i-2];		        	
		        }
		        return d[n];
		    }
