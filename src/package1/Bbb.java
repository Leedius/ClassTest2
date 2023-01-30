package package1;

import package2.Ccc;

public class Bbb {
    int b;

    private Bbb(){

    }

    public void bbb(){
        Aaa aaa = new Aaa();
        aaa.a1 = 10;            //a1의 접근제한자가 default이기 때문에 같은 패키지내에 접근 가능
       // aaa.a2 = 10;          //a2의 접근제한자가 private이기 떄문에 같은 class가 아니라서 접근 불가
        aaa.a3 = 10;            //a3의 접근제한자가 public이기 떄문에 접근 가능.

        Ccc ccc = new Ccc();

    }
}
