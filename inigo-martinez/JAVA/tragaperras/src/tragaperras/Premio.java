package tragaperras;

public class Premio {

	static String arrayPremios[] = { "100€", "200€", "una patada en la cara", "un dia en el SPA",
			"un viaje de bus a tu casa" };

	public static String resolver(String... x) {

		if (x[0].equals(x[1]) && x[0].equals(x[2])) {

			return "HAS GANADO "+arrayPremios[(int) Math.random() * 4];

		}
		return "NO GANAS, REINTENTALO";

	}

}
