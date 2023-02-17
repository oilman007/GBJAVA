package HM1;

public class pascal_triangle {
    public static void main(String[] args)   {

        System.out.print("Enter n rows: ");
        String input = System.console().readLine();
        int nrow = Integer.parseInt(input);
        String[] lines = PrintPascalsTriangle(PascalsTriangle(nrow));
        for(int i=0; i<lines.length; ++i)
            System.out.println(lines[i]);
    }


    static int[][] PascalsTriangle(int nrow)
    {
        int[][] result = new int[nrow+1][];
        for(int i=0; i<=nrow; ++i)
        {
            int[] values = new int[i+1];
            values[0] = 1;
            values[i] = 1;
            for(int j = 1; j < i; ++j)
                values[j] = result[i-1][j-1] + result[i-1][j];
            result[i] = values;
        }
        return result;
    }
    
    static String[] PrintPascalsTriangle(int[][] triangle)
    {       
        int nrow = triangle.length;
        String[] result = new String[nrow];
        int max_char = MaxChar(triangle[triangle.length - 1]);
        int max_char_line = (max_char + 1)*nrow + 1;   
        int ipad = Integer.toString(nrow).length();
        for(int i=0; i<nrow; ++i)
        {
            int[] item = triangle[i];
            StringBuilder str = new StringBuilder(); 
            str.append(padLeft(Integer.toString(i), ipad) + ":" + padRight(" ", 1 + (max_char_line - (max_char + 1)*triangle[i].length)/2));            
            for(int j=0; j<item.length; ++j)
                str.append(" " + padLeft(Integer.toString(item[j]),max_char));
            result[i] = str.toString();
        }
        return result;
    }
    

    static int MaxChar(int[] values)    {
        if(values.length == 0)
            return 0;
        int result = values[0];
        for(int i=1;i<values.length; ++i)
            if(result < values[i])
                result = values[i];
        return Integer.toString(result).length();
    }
    

    static String padLeft(String s, int n) {
        return String.format("%" + n + "s", s);  
    }

    static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);  
    }
    

}



