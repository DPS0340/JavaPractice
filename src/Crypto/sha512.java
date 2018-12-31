package Crypto;

import java.security.*;
public class sha512 {
    // 문자열을 SHA-512 방식으로 암호화
    public String encrypt(String input) throws NoSuchAlgorithmException {
        String output = "";
        StringBuffer sb = new StringBuffer();
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        md.update(input.getBytes());
        byte[] msgb = md.digest();
        for (int i = 0; i < msgb.length; i++) {
            byte temp = msgb[i];
            String str = Integer.toHexString(temp & 0xFF);
            while (str.length() < 2) {
                str = "0" + str;
            }
            str = str.substring(str.length() - 2);
            sb.append(str);
        }
        output = sb.toString();
        return output;
    }
    // from http://ironmask.net/162 철가면의 세상사는 법 blog
}
