package rahulshettyacademy.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


import java.text.SimpleDateFormat;
import java.util.*;

public class testtest {
    @Test
    public void test() {
        System.out.println("System.getProperty(\"user.home\") = " + System.getProperty("user.home"));
        System.out.println("System.getProperty() = " + System.getProperty("user.dir"));

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

//
//        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @Test
    public void loop() {
        int num = 1;
        for (int i = 4; i > 0; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    @Test
    public void reverseLoop() {
        int num = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    @Test
    public void reverseLoop1() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void divisibleBy3() {
        int num = 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void multiDarray() {
        int num[][] = new int[3][];
        num[0] = new int[4];
        num[1] = new int[4];
        num[2] = new int[4];

    }
    @Test
    public void arr1() {
        int num[] = new int[3];
        System.out.println("num[1] = " + num[1]);

    }

    @Test
    public void minNum() {
        int num[][] = new int[3][2];
        num[0][0] = 2;
        num[0][1] = 7;
        num[1][0] = 212;
        num[1][1] = -4;
        num[2][0] = 5;
        num[2][1] = 0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int nums[]:num){
            for(int digit:nums){
                if(digit<min){
                    min=digit;
                } else if (digit>max) {
                    max=digit;
                }
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
    @Test
    public void minMaxNum() {
        int num[][] = new int[3][3];
        num[0][0] = -2;
        num[0][1] = 4;
        num[0][2] = 5;
        num[1][0] = 3;
        num[1][1] = 4;
        num[1][2] = 0;
        num[2][0] = 1;
        num[2][1] = 2;
        num[2][2] = 9;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int idxMinCol=-1;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if(num[i][j]<min){
                    idxMinCol=j;
                    min=num[i][j];
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            if(num[i][idxMinCol]>max){
                max=num[i][idxMinCol];
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
   @Test
    public void dateTime(){
      Date date=new Date();
       System.out.println("date = " + date);
       SimpleDateFormat sdt=new SimpleDateFormat("M/d/yyyy");
       String format = sdt.format(date);
       System.out.println("sdt = " + format);

   }
    @Test
    public void calendaar(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdt=new SimpleDateFormat("M/d/yyyy");
        String format = sdt.format(calendar.getTime());
        System.out.println("format = " + format);
        calendar.get(Calendar.DATE);
        System.out.println("calendar.get(Calendar.DATE) = " + calendar.get(Calendar.DATE));

    }
    @Test
    public void setTest(){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(2,"hi");
        map.put(45,"hello");
        map.put(0,"bye");
        map.put(2,"world");
        map.put(17,"love");
        System.out.println("map = " + map.get(2));
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        System.out.println("iterator.next() = " + iterator.next());
        while (iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();

            System.out.println("key = " +next.getKey()+ " value= "+ next.getValue());
        }

    }
    @Test
    public void duplicateToMap(){
      Integer[] arr={4,5,9,4,1,4,5,4,5};
        List<Integer> list = Arrays.asList(arr);
       Map<Integer, Integer> map=new HashMap<>();
       for(int i=0; i<list.size(); i++){
           if(!map.containsKey(list.get(i))){
               map.put(list.get(i),1);
           }else{
               map.put(list.get(i), map.get(list.get(i))+1);
           }
       }
        System.out.println("map.toString() = " + map.toString());

    }
    @Test
    public void duplicateRahul(){
        int a[] ={ 4,5,5,5,4,6,6,9,4}; // Print unique number from the list- Amazon  //print the string in reverse
         ArrayList<Integer>ab =new ArrayList<Integer>();
         for(int i=0;i<a.length;i++) {
             int k=0;
             if(!ab.contains(a[i])) {
                 ab.add(a[i]);
                 k++;
                 for(int j=i+1;j<a.length;j++) {
                     if(a[i]==a[j]) {
                         k++; } }
                  System.out.println(a[i]);
                 System.out.println(k);
                 if(k==1) System.out.println(a[i]+"is unique number"); } } }

}