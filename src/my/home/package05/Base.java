package my.home.package05;

@BaseAction(level = 2, sqlRequest = "SELECT name, phone FROM phonebook")
public class Base {
    public void doAction(){
        Class<Base> baseClass = Base.class;
        BaseAction action = baseClass.getAnnotation(BaseAction.class);
        System.out.println(action.level());
        System.out.println(action.sqlRequest());
    }
}
