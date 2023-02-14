import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Cartest {
    @Test
    void AmalkardMashin() {
        Mashin mustang = new Mashin("mustang");
        Mashin benz = new Mashin("benz");

        boolean ayaMustangHarekatMikonad = mustang.ayaharekatmikonad();
        benz.roshanKardanmashin();
        boolean ayabenzHarekatMikonad = benz.ayaharekatmikonad();
        Assertions.assertFalse(ayaMustangHarekatMikonad);
        Assertions.assertTrue(ayabenzHarekatMikonad);


//       Mashin mashin = new Mashin();
//       mashin.bastanDar();
//        System.out.println("aya dar mashin baz ast?"+mashin.ayadarmashinbazast);
//        mashin.khamoshKardanmashin();
//       System.out.println("aya mashin roshan ast?"+mashin.ayaMashinRoshanAst);
//        mashin.ayaharekatmikonad();
//        System.out.println("...................................................");
//        Mashin camaro = new Mashin("camaro");
//        camaro.bastanDar();
//        System.out.println("aya dar mashin baz ast?"+camaro.ayadarmashinbazast);
//        camaro.roshanKardanmashin();
//        System.out.println("aya mashin roshan ast?"+camaro.ayaMashinRoshanAst);
//        camaro.ayaharekatmikonad();
    }

            class Mashin {

            boolean ayaMashinRoshanAst;
            boolean ayadarmashinbazast;
            String mark;
            Mashin(){
                System.out.println("yek mashin jadid darim");
            }
            Mashin(String mark){
                this.mark = mark;
                System.out.println("mashin mord nazar " + this.mark +   " ast");
            }


            void BazKardanDar() {
                System.out.println("dar "+this.mark +" baz ast");
                ayadarmashinbazast = true;
            }
                void bastanDar() {
                    System.out.println("dar "+ this.mark + " baste ast");
                    ayadarmashinbazast = false;
                }

                void roshanKardanmashin() {
                    System.out.println(this.mark +" roshan ast");
                    ayaMashinRoshanAst = true;
                }

                void khamoshKardanmashin() {
                    System.out.println(this.mark +" khamosh ast");
                    ayaMashinRoshanAst = false;
                }
            boolean ayaharekatmikonad() {
                if ( ayaMashinRoshanAst && !ayadarmashinbazast) {
                    System.out.println(this.mark +" dar hal harekat ast");
                    return true;
                } else {
                    System.out.println(this.mark +    " park shode ast");
                    return false;
                } // mashin test kamel nist

            }
        }
    }
