import javax.crypto.Cipher;
 
import javax.crypto.spec.SecretKeySpec;
 
//import org.apache.commons.codec.binary.Hex;
 
public class TestAES {
    private static String message = "This is just an example!!!!!!!!!!!";
 
    public static void main(String[] args) throws Exception {
//      // 1. 128 ��Ʈ ���Ű ����
//      KeyGenerator kgen = KeyGenerator.getInstance("AES");
//      kgen.init(128);
//      SecretKey skey = kgen.generateKey();
//
//      // 2. ��� Ű�� �̷��� �����Ͽ� ����ϸ� ��ȣȭ/��ȣȭ�� ��������.
//      sKeyString = Hex.encodeHexString(skey.getEncoded());
         
        byte[] sKey = new byte[16];
//      String key = "1234567890123456";
        String key = 
            TestHash.testMD5("���⿡ �н����� �ֱ�").substring(0, 16);
        sKey = key.getBytes();
 
        System.out.println("��ȣȭ �ϱ� �� �� : "+message);
         
        // ��ȣȭ ���� �غ��۾�
        SecretKeySpec skeySpec = new SecretKeySpec(sKey, "AES");
        Cipher cipher = Cipher.getInstance("AES");
         
        // 3. ��ȣȭ ����
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(message.getBytes());
        System.out.println("encrypted string: " + new String(encrypted));
 
        // 4. ��ȣȭ ����
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        byte[] original = cipher.doFinal(encrypted);
        System.out.println("Original string: " + new String(original));
    }
 
}