package vPRG1;

import java.util.Scanner;

class Edlin {
    public static void main(String[] args) {
        int activeLine[] = { 1 };
        String document[] = {
                "Bienvenidos al editor EDLIN",
                "Utilice el menu inferior para editar el texto",
                "------",
                "[L] permite definir la linea activa",
                "[E] permite editar la linea activa",
                "[I] permite intercambiar dos lineas",
                "[B] borra el contenido de la linea activa",
                "[S] sale del programa",
                "",
                ""
        };
        String[] emptyDocument = new String[10];
        String history[][] = { document,
                emptyDocument.clone(),
                emptyDocument.clone(),
                emptyDocument.clone(),
                emptyDocument.clone(),
                emptyDocument.clone()
        };
        int activeDocument[] = { 0 };

        do {
            print(history, activeDocument, activeLine);
        } while (processActions(history, activeDocument, activeLine));
    }

    static void print(String[][] history, int[] activeDocument, int[] activeLine) {
        clearScreen();
        printHorizontalLine();
        for (int line = 0; line < history[activeDocument[0]].length; line++) {
            System.out.println(line + separator(line, activeLine[0]) + history[activeDocument[0]][line]);
        }
        printHorizontalLine();
    }

    static String separator(int line, int activeLine) {
        return line == activeLine ? ":*| " : ": | ";
    }

    static void printHorizontalLine() {
        System.out.println("-".repeat(50));
    }

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static boolean processActions(String[][] history, int activeDocument[], int[] activeLine) {
        System.out.println("Comandos: [L]inea activa | [E]ditar | [I]ntercambiar | [B]orrar | [S]alir");
        boolean mustContinue = true;
        switch (askChar()) {
            case 'S', 's' -> mustContinue = !mustContinue;
            case 'L', 'l' -> setActiveLine(history[activeDocument[0]], activeLine);
            case 'E', 'e' -> edit(history, activeDocument, activeLine);
            case 'I', 'i' -> exchangeLines(history[activeDocument[0]]);
            case 'B', 'b' -> delete(history[activeDocument[0]], activeLine);
            case 'U', 'u' -> undo(history, activeDocument);
        }
        return mustContinue;
    }

    static void undo(String[][] history, int[] activeDocument) {
        activeDocument[0] = activeDocument[0] > 0 ? activeDocument[0] = activeDocument[0] - 1 : history.length - 1;
    }

    static char askChar() {
        Scanner input = new Scanner(System.in);
        return input.next().charAt(0);
    }

    static void delete(String[] document, int[] activeLine) {
        System.out.println("Esta acción es irreversible: indique el número de línea activa para confirmarlo ["
                + activeLine[0] + "]");
        if (askInt() == activeLine[0]) {
            document[activeLine[0]] = "";
        }
    }

    static void exchangeLines(String[] document) {
        int originLine, destinationLine;
        String temporaryLine;
        boolean validLine = true;

        do {
            System.out.print("Indique primera línea a intercambiar: ");
            originLine = askInt();
            validLine = originLine >= 0 && originLine < document.length;
        } while (!validLine);

        do {
            System.out.print("Indique segunda línea a intercambiar: ");
            destinationLine = askInt();
            validLine = destinationLine >= 0 && destinationLine < document.length;
        } while (!validLine);

        temporaryLine = document[destinationLine];
        document[destinationLine] = document[originLine];
        document[originLine] = temporaryLine;
    }

    static void edit(String[][] history, int[] activeDocument, int[] activeLine) {
        System.out.println("EDITANDO> " + history[activeDocument[0]][activeLine[0]]);
        String newText = askString();
        String[] newDocument = history[activeDocument[0]].clone();
        newDocument[activeLine[0]] = newText;
        activeDocument[0] = activeDocument[0] < history.length - 1 ? activeDocument[0] = activeDocument[0] + 1 : 0;
        history[activeDocument[0]] = newDocument;
    }

    static String askString() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    static void setActiveLine(String[] document, int[] activeLine) {
        boolean validLine = true;
        do {
            System.out.print("Indique la nueva línea activa: ");
            activeLine[0] = askInt();
            validLine = activeLine[0] >= 0 && activeLine[0] < document.length;
        } while (!validLine);
    }

    static int askInt() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
