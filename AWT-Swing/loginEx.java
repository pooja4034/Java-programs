import java.awt.*;

class loginEx extends Frame{

    Label luname,lpass;
    TextField textname,textpass;
    Button login,cancel;

    public loginEx()
    {
        luname = new Label("Enter Usernam");
        textname=new TextField(10);

        lpass=new Label("Enter Password");
        textpass=new TextField(10);
        textpass.setEchoChar('*');
        login = new Button("login");
        cancel = new Button("cancel");

        setSize(300,400);
        setLayout(new FlowLayout());
        setVisible(true);

        add(luname);
        add(textname);
        add(lpass);
        add(textpass);
        add(login);
        add(cancel);
    }
    public static void main(String ar[])
    {
        loginEx ob = new loginEx();
    }
}