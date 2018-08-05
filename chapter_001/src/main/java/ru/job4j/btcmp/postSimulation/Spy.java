package ru.job4j.btcmp.postSimulation;

import java.util.logging.*;

public class Spy implements MailService{
    Logger LOGGER;

    public Spy(Logger LOGGER) {
        this.LOGGER = LOGGER;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            String from = mail.getFrom();
            String to = mail.getTo();
            String message = ((MailMessage) mail).getMessage();
            if (from.equals("Austin Powers") || to.equals("Austin Powers")) {
               LOGGER.warning("Detected target mail correspondence: from " + from + " to " + to + " \"" + message + "\"");
            }
            else {
                LOGGER.info("Usual correspondence: from " + from + " to " + to + "");
            }
        }
        return mail;
    }

    public static void main(String[] args) {

            Logger logger = Logger.getLogger(Spy.class.getName());
            ConsoleHandler consoleHandler = new ConsoleHandler();
            logger.addHandler(consoleHandler);

            Spy spy = new Spy(logger);
                logger.info("This is information message: логгер пашет вовсю");


        Sendable letter = new MailMessage("Сысерть", "Арти", "Привет!");
        Sendable spyLetter = new MailMessage("Austin Powers", "USSR", "Привет!");
        spy.processMail(letter);
        spy.processMail(spyLetter);



    }



}






