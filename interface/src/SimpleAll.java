import tec.Usager;
import tec.Transport;
//import tec.Autobus;
//import tec.PassagerStandard;
//import tec.PassagerIndecis;
//import tec.PassagerStresse;
import tec.FabriqueTec;


class SimpleAll {
  static private void deboguerEtat(Transport t, Usager p) {
    System.out.println(p);
    System.out.println(t);
  }

  static public void main(String[] args) {
      Transport serenity = FabriqueTec.faireAutobus(2,2);

      Usager nathan = FabriqueTec.fairePassager("Nathan", 4,0);
      Usager guillaume = FabriqueTec.fairePassager("Guillaume", 6,0);
      Usager maxime = FabriqueTec.fairePassager("Maxime", 6,2);
      Usager martial = FabriqueTec.fairePassager("Martial", 5,1);
      Usager ismail = FabriqueTec.fairePassager("Ismail", 5,1);

    // 0
    System.out.println(serenity);

    serenity.allerArretSuivant();
    // 1
    nathan.monterDans(serenity);

    System.out.println(serenity);
    System.out.println(nathan);

    serenity.allerArretSuivant();
    // 2
    maxime.monterDans(serenity);
    martial.monterDans(serenity);

    System.out.println(serenity);
    System.out.println(nathan);
    System.out.println(maxime);
    System.out.println(martial);

    serenity.allerArretSuivant();
    // 3
    guillaume.monterDans(serenity);

    System.out.println(serenity);
    System.out.println(nathan);
    System.out.println(maxime);
    System.out.println(martial);
    System.out.println(guillaume);

    serenity.allerArretSuivant();
    // 4
    ismail.monterDans(serenity);

    System.out.println(serenity);
    System.out.println(nathan);
    System.out.println(maxime);
    System.out.println(martial);
    System.out.println(guillaume);
    System.out.println(ismail);

    serenity.allerArretSuivant();
    // 5
    System.out.println(serenity);
    System.out.println(maxime);
    System.out.println(martial);
    System.out.println(guillaume);
    System.out.println(ismail);

    serenity.allerArretSuivant();
    // 6
    System.out.println(serenity);
    System.out.println(maxime);
    System.out.println(guillaume);
  }
}
