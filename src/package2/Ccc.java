package package2;

import package1.Aaa;

public class Ccc {
    int c;

    public void ccc(){
        Ddd ddd = new Ddd();
        Aaa aaa = new Aaa();
        aaa.aaa();
        //aaa.bbb();              //bbb가 접근제한자가 default이고 다른패키지에 있기 때문에 접근 불가
        //aaa.ccc();              //ccc가 접근제한자가 private이고 다른패키지 다른클래스에 있기 떄문에 접근 불가
    }
}

//class 앞에 default가 생략이 되어있다.
class Ddd{
}