public class Main {
    public static void main(String[] args) {

        /*
        [A]:(55 != 55) && (false ^ true)
        [B]: considerando che a=true, b=false, int c=2e char d='2':(!a || !b) || c == d )
        [C]:false && true || false && !false
        [D]:(false && true) || (false || true))
         */

                boolean A = (55 != 55) && (false ^ true); // (55 != 55) && (false ^ true) = false && true = false


                boolean a = true;
                boolean b = false;
                int c = 2;
                char d = 2;
                boolean B = !(!a || b) || (c == d); //  !(!a || b) || (c == d) = !(false) || (true) = true || true = true


                boolean C = false && true || false && !false; // (false && true) || (false && !false) = false || false = false

                boolean D = (false && true) || (false || true); // (false && true) || (false || true) = false || true = true



                System.out.println("[A] = " + A + "\n[B] = " + B  + "\n[C] = " + C + "\n[D] = " + D);


            }
        }
