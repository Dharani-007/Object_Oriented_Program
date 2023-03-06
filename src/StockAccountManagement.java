import java.util.ArrayList;
import java.util.Scanner;

public class StockAccountManagement {
    ArrayList<String> stockName = new ArrayList<String>();
    ArrayList<Integer> numberOfShare = new ArrayList<Integer>();
    ArrayList<Integer> sharePrice = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);

//This method addReport() is used to display the ArrayLists
    public void addStock() {
        System.out.println("Enter the Stock Name : ");
        stockName.add(sc.next());
        System.out.println("Enter the number of shares : ");
        numberOfShare.add(sc.nextInt());
        System.out.println("Enter the share price : ");
        sharePrice.add(sc.nextInt());
    }

//This method stockReport() is used to display the stock report
    public void stockReport() {
        System.out.println("STOCK REPORT");
        for (int i = 0; i < stockName.size(); i++) {
            int total = (numberOfShare.get(i) * sharePrice.get(i));

            System.out.println("Stock Name =" + stockName.get(i) + "\nValue of each share =" + sharePrice.get(i)
                    + "\nTotal value of share =" + total);
        }
    }
}
