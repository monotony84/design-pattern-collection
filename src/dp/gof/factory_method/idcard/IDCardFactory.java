package dp.gof.factory_method.idcard;

import java.util.ArrayList;
import java.util.List;

import dp.gof.factory_method.framework.Factory;
import dp.gof.factory_method.framework.Product;

public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
