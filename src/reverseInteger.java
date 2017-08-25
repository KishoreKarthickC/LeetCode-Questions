
public class reverseInteger {	
    public static int reverse(int x) 
    {
        String s = Integer.toString(x);
        char[] ch = s.toCharArray();        
        int i,j=0;
        j = s.length()-1;
        if(s.charAt(0) == '-')
        {              	
            for(i=1; i < j; i++, j--)
            {
                char c = ch[i];
                ch[i] = ch[j];
                ch[j] = c;
            }
        }
        else
        {                    
            for(i=0; i < j; i++, j--)
            {
                char c = ch[i];
                ch[i] = ch[j];
                ch[j] = c;
            }
        }
       return Integer.parseInt(String.valueOf(ch));
    }
    public static void main(String[] args)
    {
    	System.out.println(reverse(123));
    }
}
