package ru.job4j.btcmp.postSimulation;

public class Thief implements MailService{
    int thiefPrice;
    int stolenValue = 0;

    public Thief(int thiefPrice) {
        this.thiefPrice = thiefPrice;
    }

    int getStolenValue() {
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {


        if(mail instanceof MailPackage && ((MailPackage) mail).getContent().getPrice() >= thiefPrice) {
            String stonesContent =  "stones instead of " + ((MailPackage) mail).getContent().getContent();
            Package emptyParcel = new Package(stonesContent, 0);
            MailPackage stonesFromThief = new MailPackage(mail.getFrom(), mail.getTo(), emptyParcel);
            stolenValue += ((MailPackage) mail).getContent().getPrice();
            return stonesFromThief;
        }
        return mail;
    }

    public static void main(String[] args) {
        MailMessage letter = new MailMessage("Бирьгильда", "Бугульма", "это просто письмо" );
        MailPackage packegeTobeStolen = new MailPackage("Челябинск", "Питер", new Package("Diamods", 2000));
        MailPackage packegeBelowThiefPrice = new MailPackage("Челябинск", "Питер", new Package("coins", 25));
        Thief thief = new Thief(50);
        thief.processMail(packegeTobeStolen);
        Sendable afterThief = thief.processMail(packegeBelowThiefPrice);
        if (afterThief instanceof MailPackage) {
            System.out.println("Откуда = " + afterThief.getFrom() + System.lineSeparator() +
                    "Куда = " + afterThief.getTo() + System.lineSeparator() +
                    "Стоимость посылки = " + ((MailPackage) afterThief).getContent().getPrice() + System.lineSeparator() +
                    "Всего вор украл = " + thief.stolenValue);
        }
        else if (afterThief instanceof MailMessage) {
            System.out.println("Откуда = " + afterThief.getFrom() + System.lineSeparator() +
                    "Куда = " + afterThief.getTo() + System.lineSeparator() );
        }
    }





}


