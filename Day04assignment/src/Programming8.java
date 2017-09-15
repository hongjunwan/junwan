public class Programming8 {
    public static void main(String[] args) {
        System.out.println("구구단 시작");
         
        for(int x = 1; x < 11; x++)
        {
            for(int y = 1; y < 11; y++){
                System.out.print(x * y + " ");
            }
            System.out.println();
        }
    }
}