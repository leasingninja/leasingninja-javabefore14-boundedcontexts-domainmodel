package io.leasingninja.sales.domain;

import org.jmolecules.ddd.annotation.ValueObject;

@ValueObject
public final class LeaseTerm {

    private final int noOfMonths;

    private LeaseTerm(int noOfMonths) {
        this. noOfMonths = noOfMonths;
    }

    public static LeaseTerm ofMonths(int noOfMonths) {
        return new LeaseTerm(noOfMonths);
    }

    public static LeaseTerm ofYears(int noOfYears) {
        return new LeaseTerm(noOfYears * 12);
    }

    public int noOfMonths() {
        return this.noOfMonths;
    }

    @Override
    public String toString() {
        return "LeaseTerm [" + noOfMonths() + " months]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        var other = (LeaseTerm) obj;
        if (noOfMonths() != other.noOfMonths())
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(noOfMonths());
    }

}
