public class Main {
    public static void main(String[] args) {
           //Задача1
        int i=1;
        while (i<=10){
            System.out.print(i+" ");
            i++;

        }
        System.out.println( );
        for(int i1=10;i1>0;i1--){
            System.out.print(i1+" ");
        }
         // Задача 2
        for (int a=1;a<=31;a=a+7){
            System.out.println("Сегодня пятница, "+a+" -е число. Необходимо подготовить отчет");
        }
            //Задача 3
        int start=1822;
        for (int year=1822;year<=2122;year++){
            if(year %79==0){
            System.out.println(year);
        }
        }


    }
}