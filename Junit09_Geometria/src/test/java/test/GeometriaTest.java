package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import JUnit.Junit09_Geometria.dto.Geometria;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class GeometriaTest {

	@Test
	void testConstrucor() {
		Geometria geometria = new Geometria(4);
		assertEquals(geometria, geometria);
	}

	@Test
	void testareacuadrado() {
		Geometria geometria = new Geometria();
		int areaCuadrado = geometria.areacuadrado(4);
		int result = 16;
		assertEquals(areaCuadrado, result);
	}

	@Test
	void testAreaCirculo() {
		int radio = 4;

		Geometria geometria = new Geometria();
		double areaCirculo = geometria.areaCirculo(radio);

		final double PI = 3.1416;
		double result = PI * Math.pow(radio, 2);

		assertEquals(areaCirculo, result);
	}

	@Test
	void testAreaTriangulo() {
		int base = 1;
		int altura = 2;

		Geometria geometria = new Geometria();
		double areaTriangulo = geometria.areatriangulo(altura, base);

		int result = 1;

		assertEquals(areaTriangulo, result);
	}

	@Test
	void testAreaRectangulo() {
		int base = 5;
		int altura = 2;

		Geometria geometria = new Geometria();
		double areaRectangulo = geometria.arearectangulo(base, altura);

		int result = 10;

		assertEquals(areaRectangulo, result);
	}

	@Test
	void testAreaPentagono() {
		int perimetro = 20;
		int apotema = 2;

		Geometria geometria = new Geometria();
		double areaPentagono = geometria.areapentagono(perimetro, apotema);

		int result = 20;

		assertEquals(areaPentagono, result);
	}
	
	@Test
	void testAreaRombo() {
		int l = 6;
		int a = 2;
		
		Geometria geometria = new Geometria();
		double areaRombo = geometria.arearombo(l, a);
		
		int result = 6;
		
		assertEquals(areaRombo, result);
	}
	
	@Test
	void testarearomboide() {
		int base = 6;
		int altura = 2;
		
		Geometria geometria = new Geometria();
		double areaRomboide = geometria.arearomboide(base, altura);
		
		int result = 12;
		
		assertEquals(areaRomboide, result);
	}
	
	@Test
	void testareatrapecio() {
		int base1 = 13;
		int base2 = 7;
		int altura = 6;
		
		Geometria geometria = new Geometria();
		double areatrapecio = geometria.areatrapecio(base1, base2, altura);
		
		int result = 60;
		
		assertEquals(areatrapecio, result);
	}
	
	@Test
	void gettersSetters() {
		Geometria geometria1 = new Geometria(1);
		Geometria geometria2 = new Geometria(2);
		Geometria geometria3 = new Geometria(3);
		Geometria geometria4 = new Geometria(4);
		Geometria geometria5 = new Geometria(5);
		Geometria geometria6 = new Geometria(6);
		Geometria geometria7 = new Geometria(7);
		Geometria geometria8 = new Geometria(8);
		Geometria geometriaOtro = new Geometria(9);
		
		geometria1.setId(2);
		geometria1.getId();
		
		geometria2.setNom("TrianguloRectangulo");
		geometria2.getNom();
		
		geometria3.setArea(20);
		geometria3.getArea();
		
		geometria3.toString();
	}
	
	
	
}
