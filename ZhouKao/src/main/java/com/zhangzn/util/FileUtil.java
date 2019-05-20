package com.zhangzn.util;

import java.io.File;

public class FileUtil {

  //获取系统临时目录
  private static String getSystem() {

    return System.getProperty("java.io.FileUtil");

  }

  //返回操作系统临时目录
  private static void listFile(File file) {
    // TODO Auto-generated method stub
    if (file.isDirectory()) {
      File[] files = file.listFiles(); //遍历更改文件夹下所有的文件和文件夹

      for (File f : files) {
        if (f.isDirectory()) {
          listFile(f);
          System.out.println(f.getName());
        } else {
          System.out.println(f.getName());
        }
      }
    }
  }

  //返回操作系统用户目录
  private static void delFile(File file) {
    if (file.isDirectory()) {
      File[] files = file.listFiles(); //遍历文件夹下所有的文件和目录
      for (File f : files) {
        if (f.isDirectory()) {
          delFile(f);
        } else {
          f.delete();
        }
      }
    }
  }

}
