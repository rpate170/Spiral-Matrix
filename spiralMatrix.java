class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0){
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        int rs = 0, re = matrix.length-1;
        int cs = 0, ce = matrix[0].length-1;
        
        while (rs <= re && cs <= ce) {
            //left to right
            for(int col = cs; col <= ce; col++) {
                list.add(matrix[rs][col]);
            }
            //top to bottom
            for(int row = rs+1; row <= re; row++) {
                list.add(matrix[row][ce]);
            }
            //right to left
            for(int col = ce-1; col >= cs; col--) {
                if (rs == re) {
                    break;
                }
                list.add(matrix[re][col]);
            } 
            //bottom to top
            for(int row = re-1; row > rs; row--) {
                if (ce == cs) {
                    break;
                }
                list.add(matrix[row][cs]);
            }
            rs++;
            re--;
            cs++;
            ce--;
        }
        return list;
    }
}