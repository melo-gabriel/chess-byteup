import enums.ColorEnum;
import enums.PiecesEnum;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {

    private String[][] matriz;

    private List<Pecas> listaPecas;

//    private List<HistoricoJogadas> historicoJogadas;


    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatiris(String[][] matriz) {
        this.matriz = matriz;
    }

    public List<Pecas> getListaPecas() {
        return listaPecas;
    }

    public void setListaPecas(List<Pecas> listaPecas) {
        this.listaPecas = listaPecas;
    }

    public static void fillPieces() {

        String[][] matrizTabuleiro = new String[7][7];

//        @TODO criar uma linha para cada peça e posicionar dentro da matriz
//        @TODO lembrar que as brancas e pretas ficam em lados opostos e sao posicionadas de forma fixa em todo round

        List<Pecas> listaPecas = new ArrayList<>();
        Pecas peca = new Pecas(PiecesEnum.PAWN, ColorEnum.WHITE, 6, 0);
        Pecas peca1 = new Pecas(PiecesEnum.PAWN, ColorEnum.WHITE, 6, 1);
        Pecas peca2 = new Pecas(PiecesEnum.PAWN, ColorEnum.WHITE, 6, 2);
        Pecas peca3 = new Pecas(PiecesEnum.PAWN, ColorEnum.WHITE, 6, 3);
        Pecas peca4 = new Pecas(PiecesEnum.PAWN, ColorEnum.WHITE, 6, 4);
        Pecas peca5 = new Pecas(PiecesEnum.PAWN, ColorEnum.WHITE, 6, 5);
        Pecas peca6 = new Pecas(PiecesEnum.PAWN, ColorEnum.WHITE, 6, 6);
        Pecas peca7 = new Pecas(PiecesEnum.PAWN, ColorEnum.WHITE, 6, 7);
        Pecas peca8 = new Pecas(PiecesEnum.ROOK, ColorEnum.WHITE, 7, 0);
        Pecas peca9 = new Pecas(PiecesEnum.KNIGHT, ColorEnum.WHITE, 7, 1);
        Pecas peca10 = new Pecas(PiecesEnum.BISHOP, ColorEnum.WHITE, 7, 2);
        Pecas peca11 = new Pecas(PiecesEnum.KING, ColorEnum.WHITE, 7, 3);
        Pecas peca12 = new Pecas(PiecesEnum.QUEEN, ColorEnum.WHITE, 7, 4);
        Pecas peca13 = new Pecas(PiecesEnum.BISHOP, ColorEnum.WHITE, 7, 5);
        Pecas peca14 = new Pecas(PiecesEnum.KNIGHT, ColorEnum.WHITE, 7, 6);
        Pecas peca15 = new Pecas(PiecesEnum.ROOK, ColorEnum.WHITE, 7, 7);

        Pecas peca16 = new Pecas(PiecesEnum.PAWN, ColorEnum.BLACK, 1, 0);
        Pecas peca17 = new Pecas(PiecesEnum.PAWN, ColorEnum.BLACK, 1, 1);
        Pecas peca18 = new Pecas(PiecesEnum.PAWN, ColorEnum.BLACK, 1, 2);
        Pecas peca19 = new Pecas(PiecesEnum.PAWN, ColorEnum.BLACK, 1, 3);
        Pecas peca20 = new Pecas(PiecesEnum.PAWN, ColorEnum.BLACK, 1, 4);
        Pecas peca21 = new Pecas(PiecesEnum.PAWN, ColorEnum.BLACK, 1, 5);
        Pecas peca22 = new Pecas(PiecesEnum.PAWN, ColorEnum.BLACK, 1, 6);
        Pecas peca23 = new Pecas(PiecesEnum.PAWN, ColorEnum.BLACK, 1, 7);
        Pecas peca24 = new Pecas(PiecesEnum.ROOK, ColorEnum.BLACK, 0, 0);
        Pecas peca25 = new Pecas(PiecesEnum.KNIGHT, ColorEnum.BLACK, 0, 1);
        Pecas peca26 = new Pecas(PiecesEnum.BISHOP, ColorEnum.BLACK, 0, 2);
        Pecas peca27 = new Pecas(PiecesEnum.KING, ColorEnum.BLACK, 0, 3);
        Pecas peca28 = new Pecas(PiecesEnum.QUEEN, ColorEnum.BLACK, 0, 4);
        Pecas peca29 = new Pecas(PiecesEnum.BISHOP, ColorEnum.BLACK, 0, 5);
        Pecas peca30 = new Pecas(PiecesEnum.KNIGHT, ColorEnum.BLACK, 0, 6);
        Pecas peca31 = new Pecas(PiecesEnum.ROOK, ColorEnum.BLACK, 0, 7);

    }



    private void showChesseBoard() {
       System.out.println(this.matriz);
//        01-trocar a cor da peça preta para amarelo

    }

    public static boolean isChequeMate() {

//        01 - localizar o REI
//        02 - validar se as peças da outra cor nao podem mata-lo
//        03 - matriz varrer ate achar o REI
//        04 - matriz varrer todas as peças e calcular o range de ataque delas (posição do rei guardada passo 01)


        return Boolean.FALSE;
    }
}
