import java.util.ArrayList;
import java.util.List;

public class VendSoda extends VendingMashine{
    private List<Soda> sodas = new ArrayList<>();




    public List<Soda> getSodas() {
        return sodas;
    }

    public void setSodas(List<Soda> sodas) {
        this.sodas = sodas;
    }
}
