import enums.ColorEnum;
import enums.PiecesEnum;

public class Pecas {
    
    private PiecesEnum piece;

    private ColorEnum color;

    private int line;

    private int colunm;

    public Pecas(){
    }

    public Pecas(PiecesEnum piece, ColorEnum color, int line, int colunm) {
        this.piece = piece;
        this.color = color;
        this.line = line;
        this.colunm = colunm;
    }

    public PiecesEnum getPiece() {
        return piece;
    }

    public void setPiece(PiecesEnum piece) {
        this.piece = piece;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColunm() {
        return colunm;
    }

    public void setColunm(int colunm) {
        this.colunm = colunm;
    }
}
