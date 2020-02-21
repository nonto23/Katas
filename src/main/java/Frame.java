public class Frame extends LongestString {

    int index = 0;

         String[] array;
    public Frame(String[] arr)
        {
        super(arr);
        this.array = arr;
    }

    public  void StartWords()
    {
        int n = longest().length() + 4;
         for (int x = 0; x < n; x++)
         {
               System.out.print("*");
         }
             System.out.println();

         for (int j = 0; j< array.length; j++)
         {
            System.out.print("* "+array[j]);
            int indexSpace = ((n - array[j].length()) -4 + 1);

             for (int i = 0; i < indexSpace; i++)
             {
                System.out.print(" ");
                if (i == indexSpace -1)
                {
                    System.out.print("*");
                }
             }
            System.out.println();
        }
        for (int x = 0; x < n; x++){
            System.out.print("*");        }
        System.out.println();
    }

//
//        for (int i = 0 ;i < nameArr.length;i++)
//        {
//            if (nameArr[i].length() == counter){
//                for (int x = 0; x < n; x++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }    for (int j = 0; j< nameArr.length; j++){
//        System.out.print("* "+nameArr[j]);            int cnum = counter - nameArr[j].length() + 1;
//        for (int i = 0; i < cnum; i++){
//            System.out.print(" ");
//            if (i == cnum - 1){
//                System.out.print("*");
//            }
//        }
//        System.out.println();
//    }



}
