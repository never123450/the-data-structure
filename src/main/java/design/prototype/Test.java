package design.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化"+"mail:"+mail);
        for(int i=0;i<10;i++){
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名"+i);
            mailTemp.setContent("恭喜您，中奖了");
            mailTemp.setEmailAddress("姓名"+i+"@qq.com");
            MailUtil.sendMail(mailTemp);
            System.out.println("mailTemp"+mailTemp);
        }

        MailUtil.saveOriginMailRecod(mail);

    }
}