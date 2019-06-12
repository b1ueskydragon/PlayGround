package quiz;

import java.io.*;

/**
 * シリアライズ: オブジェクトをバイト配列に変換すること
 *
 * オブジェクトをファイルやデータベース保存、ネットワーにク経由の送受信などで利用する
 */
public class SerializeChallenge2 {
  public static void main(String[] args) {
    Xmen xmen = new Xmen();
    try (FileOutputStream fs = new FileOutputStream("SerTest.ser");
         ObjectOutputStream os = new ObjectOutputStream(fs)) {
      xmen.name = "Wolverine";
      xmen.power = "Healing and defensive powers";

      os.writeObject(xmen);
    } catch (Exception exception) {
      exception.printStackTrace();
    }

    try (FileInputStream fis = new FileInputStream("SerTest.ser");
         ObjectInputStream ois = new ObjectInputStream(fis)) {
      xmen = (Xmen) ois.readObject();

      System.out.println(xmen.name);
      System.out.println(xmen.power);
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }

  static class Xmen implements Serializable {
    private static final long serialVersionUID = 632L;
    String name;
    transient String power; // シリアライズの対象から除外

    private void readObject(ObjectInputStream aInputStream) throws ClassNotFoundException, IOException {
      name = aInputStream.readUTF();
      power = aInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream aOutputStream) throws IOException {
      aOutputStream.writeUTF(name);
      aOutputStream.writeUTF(power);
    }
  }
}
