package Array;

import Array.Queque.Queue;

public class TestQuequeDinamis {

        /**
         * @param args
         * @throws Exception
         */
        public static void main(String[] args) throws Exception  {
            Queue <String> mhs = new Queue<>();
        
            mhs.add("Agus");
            mhs.add("Sinta");
            mhs.add("Bambang");
        System.out.println("Elemen pertama: "+mhs.peek());
        mhs.remove();
        System.out.println("Elemen pertama: "+mhs.peek());
        mhs.clear();
        System.out.println("Elemen pertama: "+mhs.peek());
        }
     }

