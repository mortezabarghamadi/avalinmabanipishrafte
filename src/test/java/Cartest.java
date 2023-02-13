import org.junit.jupiter.api.Test;

public class Cartest {

            class carrrrtest {

            boolean ayaMashinRoshanAst;
            boolean ayadarmashinbazast;

            void BazKardanDar() {
                System.out.println("dar baz ast");
                ayadarmashinbazast = true;
            }

            void bastanDar() {
                System.out.println("dar baste ast");
                ayadarmashinbazast = false;
            }

            void roshanKardanmashin() {
                System.out.println("mashin roshan ast");
                ayaMashinRoshanAst = true;
            }

            void khamoshKardanmashin() {
                System.out.println("mashin khamosh ast");
                ayaMashinRoshanAst = false;
            }

            void harekat() {
                if (!ayaMashinRoshanAst && ayadarmashinbazast) {
                    System.out.println("mashin dar hal harekat ast");
                } else {
                    System.out.println("mashin dar ha harekat nist");
                }

            }
        }
    }