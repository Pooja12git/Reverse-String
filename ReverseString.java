public class ReverseString {
    public static void main(String[] args) {
        String s ="reverse string";
        char arr[] = s.toCharArray();
        for(int i =arr.length-1 ; i >=0 ; i--){
            System.out.print(arr[i]);
        }
    }

}
