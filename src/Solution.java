/**
 * 由於一次動作無法完成題目要求，故將進行兩次轉動。
 * 第一次由左上至右下對角線為中心進行反轉。
 * 第二次再由中心線為對角線進行反轉。
 * 經過以上兩步操作即可達成要求,隨後將其印出。
 * @author black
 *
 */
public class Solution {
	public void rotate(int[][] matrix) {		
        for(int i=0;i<matrix.length;i++)
        {
        	for(int j=i;j<matrix[i].length;j++)
        	{
        		int tmp=matrix[i][j];
        		matrix[i][j]=matrix[j][i];
        		matrix[j][i]=tmp;
        	}
        }      
        for(int i=0;i<matrix.length;i++)
        {
        	for(int j=0;j<matrix[i].length/2;j++)
        	{
        		int tmp=matrix[i][j];
        		matrix[i][j]=matrix[i][matrix[i].length-1-j];
        		matrix[i][matrix[i].length-1-j]=tmp;
        	}
        }      
        for(int i=0;i<matrix.length;i++)
        {
        	for(int j=0;j<matrix[i].length;j++)
        	{
        		System.out.print(matrix[i][j]+"\t");
        	}
        	System.out.println();
        }
    }
}
