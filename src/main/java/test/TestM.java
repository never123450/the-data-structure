package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestM {
    public static void main(String[] args) {
        double JianShe = 79234.57;//80427.58;//79271.41;//71017.77;//72140.38;//64042.12;
        double ZhaoShang = 8326.12;//8307.78;//7288.23;
        double WeiXin = 62858.43;//64597.65;//53670.92+102.48;//49859.58;//49258.51;
        double ZhiFuBao = 59600;//66305.15;//61708.75;//71661.36;//74293;//71602.54;
        double XianYu = 2398.56;//2200;//2000;//1671.70;
        double huaBei = 1905.02;//1200;
        double fangZu = 0;
        System.out.println(JianShe+ZhaoShang+WeiXin+ZhiFuBao-huaBei-fangZu);
        System.out.println("xianyu:"+XianYu);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("时间:"+ LocalDateTime.now().format(df));

        /**
         * 191191.40000000002
         * xianyu:1616.3
         * 时间:2018-10-02 14:54:06
         */
        /**
         * 194926.94
         * xianyu:2000
         * 时间:2018年10月28日19:25:51
         */

        /**
         * 201861.34
         * xianyu:2200.0
         * 时间:2018-11-19 19:03:28
         */


        /**
         * 217751.48
         xianyu:2398.56
         时间:2018-12-26 14:06:34
         */

        /**
         * 208114.1
         xianyu:2398.56
         时间:2019-01-10 19:11:45
         */

    }
}