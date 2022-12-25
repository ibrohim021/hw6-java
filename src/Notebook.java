public class Noutbook {
    String model;
    String os;
    int ram;
    int rom;
    int price;

    @Override
    public String toString() {
        return String.format("ml:%s  os:%b  ram:%d  rom:%f  pc:%g",model, os, ram, rom, price);

    }
}
