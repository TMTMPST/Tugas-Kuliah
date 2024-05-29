package Tugas;

public class Graph30 {
    int vertex;
    DoubleLinkedList30 list[];
    int edge;

    public Graph30(int v) {
        vertex = v;
        edge = 0;
        list = new DoubleLinkedList30[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList30();
        }
    }

    public int edge(){
        return edge;
    }

    public void addEdge(int asal, int tujuan, int jarak){
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for(int i = 0; i < vertex; i++){
            for(int j = 0; j < list[i].size(); j++){
                if(list[i].get(j) == asal)
                    ++totalIn;
            }
            for(k = 0; k < list[asal].size(); k++){
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari gedung " + (char)('A' + asal) + " : " + totalIn);
        System.out.println("OutDegree dari gedung " + (char)('A' + asal) + " : " + totalOut);
        System.out.println("Degree dari gedung " + (char)('A' + asal) + " : " + (totalIn + totalOut));
    }

    public void removeEdge (int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdge(){
        for (int i = 0; i < list.length; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char)('A' + list[i].get(j)) + " ( " + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public void cekEdge(int asal, int tujuan) throws Exception {
        boolean found = true;
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Gedung " + (char) ('A' + asal) + " Dan " + (char) ('A' + tujuan) + " Bertetangga");
        } else {
            System.out.println("Gedung " + (char) ('A' + asal) + " Dan " + (char) ('A' + tujuan) + " Tidak Bertetangga");
        }
    }

    //No 2 Update Jarak
    public void updateJarak(int asal, int tujuan, int jarak) throws Exception{
        boolean found = false;
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                list[asal].updateJarak(i, jarak);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Berhasil diupdate");
        } else {
            System.out.println("Edge tidak ditemukan");
        }
    }

    //No 3 hitung Edge
    public int hitungEdge() {
        int totalEdges = 0;
        for (int i = 0; i < vertex; i++) {
            totalEdges += list[i].size();
        }
        return totalEdges;
    }
}
