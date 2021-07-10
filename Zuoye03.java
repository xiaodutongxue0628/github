package zuoye03;

public class Zuoye03 {
    public static void main(String[] args) {
        //创建Computer对象
        Computer c1 = new Computer();
            c1.setPrice(6000);
            c1.setColor("黑色");
            c1.setTypename("联想拯救者c600");
        System.out.println("c1 = " + c1);

        //测试单例模式
        Phone p1 = Phone.getInstance();
        Phone p2 = Phone.getInstance();
        System.out.println(p1 == p2);
    }
}
