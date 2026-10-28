import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Main {

    public static void main(String[] args) {
        int n = 20000000;
        ArrayList<Boolean> array = new ArrayList<Boolean>();
        array.add(false);
        array.add(false);
        long i = 2;
        while( i <= n ){
            array.add(true);
            i += 1;
        }    

        System.out.print("Start-");
        //LocalDateTime timeBegin = LocalDateTime.now();
        long beginMilliSec = System.currentTimeMillis();
        i = 2;
        while ( i <= n ) {
            if( array.get((int)i) ){
                long sq = i * i;
                if (sq <= n) {
                    int m = (int)sq;
                    while (m <= n) {
                        array.set(m, false);
                        m += i;
                    }
                }
            }
            i += 1;
        }

        //LocalDateTime timeEnd = LocalDateTime.now();
        //long diff = timeEnd.toEpochSecond(ZoneOffset.UTC) - timeBegin.toEpochSecond(ZoneOffset.UTC);
        long diff = System.currentTimeMillis() - beginMilliSec;
        System.out.print("End-");
        System.out.print(diff);
    }

}