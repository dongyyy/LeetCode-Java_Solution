//대표적인 stack 문제
//보기에 나오는 예시 이외의 ()), ()[ 같은 예외 처리 고려해야함.

public static boolean isValid(String s) {
	    	char[] charray = s.toCharArray();
	    	
	    	Stack<Character> stack = new Stack<>();
	    	for(char ch:charray){
	    		if(ch == '(' || ch == '{' || ch == '[' ){
	    			stack.push(ch);
	    		}
	    		else if(ch == ')'){ if(stack.size() == 0 || stack.pop() != '(') return false; }
	    		else if(ch == '}'){ if(stack.size() == 0 || stack.pop() != '{') return false; }
	    		else if(ch == ']'){ if(stack.size() == 0 || stack.pop() != '[') return false; }
	    		else { return false; }
	    	}
	   
	    	return stack.size() == 0;
	    }
	    
