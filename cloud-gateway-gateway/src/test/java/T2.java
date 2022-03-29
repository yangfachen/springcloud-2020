import java.time.ZonedDateTime;

/**
 * @ClassName T2
 * @Description TODO
 * @Author yangchen
 * @Date 2021/5/24 16:12
 * @Version 1.0
 */

public class T2 {


    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
        //2021-05-24T16:12:48.509+08:00[Asia/Shanghai]
    }
}
