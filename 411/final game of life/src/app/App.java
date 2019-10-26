package app;

import java.util.Arrays;

public class App {
    // Global definierte Konstanten für die beiden Dimensionen
    private final static int DIM_X = 20;
    private final static int DIM_Y = 20;

    // Liefert eine zufällig initialisierte Welt
    private boolean[][] initWelt() {
        boolean[][] welt = new boolean[DIM_Y][];

        for (int y = 0; y < welt.length; y++) {
            welt[y] = new boolean[DIM_X];
        }
        for (int i = 0; i < 6; i++) {
            createLife(welt);
        }
        return welt;
    }

    private void createLife(boolean[][] welt) {
        int posX = (int) (Math.random() * (DIM_X - 3));
        int posY = (int) (Math.random() * (DIM_Y - 3));
        int dirX = (int) (Math.random() * 2) == 1 ? 1 : -1;
        int dirY = (int) (Math.random() * 2) == 1 ? 1 : -1;

        welt[1 + posY][1 + posX] = true;
        welt[1 + posY + dirY][1 + posX] = true;
        welt[1 + posY][1 + posX + dirX] = true;
    }

    // Gibt die aktuelle Welt aus
    private void zeigeWelt(boolean[][] welt) {
        for (int y = 0; y < welt.length; y++) {
            for (int x = 0; x < welt[y].length; x++) {
                System.out.print(welt[y][x] ? "███" : "   ");
            }
            System.out.println();
        }
    }

    private boolean[][] cloneWelt(boolean[][] welt) {
        if (welt == null)
            return null;
        boolean[][] result = new boolean[welt.length][];
        for (int r = 0; r < welt.length; r++) {
            result[r] = welt[r].clone();
        }
        return result;
    }

    // Wendet die 4 Regeln an und gibt die Folgegeneration wieder zurück
    private boolean[][] wendeRegelnAn(boolean[][] welt) {
        boolean[][] neueWelt = cloneWelt(welt);
        for (int y = 0; y < welt.length; y++) {
            for (int x = 0; x < welt[y].length; x++) {
                int anzahlNachbarn = this.anzahlNachbarn(welt, x, y);
                neueWelt[y][x] = (welt[y][x] && anzahlNachbarn == 2) || anzahlNachbarn == 3;
            }
        }

        return neueWelt;
    }

    // Liefert Anzahl Nachbarn einer Zelle
    public int anzahlNachbarn(boolean[][] welt, int x, int y) {
        int returnValue = 0;
        for (int i = Math.max(0, y - 1); i <= Math.min(welt.length - 1, y + 1); ++i) {
            for (int j = Math.max(0, x - 1); j <= Math.min(welt[y].length - 1, x + 1); ++j) {
                if (welt[i][j])
                    returnValue += 1;
            }
        }
        // einen Nachbarn zuviel mitgezählt?
        if (welt[y][x])
            returnValue -= 1;
        return returnValue;
    }

    public static void main(String[] args) throws Exception {
        App game = new App();

        // Welt initialisieren
        boolean[][] welt = game.initWelt();

        System.out.println("Startkonstellation");
        game.zeigeWelt(welt);

        boolean[][] neueWelt;
        for (int i = 1; i <= 100; i++) {
            neueWelt = game.wendeRegelnAn(welt);
            if (Arrays.deepEquals(neueWelt, welt)) {
                break;
            }
            welt = neueWelt;
            System.out.println("Generation " + i);
            game.zeigeWelt(welt);
            Thread.sleep(200);
        }
    }
}