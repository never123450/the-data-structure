package design.structure.proxy.db;

public class DataSourceContextHolder {

    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static void serDVType(String dbtype){
        CONTEXT_HOLDER.set(dbtype);
    }

    public static String getDBTppe(){
        return (String)CONTEXT_HOLDER.get();
    }

    public static void clearDBtype(){
        CONTEXT_HOLDER.remove();
    }
}