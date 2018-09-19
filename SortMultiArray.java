public class SortMultiArray 
{
    public static void main(String[] args) 
    {
        int [][] x = { {1, 2, 3}, {4, 5, 6, 7, 8}, {11, 12} };
        int [][] y = { {20, 12}, {10, 11}, {12, 13, 14, 15} };
        int [][] a = { {12, 100, 32}, {12}, {10, 10, 10, 10} };
        int [][][] z = { x, y };
        System.out.println("" + sum(x) + " Expected: 59");
        System.out.println("" + sum(y) + " Expected: 107");
        System.out.println("" + sum(z) + " Expected: 166");
    }

    public static int sum (int [][] a) 
    {
        int col = 0;
        int row = 0;
        int sum = 0;
        
        while(row < a.length)
        {
            sum += a[row][col];
            
            col++;
            if(col == a[row].length)
            {
                col = 0;
                row++;
            }
        }
        
        return sum;
    }
    public static int sum (int [][][] a) 
    {
        int col = 0;
        int arrayNum = 0; 
        int row = 0;
        int sum = 0;
        
        while(arrayNum < a.length)
        {
            sum += a[arrayNum][row][col];
            
            col++;
            if(col == a[arrayNum][row].length)
            {
                col = 0;
                row++;
            }
            if(row == a[arrayNum].length)
            {
                row = 0;
                col = 0;
                arrayNum++;
            }
        }
        
        return sum;
    }
}
