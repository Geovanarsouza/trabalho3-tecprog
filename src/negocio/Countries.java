package negocio;

import java.util.Objects;

import javax.swing.ImageIcon;

public enum Countries {
	BRASIL(new ImageIcon(Objects.requireNonNull(Countries.class.getResource("/img/brasil.jpg"))), "BRA"),
	ARGENTINA(new ImageIcon(Objects.requireNonNull(Countries.class.getResource("/img/argentina.jpg"))), "ARG"),
	HOLANDA(new ImageIcon(Objects.requireNonNull(Countries.class.getResource("/img/holanda.jpg"))), "HOL"),
	FRANÇA(new ImageIcon(Objects.requireNonNull(Countries.class.getResource("/img/frança.jpg"))), "FRA"),
	INGLATERRA(new ImageIcon(Objects.requireNonNull(Countries.class.getResource("/img/inglaterra.jpg"))), "ING"),
	MARROCOS(new ImageIcon(Objects.requireNonNull(Countries.class.getResource("/img/marrocos.jpg"))), "MAR"),
	PORTUGAL(new ImageIcon(Objects.requireNonNull(Countries.class.getResource("/img/portugal.jpg"))), "POR"),
	CROACIA(new ImageIcon(Objects.requireNonNull(Countries.class.getResource("/img/croacia.jpg"))), "CRO");
	
	final ImageIcon flag;
	final String name;
	
	private Countries(ImageIcon flag, String name) {
		this.flag = flag;
		this.name = name;
	}

	public ImageIcon getFlag() {
		return flag;
	}

	public String getName() {
		return name;
	}
	
	
	
	
}
