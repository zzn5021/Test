package com.zhangzn.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtil {

  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:南爸爸(823865618@qq.com)
   * <br>Date:2019年5月20日
   * @param args
   * @throws ParseException
   */
  public static void main(String[] args) throws ParseException {

    Calendar calendar = Calendar.getInstance();
    getFirstDathMonth("yyyy-MM-dd");
  }

  //获取最后某天日期
  private static void getFirstDathMonth(String stringType) throws ParseException {
    // TODO Auto-generated method stub

    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.MONTH, 1);
    System.out.println(calendar.get(Calendar.MONTH));
    calendar.set(Calendar.DAY_OF_MONTH, 1);
    System.out.println(calendar.get(Calendar.MONTH));
    System.out.println(calendar.getTime());
  }

  //将字符串转换为YYYY-MM-dd
  private Date toDate(String pattern, String date) {
    try {
      return new SimpleDateFormat(pattern).parse(date);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return null;

  }

  //将日期转化为字符串
  public String toString(String pattern, Date date) {

    return new SimpleDateFormat(pattern).format(date);

  }
}
