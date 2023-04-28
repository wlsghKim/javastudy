package Exam.Bank;

public class Account {
  //속성 : 계좌번호, 예금주, 금액
  final int MAX_BALANCE = 100000;
  final int MIN_BALANCE = 0;

  private String ano;  //계좌번호
  private String owner; //예금주
  private int balance; //계좌금액

  //생성자
  public Account(String ano, String owner, int balance) {
    this.ano = ano;
    this.owner = owner;
    this.balance= balance ;
  }

  // getter, setter 구현


  public String getAno() {
    return ano;
  }

  public void setAno(String ano) {
    this.ano = ano;
  }
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "Account{" +
        "ano='" + ano + '\'' +
        ", owner='" + owner + '\'' +
        ", balance=" + balance +
        '}';

  }
}
