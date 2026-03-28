package March24;

public class Main {
    public static void main(String[] args) {

//        int[] fav = new int[]{4, 8, 2, 3};
//        int result = 0;
//        for (int number : fav) {
//            result=result+number;
//
//            System.out.println(number);
//        }
//        System.out.println("Total is:"+result);

        System.out.println(".............................");
        String[]name=new String[]{"ab","cd","ef","gh","kl","vf","fg","hj","mn"};

        String text= "";
        for (String newName:name){
            text=text+"_"+newName;
        }
        System.out.println(text);

        System.out.println("...................................");

        for (int index=0;index< name.length;index++){
            System.out.println("Index= "+index);
            System.out.println(name[index]);
        }

        for (int index=name.length-1;index>=0;index--){
            System.out.println("reverse index=" + index+name[index]);


        }
    }
}
