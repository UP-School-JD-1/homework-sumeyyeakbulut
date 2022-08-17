package bankaccount;

public class AccountClient {

    final static double depositCost = 5.0;

    public void withDrawal(Account account, Double cost) {
        getCurrentInfo(account);

        if (account.getBalance() < cost)
            System.out.println("İşlemi yapmak için yeterli bakiyeniz bulunmammaktadır.");
        else {
            account.setBalance(account.getBalance() - cost);
            System.out.println("İşleminiz başarı ile gerçekleştirildi.");
            getCurrentInfo(account);
        }
    }

    public void depositure(Account account, Double cost) {
        getCurrentInfo(account);
        account.setBalance(account.getBalance() + cost);
        System.out.println("Para yatırma işleminiz başarı ile yapılmıştır.");
        getCurrentInfo(account);
    }

    public void havaleYap(Account fromAccount, Account toAccount, Double cost) {
        getCurrentInfo(fromAccount);
        if(fromAccount.getBalance() < cost + depositCost)
            System.out.println("İşlem için yeterli bakiyeniz bulunmamaktadır.");
        else{
            fromAccount.setBalance(fromAccount.getBalance() - cost - depositCost);
            toAccount.setBalance(toAccount.getBalance() + cost);
            System.out.println("İşleminiz başarı ile gerçekleştirildi");
            getCurrentInfo(fromAccount);
        }
    }

    private void getCurrentInfo(Account account) {
        System.out.println("Şuan ki bakiyeniz: " + account.getBalance());
    }
}
