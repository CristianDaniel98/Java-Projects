public class Main {
    public static void main(String[] args) {

        Account bobAccount = new Account();
        bobAccount.withdrawal(100.0);

        bobAccount.deposit(50.0);
        bobAccount.withdrawal(100.0);

        bobAccount.deposit(51.0);
        bobAccount.withdrawal(100.0);

        VipCustomer vip1 = new VipCustomer();
        VipCustomer vip2 = new VipCustomer("Mihai","mihai@gmail.com");
        VipCustomer vip3 =  new VipCustomer("Marius", 8.8, "marius@gmail.com");
        System.out.println(vip1.getName());
        System.out.println(vip1.getLimit());
        System.out.println(vip1.getEmail());
        System.out.println(vip2.getName());
        System.out.println(vip2.getLimit());
        System.out.println(vip2.getEmail());
        System.out.println(vip3.getName());
        System.out.println(vip3.getLimit());
        System.out.println(vip3.getEmail());
    }
}