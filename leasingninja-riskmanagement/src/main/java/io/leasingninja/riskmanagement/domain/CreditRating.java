package io.leasingninja.riskmanagement.domain;

public final class CreditRating {

    private final int value;

	private CreditRating(int value) {
		assert isValid(value);

        this.value = value;
	}

	public static boolean isValid(int value) {
		return value >= 1 && value <= 10;
	}

	public static CreditRating of(int value) {
		return new CreditRating(value);
	}

    public int value() {
        return this.value;
    }

    @Override
    public String toString() {
        return "CreditRating [" + value() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        var other = (CreditRating) obj;
        if (value() != other.value())
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(value());
    }

}
