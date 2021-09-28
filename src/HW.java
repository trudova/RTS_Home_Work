public class HW {
    public static void main(String[] args) {

         int[] arr = {3,4,1,6,8,4,3,5};

        System.out.println(howManyAboveAndBellow(arr, 5));
        System.out.println(rotateCharacters("MyString", 2));
        System.out.println(rotateCharacters2("MyString", 2));

    }

     //    #1 Print the number of integers in an array that are above the given input
    //        and the number that are below, e.g. for the array [1, 5, 2, 1, 10] with input 6,
   //        print “above: 1, below: 4”.
     public static String  howManyAboveAndBellow(int[] arr, int num){
        String result ="";
        int above=0;
        int bellow=0;
        for (int i : arr) {
            if(i>num){
                above++;
            }else if(i<num){
                bellow++;
            }else {
                continue;
            }
        }
        result+="compere to "+num+" above: "+ above+ " bellow: "+bellow;
        return result;
    }

    //#2 Rotate the characters in a string by a given input and have the
   // overflow appear at the beginning, e.g. “MyString” rotated by 2 is “ngMyStri”.

    public static String rotateCharacters(String str, int num){
        String beginningOfOriginalStr = str.substring(0,str.length()-num);
        String endOfOriginalStr = str.substring(str.length()-num);
        String rotated =endOfOriginalStr+beginningOfOriginalStr;
        return rotated;
    }
   // solution num 2 just explains logic behind solution num1 so any one will work
    public static String rotateCharacters2(String str, int num){
        String rotated="";
        for (int i = str.length()-num; i < str.length(); i++) {
            rotated+=str.charAt(i);
        }
        for (int i = 0; i < str.length()-num; i++) {
            rotated+=str.charAt(i);
        }
        return rotated;
    }
}

