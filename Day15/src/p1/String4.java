package p1;

import java.util.Arrays;

class String4   
{    
    static void removeDuplicate(char str[], int length)   //method paramitrized
    {    
        int index = 0;   
        for (int i = 0; i < length; i++)   
        {        
            int j;   
            for (j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }   
       
            if (j == i)    
            {   
                str[index++] = str[i];   
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
    }   
      
    public static void main(String[] args)   //converting string to character array
    {   
        String s1 = "Railworld is a good organization";   
        char str[] = s1.toCharArray();   
        int len = str.length;     
        removeDuplicate(str, len);   //method call
    }   
}  

