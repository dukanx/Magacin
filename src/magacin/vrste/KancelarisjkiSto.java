package magacin.vrste;

import magacin.Artikal;

public class KancelarisjkiSto extends Artikal{

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "KancelarisjkiSto [hashCode()=" + hashCode() + ", getNaziv()=" + getNaziv() + ", getSifra()="
				+ getSifra() + ", getOpis()=" + getOpis() + ", getKolicina()=" + getKolicina() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + "]";
	}

	
}
