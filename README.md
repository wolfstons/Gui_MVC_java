# MVC grafikus felület – Java Swing

## A projekt rövid leírása

Ez a projekt egy egyszerű, Java Swing segítségével készített grafikus alkalmazás. A program az MVC (Model–View–Controller) felépítést szemlélteti.

Az alkalmazás ablakában egy gomb, egy felirat és egy többsoros szövegmező található. A gomb megnyomásakor a program a `rokarudi` szöveget írja ki a feliratra, majd 100 alkalommal hozzáfűzi azt a szövegmezőhöz.

## A projekt felépítése

A forrásfájlok az `src/app` mappában találhatók:

- **`main.java`** – A program belépési pontja. Beállítja a megjelenést, létrehozza az ablakot, majd elindítja a kontrollert.
- **`Nezet.java`** – A grafikus felületet megvalósító osztály. Tartalmazza a gombot, a feliratot és a szövegmezőt, valamint a megjelenítéshez szükséges metódusokat.
- **`Kontroller.java`** – Kezeli a felhasználói eseményeket. A gombhoz eseményfigyelőt rendel, és kattintáskor meghívja a nézet megfelelő metódusait.

## Az MVC működése a projektben

Az MVC három fő részből áll:

1. **Model (Modell):** Az alkalmazás adatait és az azokkal kapcsolatos logikát tartalmazza. Ebben az egyszerű példában külön modell osztály nem készült, mert az alkalmazás csak egy rövid, előre megadott szöveget jelenít meg.
2. **View (Nézet):** A `Nezet` osztály. Ez felelős a grafikus elemek megjelenítéséért.
3. **Controller (Kontroller):** A `Kontroller` osztály. Figyeli a gombnyomást, és meghatározza, hogy az esemény hatására milyen műveletek történjenek.

A működés menete:
- A `main` osztály létrehozza a `Nezet` példányát.
- A `main` átadja a nézetet a `Kontroller` konstruktorának.
- A kontroller eseményfigyelőt rendel a gombhoz.
- A gomb megnyomásakor a kontroller meghívja a nézet `megjelenit()` és `megjelenitarea()` metódusait.
- A nézet frissíti a feliratot és a szövegmező tartalmát.

## A program futtatása

### NetBeans használatával

1. Csomagold ki a projekt ZIP-fájlját.
2. Indítsd el a NetBeans IDE-t.
3. Válaszd a **File → Open Project** menüpontot.
4. Tallózd ki a kicsomagolt `MVC_grafikusfelulet` mappát.
5. Nyisd meg a projektet, majd kattints a **Run Project** gombra, vagy nyomd meg az `F6` billentyűt.

A projekt Java 21-es forrás- és célverzióra van beállítva.

## Használt technológiák

- Java 21
- Java Swing
- NetBeans projektstruktúra

## Megjegyzés

A projekt oktatási célú, egyszerű MVC-példa. A feladatban a nézet és a kontroller külön osztályban szerepel, külön modell osztály jelenleg nincs.
