 /*ÖDEV SORUSU3=Yüksekliği kullanıcı tarafından verilen ve * ve o sembollerinden oluşan bir dik üçgen çizdiren bir Java programı yazınız.
 * Not:Üçgenin her satırının bir önceki satrıdan farklı bir sembolle başladığına dikkat ediniz.*/

 import java.util.Scanner;
public class DifferentSymbolTriangle {
    public static void main(String args[]){
        /*üçgenin yüksekliğini kullanıcıdan istemek için tanımladık.*/
        int height;
        Scanner input =new Scanner(System.in);
        System.out.print("Please enter the height of the triangle:");
        height = input.nextInt();
        /*Üçgenin en tepesinde 1 tane sembol olduğu için i=1 den başlattım.*/
        for(int i=1;i<=height;i++){
            /*İkinci bir for döngüsü satırları oluşturduğu için tanımladım.Birinci for sütunları oluşturduğu ikin ikinci bir for döbgüsüne ihtiyaç duydum.*/
            for(int j=1;j<=i;j++)
                if(i%2!=0)
                    if(j%2!=0)
                        /*Soruda üçgenin en tepesinde * sembolü olduğu için ilk * yazdırdım.o sembolünü de yazdırabilirdik.*/
                        System.out.print("*");
                        else
                            System.out.print("o");
                        else
                            if(j%2!=0)
                                System.out.print("o");
                        else
                            System.out.print("*");
                        System.out.println();
        }

    }
}
