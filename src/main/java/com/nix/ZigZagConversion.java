package com.nix;

public class ZigZagConversion {
    public static String s = "PAYPALISHIRING";
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        int t = s.length() / (2 * (numRows - 1));
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                for (int j = 0; j <= t; j++) {
                    if (2 * j * (numRows - 1) <= s.length() - 1)
                        str.append(s.charAt(2 * j * (numRows - 1)));
                }
            } else if (i == numRows - 1) {
                for (int j = 0; j <= t; j++) {
                    if ((2 * j + 1) * (numRows - 1) <= s.length() - 1)
                        str.append(s.charAt((2 * j + 1) * (numRows - 1)));
                }
            } else {
                for (int j = 0; j <= t; j++) {
                    if (2 * j * (numRows - 1) + i <= s.length() - 1)
                        str.append(s.charAt(2 * j * (numRows - 1) + i));
                    if (2 * j * (numRows - 1) + i + 2 * (numRows - 1) - 2 * i <= s.length() - 1)
                        str.append(s.charAt(2 * j * (numRows - 1) + i + 2 * (numRows - 1) - 2 * i));
                }
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        zigZagConversion.convert(s, 3);
    }
}
