package p3;

public class Button {
    Closer closer; // объект ссылка
    public Button(Closer closer){
        this.closer = closer;

    }
    public  void  click(){
        closer.close();
    }
}
