package com.nix;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZigZagConversionTest {

    @Test
    public void convert() {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String s = "PAYPALISHIRING";
        String actual = zigZagConversion.convert(s, 3);
        String expected = "PAHNAPLSIIGYIR";

    }
    @Test
    public void convertSecond() {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String s = "PAYPALISHIRING";
        String actual = zigZagConversion.convert(s, 4);
        String expected = "PINALSIGYAHRPI";

    }
}