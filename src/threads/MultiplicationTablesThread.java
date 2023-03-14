package threads;

public class MultiplicationTablesThread extends Thread{

    @Override
    public void run() {
        Integer numTables = 10;
        Integer numResults = 10;
        for (int i = 1; i <= numTables; i++) {
            System.out.println("------------------Tabla del "+i+"-----------------");
            for (int j = 1; j <= numResults; j++) {
                String result = i+"X"+j+"="+i*j;
                System.out.println(result);
            }
            System.out.println("------------------Tabla del "+i+"-----------------");
        }
    }
    
}
