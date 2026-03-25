package magacin.vrste;

import java.time.LocalDateTime;
import java.util.Objects;

import magacin.Artikal;

public class KucnaHemija  extends Artikal{

	private LocalDateTime rokTranja;

	public LocalDateTime getRokTranja() {
		return rokTranja;
	}

	public void setRokTranja(LocalDateTime rokTranja) {
		this.rokTranja = rokTranja;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(rokTranja);
		return result;
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
		KucnaHemija other = (KucnaHemija) obj;
		return Objects.equals(rokTranja, other.rokTranja);
	}

	@Override
	public String toString() {
		return "KucnaHemija [rokTranja=" + rokTranja + ", getRokTranja()=" + getRokTranja() + ", hashCode()="
				+ hashCode() + ", getNaziv()=" + getNaziv() + ", getSifra()=" + getSifra() + ", getOpis()=" + getOpis()
				+ ", getKolicina()=" + getKolicina() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ "]";
	}
	
	
}
