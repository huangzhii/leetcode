/*
Spend me more than 9 hours!
*/
import java.util.*;

public class Solution {
	static List<List<String>> solutionList;
	static String str = "";
	public List<List<String>> solveNQueens(int n){
		solutionList = new ArrayList<List<String>>();
        ArrayList<String> solution = new ArrayList<String>();
        for (int j = 0; j < n; j++) str += '.';
        for (int j = 0; j < n; j++) solution.add(str);
        canPutQueen(solution, 0, 0);
        //System.out.println(solutionList);
        return solutionList;
    }
    
    static boolean checkIfCanPut(ArrayList<String> solution_in, int col, int row){
        String str = solution_in.get(row).toString();
        if (str.charAt(col) == 'Q') return false;
        for (int index = 0; index <= row; index++){
            str = solution_in.get(index).toString();
            if (str.charAt(col) == 'Q') return false;
        }
        for (int index = 0; index <= row; index++){
            str = solution_in.get(index).toString();
            if ((col - (row - index)) >= 0){
            	if (str.charAt(col - (row - index)) == 'Q') return false;
            }
            if ((col + (row - index)) < solution_in.size()){
                if (str.charAt(col + (row - index)) == 'Q') return false;
            }
        }
        return true;
    }
    
    static boolean canPutQueen(ArrayList<String> solution, int col_in, int row){
        if (row >= solution.size()){
            ArrayList<String> sol = (ArrayList<String>)solution.clone();
        	solutionList.add(sol);
        	return true;
        }
        for (int col = 0; col < solution.size(); col++){
	        if (checkIfCanPut(solution, col, row)){
	            String str2 = solution.get(row).toString();
	            str2 = str.substring(0,col) + 'Q' + str.substring(col+1, solution.size());
	            solution.set(row, str2);
                if (canPutQueen(solution, 0, row + 1)){
                    solution.set(row, str);
                	continue;
                }
                else {
    	            solution.set(row, str);
                	continue;
                }
	        }
        }
        return false;
    }
}