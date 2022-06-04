package v71;

import v67.Box;

public class IntBox extends Box<Integer> {

    @Override
    public void setValue(Integer value) {
        System.out.println("IntBox setValue()");
        super.setValue(value);
    }
}
