package org.example.structural.decorator.decorators;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressionDecorator extends DataSourceDecorator {
  private int compressionLevel = 6;

  public CompressionDecorator(DataSource wrapper) {
    super(wrapper);
  }

  public int getCompressionLevel() {
    return compressionLevel;
  }

  public void setCompressionLevel(int compressionLevel) {
    this.compressionLevel = compressionLevel;
  }

  @Override
  public void writeData(String data) {
    super.writeData(compress(data));
  }

  @Override
  public String readData() {
    return decompress(super.readData());
  }

  private String compress(String data) {
    byte[] result = data.getBytes();

    try {
      ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
      DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater(compressionLevel));
      dos.write(result);
      dos.close();
      return Base64.getEncoder().encodeToString(bout.toByteArray());
    } catch (IOException ex) {
      return null;
    }
  }

  private String decompress(String data) {
    byte[] result = Base64.getDecoder().decode(data);

    try {
      InputStream in = new ByteArrayInputStream(result);
      InflaterInputStream iin = new InflaterInputStream(in);
      ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
      int b;
      while ((b = iin.read()) != -1) {
        bout.write(b);
      }
      in.close();
      iin.close();
      bout.close();
      return bout.toString();
    } catch (IOException ex) {
      return null;
    }
  }
}
