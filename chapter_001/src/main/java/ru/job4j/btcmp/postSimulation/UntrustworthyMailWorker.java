package ru.job4j.btcmp.postSimulation;

public class UntrustworthyMailWorker implements MailService{
    MailService[] mailServices;
    RealMailService realMailService = new RealMailService();

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable processedMail = mail;
        for (int i = 0; i < mailServices.length; i++) {
            processedMail = mailServices[i].processMail(processedMail);
        }
        return realMailService.processMail(processedMail);
    }

    RealMailService getRealMailService() {

        return realMailService;
    }

}
