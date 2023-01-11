package ders39abstractClass;

public class CHondaCıivic extends BHonda{

    @Override
    public void motor() {
        System.out.println("Honda civic araclar vitec teknololjılı cevrrecı motorlar kullanır");
    }

    @Override
    public void kasas() {
        System.out.println("Civic araclar sedan veya hb arac kullanır");
    }

    @Override
    public void tekerlek() {
        System.out.println("civic araclar 205x55x16 teker kullanır");
    }

    @Override
    public void yakıt() {
        System.out.println("Civic aracalar benzınlıdır");
    }

    @Override
    public void güvenlik() {
        System.out.println("Civix araclar guvenlık standardına uyar");
    }

    @Override
    public void abs() {
        super.abs();
    }

    @Override
    public void klima() {
        super.klima();
    }

    @Override
    public void marka() {
        super.marka();
    }

    @Override
    public void özelTeknoloji() {
        super.özelTeknoloji();
    }

    public static void main(String[] args) {
        CHondaCıivic civic=new CHondaCıivic();

        BHonda civic1;
        civic1 = null;
        civic1.abs();
        civic1.klima();
        civic1.marka();
        civic1.özelTeknoloji();
    }
}
