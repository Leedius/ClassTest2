package package1;

import package2.Ccc;

//접근 제한자
//종류 : public protected default private
//접근 제한자는 클래스, 멤버변수, 메소드에 사용가능
//클래스에서 사용 가능한 제한자 : public, default
//맴버변수 및 메소드 : 위의 4개 다 사용 가능
//public - 같은 프로젝트 내에서는 어디든 접근 가능
//default - 같은 패키지 내에서는 접근 가능
//private - 선언된 클래스 내에서만 접근 가능
public class Aaa {
    int a1;
    private int a2;
    public int a3;

    public void  aaa(){
        Ccc ccc = new Ccc();            //Ccc의 접근제한자가 public이기 때문에 접근가능
        //Ddd ddd = new Ddd();          //Ddd의 접근제한자가 default이기 때문에 다른패키지에서 접근 불가능
    }
    void bbb(){
        ccc();
        //Bbb bbb = new Bbb();          //Bbb의 접근제한자가 Bbb클래스에서 private이기 때문에 다른 클래스에서 접근 불가
    }

    private void ccc(){}
}
