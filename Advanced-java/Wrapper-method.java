
class WrapperDemo {

    public static void main(String[] args) {/*...*/
        //  ArrayList<Integer> list = new ArrayList<>();
        //  list.add(10);
        //  list.add(20);  
        //  list.add(30);

        // System.out.println("This is the list of Integer : " + list);

// ArrayList<Boolean> list = new ArrayList<>();
// list.add(true);
// list.add(false);
// list.add(true);
// list.add(false);
// System.out.println("This is the list of Boolean : " + list);
// int count =0;
// for(int i = 0 ; i < list.size() ; i++){
//     if(list.get(i) == true){
//         count++;
//     }
// }
// // if(list.contains(true)){
// //     count++;
// // }
// // else{
// //   System.out.println("Not found the ture in list");
// // }
//     if(list.contains(true))
//     {
//         System.out.println("This is true" );
//         System.out.println("This is the count : " + count);
//     }
//     else
//     {
//         System.out.println("This is false");
//     }   
        int num = 10;

// Wrapping: converting primitive to object (boxing)
        Integer wrappedNum = Integer.valueOf(num);

        System.out.println("This is the wrapped number : " + wrappedNum);

        Double num2 = 20.4;
  
        System.out.println("This is the wrapped number : " + num2.toString());
        System.err.println("Type of num2: " + num2.getClass().getSimpleName());

        System.out.println("-------------------------------------------------------------------");
        Integer myInt = 100;

        String myString = myInt.toString();
        System.out.println(myString.length());

        System.out.println("-------------------------------------------------------------------");  
        Integer myInteger = 100;
        int myPrimitiveInt = myInteger.intValue();
        System.out.println(myPrimitiveInt);


        
    }
}
