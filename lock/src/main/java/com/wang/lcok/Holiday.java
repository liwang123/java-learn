package com.wang.lcok;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Holiday {

    public static void main(String[] args) {
        try {

            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Calendar ca = Calendar.getInstance();
            Date d = df.parse("2014-11-04");
            Date date = new Date();
            ca.setTime(date);//设置当前时间

            Holiday ct = new Holiday();
            ct.initHolidayList("2019-10-07");//初始节假日
            ct.initHolidayList("2019-11-07");//初始节假日
            ct.initHolidayList("2019-11-03");//初始节假日

            Calendar c = ct.addDateByWorkDay(ca,3);
            System.out.println(df.format(c.getTime()));

        } catch ( Exception e) {
            // TODO: handle exception
            System.out.println(e.getClass());
            e.printStackTrace();
        }

    }


    private static List<Calendar> holidayList = new ArrayList<Calendar>();  //节假日列表

    /**
     *
     * <p>Title: addDateByWorkDay </P>
     * <p>Description: TODO  计算相加day天，并且排除节假日和周末后的日期</P>
     * @param calendar  当前的日期
     * @param day  相加天数
     * @return
     * return Calendar    返回类型   返回相加day天，并且排除节假日和周末后的日期
     * throws

     */
    public Calendar addDateByWorkDay(Calendar calendar,int day){

        try {
            for (int i = 0; i < day; i++) {

                calendar.add(Calendar.DAY_OF_MONTH, 1);

                if(checkHoliday(calendar)){
                    i--;
                }
            }
            return calendar;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return calendar;
    }


    public boolean checkHoliday(Calendar calendar) throws Exception{

        //判断日期是否是周六周日
        if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ||
                calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
            return true;
        }
        //判断日期是否是节假日
        for (Calendar ca : holidayList) {
            if(ca.get(Calendar.MONTH) == calendar.get(Calendar.MONTH) &&
                    ca.get(Calendar.DAY_OF_MONTH) == calendar.get(Calendar.DAY_OF_MONTH)&&
                    ca.get(Calendar.YEAR) == calendar.get(Calendar.YEAR)){
                return true;
            }
        }

        return false;
    }


    public void initHolidayList( String date){

        String [] da = date.split("-");

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, Integer.valueOf(da[0]));
        calendar.set(Calendar.MONTH, Integer.valueOf(da[1])-1);//月份比正常小1,0代表一月
        calendar.set(Calendar.DAY_OF_MONTH, Integer.valueOf(da[2]));
        holidayList.add(calendar);
    }
}
