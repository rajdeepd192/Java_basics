package RajHashMap;

import java.util.HashMap;

public class Distinct
{
    public static void characterCount(String inputString)
    {


        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();



        char[] strArray = inputString.toCharArray();



        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char 'c' is present in charCountMap, incrementing it's count by 1

                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char 'c' is not present in charCountMap,
                //putting 'c' into charCountMap with 1 as it's value

                charCountMap.put(c, 1);
            }
        }


        System.out.println(inputString+" : "+charCountMap);
    }

    public static void main(String[] args)
    {
        characterCount("RAJDEEP DAS");

    }
}

