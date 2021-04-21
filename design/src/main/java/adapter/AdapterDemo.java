package adapter;

/**
 * @Author: znj
 * @Date: 2021/4/21 0021 23:16
 */
public class AdapterDemo {

    public static void main(String[] args) {
        NewInterface oldAdapter = new Adapter(new OldInterfaceImpl());
        System.out.println(oldAdapter.newExecute());
        NewInterface newInterface = new NewInterfaceImpl();
        System.out.println( newInterface.newExecute());


    }

    static class Adapter implements NewInterface{
        private OldInterface oldInterface;

        Adapter(OldInterface oldInterface){
            this.oldInterface = oldInterface;
        }

        @Override
        public String newExecute() {
            return oldInterface.oldExecute();
        }
    }

    interface NewInterface {
        String newExecute();
    }

    static class NewInterfaceImpl implements NewInterface {
        @Override
        public String newExecute() {
            return "新接口实现";
        }
    }

    interface OldInterface {
        String oldExecute();
    }

    static class OldInterfaceImpl implements OldInterface {
        @Override
        public String oldExecute() {
            return "旧版本接口实现";
        }
    }




}
