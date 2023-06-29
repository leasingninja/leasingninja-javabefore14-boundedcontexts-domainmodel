package io.leasingninja.sales.domain;

import org.jmolecules.ddd.annotation.ValueObject;

/**
 * Interest in percent.
 */
@ValueObject
public final class Interest {

    private final double perYear;

    private Interest(double perYear) {
        this.perYear = perYear;
    }

    public static Interest of(double perYear) {
        return new Interest(perYear);
    }

    public double perYear() {
        return this.perYear;
    }

    public double perMonth() {
        return perYear() / 12;
    }

    @Override
    public String toString() {
        return "Interest [" + perYear() + "% p.a.]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Interest other = (Interest) obj;
        if (perYear() != other.perYear())
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(perYear());
    }

}
