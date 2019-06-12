package quiz;

import java.io.Closeable;
import java.io.IOException;

public class ResourcesJava9Challenge2 {

  public static void main(String[] args) throws Exception {
    ResourcesJava9Challenge2.<AutoCloseable>invoke(new Juggy());
  }

  /**
   * AutoCloseable インターフェース
   *
   * 閉じられるまで、リソース(ファイルやソケット・ハンドルなど)を
   * 保持できるオブジェクト
   */
  static <T extends AutoCloseable> void invoke(T t) throws Exception {
    /**
     * try-with-resources (Java7 登場)
     *
     * tryのすぐ後にクローズの対象となるリソースの生成処理を記述していること
     * この方法によって finally ブロックで close() を呼び出さなくても自動で close をしてくれるようになる
     *
     * リソースが複数ある場合はセミコロンで区切る
     */
    try (t) {
      System.out.println("2");
    }
  }

  /**
   * Closeable インターフェス
   *
   * 閉じることができるデータの転送元または転送先
   *
   * 終了メソッドは、オブジェクトが保持しているリソース (開いているファイルなど) を解放するために呼び出される
   */
  static class Juggy implements Closeable {
    /**
     * AutoClosable::close
     *
     * リソース指定ヘッダーでそのオブジェクトが宣言されている try-with-resources ブロックの終了時に
     * 自動的に呼び出される
     *
     * この構築によって即時解放が確保され、
     * それ以外の場合に発生する可能性のあるリソース不足例外およびエラーを回避できる
     *
     * Closeable の close メソッドと異なり、
     * べき等 (ある操作を1回行っても複数回行っても結果が同じであること) である必要はない
     *
     *
     * Closeable::close
     *
     * ストリームを閉じて、それに関連するすべてのシステムリソースを解放する
     *
     * ストリームがすでに閉じられている場合は、このメソッドを呼び出しても効果はない
     */
    @Override
    public void close() throws IOException {
      System.out.println("1");
    }
  }
}
