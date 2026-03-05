package DSA.collections.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class ApiLogs {
    public static void main(String[] args) {
        Map<String,String> logs=new LinkedHashMap<>();
        logs.put("2","signup");
        logs.put("1","login");
        logs.put("4","browse videos");
        logs.put("3","scroll up or down");
        logs.put("5","logout");
        System.out.println("API  logs:"+logs);
    }
}
