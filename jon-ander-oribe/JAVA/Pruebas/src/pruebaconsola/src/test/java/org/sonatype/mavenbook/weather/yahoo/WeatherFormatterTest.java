package org.sonatype.mavenbook.weather.yahoo;

import java.io.InputStream;

import org.apache.commons.io.IOUtils;

import com.ipartek.proyectos.pruebaconsola.Weather;
import com.ipartek.proyectos.pruebaconsola.WeatherFormatter;
import com.ipartek.proyectos.pruebaconsola.YahooParser;

import junit.framework.TestCase;

public class WeatherFormatterTest extends TestCase {

  public WeatherFormatterTest(String name) {
    super(name);
  }

  public void testFormat() throws Exception {
    InputStream nyData = getClass().getClassLoader()
      .getResourceAsStream("ny-weather.xml");
    Weather weather = new YahooParser().parse( nyData );
    String formattedResult = new WeatherFormatter().format( weather );
    InputStream expected = getClass().getClassLoader()
      .getResourceAsStream("format-expected.dat");
    assertEquals( IOUtils.toString( expected ).trim(),
                      formattedResult.trim() );
  }
}