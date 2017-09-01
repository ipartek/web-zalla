package run;

import java.lang.reflect.Method;
import java.util.Arrays;

public class EjecturarReflection {

	public static void main(String[] args) throws Exception {
		
		Class<?> clasePizarra = Class.forName("aula.Pizarra");
		Object pizarra = clasePizarra.newInstance();
		Class<?>[] clasesParametros = new Class<?>[] { String.class };
		Method miMetodo = clasePizarra.getMethod("escribir", clasesParametros);
		Object[] parametros = new Object[] { "Hola,que tal?" };
		miMetodo.invoke(pizarra, parametros);

	}

}
