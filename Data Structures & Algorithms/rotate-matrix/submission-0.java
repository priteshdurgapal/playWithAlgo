class Solution {
    public void rotate(int[][] matrix) {
        //0,0 ->0,1
        //1,0->0,0
        //0,1->1,1
        //1,1->1,0

    reverse(matrix);    
    //transpose    
    for(int i=0;i<matrix.length;i++) {
        for(int j=i;j<matrix[0].length;j++) {
            int temp = matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
            }
        }
    }
    //reverse
    private void reverse(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n/2;i++){
            int[] temp=matrix[i];
            matrix[i]=matrix[n-1-i];
            matrix[n-1-i]=temp;
        }
    }

}
