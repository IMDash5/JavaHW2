package org.example;

public class Main {
    public static void main(String[] args)
    {
        String str = "aaaaabbbbcdddrrr";
        char[] letters = str.toCharArray();
        String res = "";
        int cnt = 0;
        for (int j = 0; j < letters.length; j++)
        {
            for (int i = 0; i < letters.length; i++)
            {
                if (res.contains(Character.toString(letters[j])) & j != letters.length - 1)
                {
                    j++;
                    i = 0;

                }
                else
                {
                    if (letters[i] == letters[j])
                    {
                        cnt++;
                    }
                }
            }
            if (j != letters.length - 1)
            {
                res = res + letters[j] + cnt;
                cnt = 0;
            }
            else
            {
                if (res.contains(Character.toString(letters[j])))
                {
                    break;
                }
                else
                {
                    cnt = 1;
                    res = res + letters[j] + cnt;
                }
            }
        }
        System.out.println(res);
    }
}