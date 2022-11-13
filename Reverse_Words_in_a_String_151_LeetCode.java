package src;
/*
Here, what we will do is that we will iterate from the end and maintain an imaginary stack using a count
so when we have an alphabet we will add it to the stack and when we encounter a space well append the elements from the stack
to the string.
*/
public class Reverse_Words_in_a_String_151_LeetCode {
    public static String reverseWords(String s) {
             s = s.trim();                                           // Trimmed the String so that we can get a string with no leading and trailing spaces
            StringBuilder str = new StringBuilder();                 // to create a new string we use StringBuilder
            int count=0;                                             //to count the number of alphabets between spaces (Works as stack)
            for(int i = s.length()-1;i>=0;i--){                     //As we need to reverse the string we will start from the end of the string so i starts from end i.e. length-1 (As index starts from 0)
                if(s.charAt(i)!=' ') {                              // Check if the character at the index is not equal to space and increment the count this count is number of alphabets
                    count++;
                } else if(count>0) {                                //if we get a space and the count is greater than 0 then we need to append all the elements into the string
                    if(str.length()>0){                             // check if this the first alphabet we entering into the string if its not the we need to add a space between them
                        System.out.print(" ");
                        str.append(" ");                            // appending space between 2 words
                    }
                    //System.out.println(s.charAt(i+1));
                    for(int j=i+1;j<=count+i;j++){
                        System.out.print(s.charAt(j));
                        str.append(s.charAt(j));                    //appending the character one by one upto the count
                    }
                    System.out.println("");
                    count=0;
                }                                                   // the above else will get triggered only when we have a space but what if the i points at 0 index
                if(i==0){                                           // so in that case we will check if we have iterated to the start and then append that word to the string
                    System.out.print(" ");
                    if(str.length()>0){                             //again here we check is the new string is empty and if its now we add a space between words
                        str.append(" ");
                    }

                    for(int j=i;j<=count+i;j++){
                        System.out.print(s.charAt(j));
                        str.append(s.charAt(j));                    //appending the words one-by-one
                    }
                    System.out.println("");
                }
            }
            return str.toString();
        }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
}
