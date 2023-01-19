package Repl;

import java.util.SplittableRandom;

/*
Format the String:
Write the logic to format the string in the below given format
xxx-xxx-xxx
after each 3 digits there should be dash("-")
if there are any spaces in the input remove those
input ["00-44   48 555555"]
output ["004-448-555-555"]
input ["00-44   48 555"]
output["004-448-555"]
input ["00-44  #$% 48 55"]
output ["004-448-55"]
 */
public class Repl220 {

    public static void main(String[] args) {

        formatString("00-44   48 555555");


    }
    public static String formatString(String S){
      String s1= S.trim().replace("-","").replace(" ","").replaceAll("[#@%]","");

        int l=s1.length();
        if(l<=3){
          return s1;
        } else if(l==4){
            return s1.substring(0,2)+"-"+ s1.substring(2,4);
        } else {
            s1=s1.substring(0,3)+"-"+formatString(s1.substring(3,l));
        }

        return s1;

    }

        }



