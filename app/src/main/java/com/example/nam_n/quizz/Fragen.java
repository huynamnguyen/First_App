package com.example.nam_n.quizz;

import java.util.ArrayList;

public class Fragen {

    ArrayList<String[]> fragen;

    public Fragen() {
        fragen = new ArrayList<>(7);

        listeFüllen();
    }

    private void listeFüllen() {
        String[] frage1 = new String[5];
        frage1[0] = "Was ist das meistgespielte Computerspiel auf der Welt?";
        frage1[1] = "League of Legends";
        frage1[2] = "Call of Duty Black Ops 4";
        frage1[3] = "World of Warcraft";
        frage1[4] = "Counter Strike: Global Offensive";

        String[] frage2 = new String[5];
        frage2[0] = "Welches Musikvideo hat am meisten Klicks auf Youtube?";
        frage2[1] = "Despacito";
        frage2[2] = "See You Again";
        frage2[3] = "Gangnam Style";
        frage2[4] = "Blank Space";

        String[] frage3 = new String[5];
        frage3[0] = "Welche Nationalität ist durchschnittlich am größten?";
        frage3[1] = "Niederlande";
        frage3[2] = "Vietnam";
        frage3[3] = "Deutschland";
        frage3[4] = "Lettland";

        String[] frage4 = new String[5];
        frage4[0] = "Wie viele Menschen waren bis heute auf dem Mond?";
        frage4[1] = "Zwölf";
        frage4[2] = "Zehn";
        frage4[3] = "Sechs";
        frage4[4] = "Achtzehn";

        String[] frage5 = new String[5];
        frage5[0] = "Wer ist der Entwickler dieser App?";
        frage5[1] = "Nam Nguyen";
        frage5[2] = "Arnold Schwarzenegger";
        frage5[3] = "Mark Zuckerberg";
        frage5[4] = "Lee Chan Li";

        String[] frage6 = new String[5];
        frage6[0] = "Welches ist das teuerste Lebensmittel?";
        frage6[1] = "Tee aus Panda-Kot";
        frage6[2] = "Matsutake-Pilze";
        frage6[3] = "Safran";
        frage6[4] = "Beluga Kaviar";

        String[] frage7 = new String[5];
        frage7[0] = "Welche Tierart ist für die meisten Tode verantwortlich?";
        frage7[1] = "Mücken";
        frage7[2] = "Haie";
        frage7[3] = "Hühner";
        frage7[4] = "Nilpferde";

        fragen.add(0, frage1);
        fragen.add(1, frage2);
        fragen.add(2, frage3);
        fragen.add(3, frage4);
        fragen.add(4, frage5);
        fragen.add(5, frage6);
        fragen.add(6, frage7);
    }

    public ArrayList<String[]> getFragen() {

        return fragen;
    }

}
