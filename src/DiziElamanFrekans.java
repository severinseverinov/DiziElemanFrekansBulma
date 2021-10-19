import java.util.Arrays;

public class DiziElamanFrekans {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list={10, 20, 20, 10, 10, 20, 5, 20};
        int[] dublicate=new int[list.length];
        int frekans=1;
        int startIndex=0;
        System.out.print("Dizi : ");
        System.out.println(Arrays.toString(list));
        System.out.println("Tekrar Sayıları");
        for(int i=0;i<list.length;i++){
            frekans=1;
            for(int j=0;j<list.length;j++){
                if(i!=j && list[i]==list[j] ){
                    frekans++;
                }
            }
            if(!isFind(dublicate,list[i])){
                dublicate[startIndex++]=list[i];
                System.out.println(list[i]+" sayısı "+frekans+" kere tekrar edildi.");
            }
        }
    }
}
