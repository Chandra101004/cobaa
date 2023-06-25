package Array;


    public class Main {
        public static void main(String[] args) {
            
            LinkedList<Mahasiswa> mhs = new LinkedList<>();
            
            mhs.add(new Mahasiswa("16523001","Idris",3.88));
            mhs.add(new Mahasiswa("16523002","Agus",3.18));
            mhs.add(new Mahasiswa("16523003","Dani",3.42));
            mhs.add(new Mahasiswa("16523008","Roni",3.67));
            mhs.add(new Mahasiswa("16523020","Sinta",3.05));
            
            LinkedList.Element ptr = mhs.first;
            
            while (ptr != null) {
                Mahasiswa m = (Mahasiswa) ptr.data;
                System.out.println("NIM: " + m.getNIM());
                System.out.println("Nama: " + m.getNama());
                System.out.println("IPK: " + m.getIPK());
                System.out.println("");
                ptr = ptr.next;    
            }
    
            if (mhs.size() > 3) {
                Mahasiswa m3 = (Mahasiswa) mhs.get(3);
                m3.setIPK(3.89);
                System.out.println("IPK Mahasiswa pada index ke 3 adalah: " + m3.getIPK());
                System.out.println("");
            }
            
        }
    }
    

