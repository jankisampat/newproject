public class Test1
{
public static void main(String[] args)  
    { 
          
        String str="my name is janki. i am student of MCA. i live in ahmedabad";
        String result1="";
        String result2="";
        String result3="";
        String last1="is janki.";
        String last2="of MCA.";
        String last3="in ahmedabad.";
	
        String[] arr =  str.split(" ");
        for(int i=arr.length-12;i>=0;i--)
        {
          for(int k=arr.length-7;k>=4;k--)
         {
           for(int p=arr.length-3;p>=9;p--)
           {
         result1=result1+arr[i];
         

result2=result2+arr[k];
result3=result3+arr[p];
}
}
}
System.out.println(result1+last1+result2+last2+result3+last3);
    } 
}