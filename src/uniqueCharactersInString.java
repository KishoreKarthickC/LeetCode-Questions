
public class uniqueCharactersInString
{
   public static Boolean uniqueChars(String name)
   {
	   for(int i=0; i<name.length(); i++)
	   {
		   for(int j=0; j<name.length(); j++)
		   {
			   if(i!=j)
			   {
				  if(name.charAt(i) == name.charAt(j))
				  {
					  return true;
				  }
			   }
		   }
	   }
	return false;
   }
   public static void main(String[] args)
   {
	   String name = "kishork";
	   System.out.println(uniqueChars(name));
   }
}
