import java.util.ArrayList;

public class LongestString {


    public String[] arr;
    public ArrayList<String> storedName = new ArrayList<>();

    public  LongestString()
    {

    }

    public LongestString(String[] array)
    {
        this.arr = array;
    }



    public String longest()
    {
        String longName = arr[0];
        int index = arr[0].length();
        System.out.println("-------------------------");
        for (int i = 0; i < arr.length; i++)
        {
            if (index <= arr[i].length() || index <= arr[i].length())
            {
                index = arr[i].length();
                longName = arr[i];
                storedName.add(longName);
            }
        }

        String str ="";

        for (int x = 0; x < storedName.size(); x++){
            if (longName.length() == storedName.get(x).length()){
                str = storedName.get(x);
            }
        }
        return str;
    }

//    int index = 0;
//    public String LongestString(String[] longString)
//    {
////        int maxLength = 0;
////        String longestString = null;
////        for (String s : longString) {
////            if(s.length() > maxLength)
////            {
////                maxLength =s.length();
////                longestString= s;
////            }
////        }
////        return longestString;
//
//        ArrayList<String> list = new ArrayList<>();
//        int count = longString[0].length();
//        String element =" " ;
//
//        for(int i=0;i<longString.length;i++)
//        {
//            if(longString[i].length()>index )
//            {
//                count=longString[i].length();
//                element =longString[i];
//                list.add(element);
//            }
//
//        }
//
//        // System.out.println(element);
//        String str =element;
//        int n = index;
//
//
//
//        for (int i =0; i < list.size(); i++)
//        {
//            if( element.length() == list.get(i).length())
//            {
//                //n= longString[i].length();
//                //str =longString[i];
//
//                System.out.println(list.get(i));
//            }
//        }
//
//        return str;
//    }

}
