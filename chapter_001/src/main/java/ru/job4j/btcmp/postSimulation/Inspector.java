package ru.job4j.btcmp.postSimulation;

public class Inspector implements MailService{
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            String parcelContent = ((MailPackage) mail).getContent().getContent();
            if (parcelContent.contains("weapons") || parcelContent.contains("banned substance")) {
                throw new IllegalPackageException("weapons or drugs!!! STOP!");
            }
            else if (parcelContent.contains("stones")) {
                throw new StolenPackageException("Parcel stolen!");
            }
        }
        return mail;
    }

    public static void main(String[] args) {
        Sendable weapons = new MailPackage("Джанкой", "Зеленый Гай", new Package("weapons and knifes", 11));
        Sendable drugs = new MailPackage("Шуранкуль", "Зеленый Гай", new Package("banned substance and drugs", 15));
        Sendable stones = new MailPackage("Сысерть", "Арти", new Package("stones", 15));
        Sendable oleina = new MailPackage("Джанкой", "Зеленый Гай", new Package("milk, nut and oleina", 11));
        Sendable letter = new MailMessage("Сысерть", "Арти", "Привет!");

        Inspector inspector = new Inspector();
        Sendable incpectedmail = inspector.processMail(stones);

    }


}
