package sec01_inheritancepolymorphism.EX01_Inheritance;

public class Worker extends Human{
  int workerID;

  @Override
  void eat() {
    System.out.println("급하게 먹다");
  }

  void goToWorker(){}
}
