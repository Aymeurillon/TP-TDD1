package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero() {
		String input = "0";
		String expected = "zéro";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_un() {
		String input = "1";
		String expected = "un";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_deux() {
		String input = "2";
		String expected = "deux";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_trois() {
		String input = "3";
		String expected = "trois";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_quatre() {
		String input = "4";
		String expected = "quatre";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_cinq() {
		String input = "5";
		String expected = "cinq";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_six() {
		String input = "6";
		String expected = "six";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_sept() {
		String input = "7";
		String expected = "sept";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_huit() {
		String input = "8";
		String expected = "huit";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_neuf() {
		String input = "9";
		String expected = "neuf";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_dix() {
		String input = "10";
		String expected = "dix";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_onze() {
		String input = "11";
		String expected = "onze";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_douze() {
		String input = "12";
		String expected = "douze";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_treize() {
		String input = "13";
		String expected = "treize";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_quatorze() {
		String input = "14";
		String expected = "quatorze";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_quinze() {
		String input = "15";
		String expected = "quinze";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_seize() {
		String input = "16";
		String expected = "seize";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_vingt() {
		String input = "20";
		String expected = "vingt";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_trente() {
		String input = "30";
		String expected = "trente";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_quarante() {
		String input = "40";
		String expected = "quarante";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_cinquante() {
		String input = "50";
		String expected = "cinquante";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_soixante() {
		String input = "60";
		String expected = "soixante";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_vingt_quatre() {
		String input = "24";
		String expected = "vingt quatre";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);

		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_vingt_et_un() {
		String input = "21";
		String expected = "vingt et un";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);

		Assert.assertEquals(expected, actual);
	}
}
