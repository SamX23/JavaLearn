public class AbstractExtend {
    public static void main(String[] args) {
        AbstractA ref;
        ExtendB obj = new ExtendB();

        ref = obj;
        ref.coba();
        ref.cobaJuga();
        obj.cobaJuga();
        obj.coba();
    }
}
