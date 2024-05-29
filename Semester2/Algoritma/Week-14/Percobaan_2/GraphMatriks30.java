package Percobaan_2;

public class GraphMatriks30 {
    int vertex;
    int[][] matriks;

    public GraphMatriks30(int v){
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak){
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan){
        matriks[asal][tujuan] = 0;
    }

    public void printGraph(){
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + " : ");
            for (int j = 0; j < vertex; j++) {
                System.out.print("Gedung " + (char)('A' + j) + " (" + matriks[i][j] + " m),");
            }
            System.out.println();
        }
    }

    public void degree(int asal){
        int k, totalIn = 0, totalOut = 0;
        for(int i = 0; i < vertex; i++){
            if (matriks[i][asal] != 0) {
                totalIn++;
            }
        }
        for (int i = 0; i < vertex; i++) {
            if (matriks[asal][i] != 0) {
                totalOut++;
            }
        }
        System.out.println("InDegree dari gedung " + (char)('A' + asal) + " : " + totalIn);
        System.out.println("OutDegree dari gedung " + (char)('A' + asal) + " : " + totalOut);
        System.out.println("Degree dari gedung " + (char)('A' + asal) + " : " + (totalIn + totalOut));  
    }
}
