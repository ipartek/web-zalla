package geom3d;

import geom2d.Cuadrado;

public class Prisma extends Figura3D {

	public Prisma(Cuadrado base, double altura) {
		super(base, altura);
	}

	@Override
	protected double areaBase() {
		return base.area();
	}

}
