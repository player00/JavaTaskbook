package Other.Exceptions.L3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Mail {

    public static final Logger LOGGER = Logger.getLogger(Mail.class.getName());

    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    public static interface Sendable {
        String getFrom();

        String getTo();
    }

    public static abstract class AbstractSendable implements Sendable {

        protected final String from;
        protected final String to;

        public AbstractSendable(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String getFrom() {
            return from;
        }

        @Override
        public String getTo() {
            return to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AbstractSendable that = (AbstractSendable) o;

            if (!from.equals(that.from)) return false;
            if (!to.equals(that.to)) return false;

            return true;
        }

    }

    public static class MailMessage extends AbstractSendable {

        private final String message;

        public MailMessage(String from, String to, String message) {
            super(from, to);
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailMessage that = (MailMessage) o;

            if (message != null ? !message.equals(that.message) : that.message != null) return false;

            return true;
        }

    }

    public static class MailPackage extends AbstractSendable {
        private final Package content;

        public MailPackage(String from, String to, Package content) {
            super(from, to);
            this.content = content;
        }

        public Package getContent() {
            return content;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailPackage that = (MailPackage) o;

            if (!content.equals(that.content)) return false;

            return true;
        }

    }

    public static class Package {
        private final String content;
        private final int price;

        public Package(String content, int price) {
            this.content = content;
            this.price = price;
        }

        public String getContent() {
            return content;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Package aPackage = (Package) o;

            if (price != aPackage.price) return false;
            if (!content.equals(aPackage.content)) return false;

            return true;
        }
    }

    public static interface MailService {
        Sendable processMail(Sendable mail);
    }

    public static class RealMailService implements MailService {

        @Override
        public Sendable processMail(Sendable mail) {
            // Здесь описан код настоящей системы отправки почты.
            return mail;
        }
    }

    public static void main(String[] args) {
        MailMessage mailMassage1 = new MailMessage(AUSTIN_POWERS, "Foo", "Сообщение 1");
        MailMessage mailMassage2 = new MailMessage("Foo", "Bar", "Сообщение 2");
        Package pack1 = new Package("Gold1", 100);
        Package pack2 = new Package("Gold2", 60);
        Package pack3 = new Package("Gold3", 0);
        MailPackage mailPackage1 = new MailPackage(AUSTIN_POWERS, "Foo", pack1);
        MailPackage mailPackage2 = new MailPackage("Foo", "Bar", pack2);
        MailPackage mailPackage3 = new MailPackage("Foo", "Bar", pack3);

        Spy spy = new Spy(LOGGER);
        Thief thief = new Thief(50);
        Inspector inspector = new Inspector();
        UntrustworthyMailWorker untrustworthyMailWorker = new UntrustworthyMailWorker(new MailService[]{spy, /*thief,*/ inspector});

//        mailMassage1 = (MailMessage) spy.processMail(mailMassage1);
//        mailMassage2 = (MailMessage) spy.processMail(mailMassage2);
        mailPackage1 = (MailPackage) untrustworthyMailWorker.processMail(mailPackage1);
        System.out.printf("content = %s, price = %d\n", mailPackage1.getContent().getContent(), mailPackage1.getContent().getPrice());
        System.out.println(thief.getStolenValue());
//        System.out.println(mailMassage1.getMessage());
//        System.out.println(mailMassage2.getMessage());
//        mailMassage1 = (MailMessage) umw.processMail(mailMassage1);
//        System.out.println(mailMassage1.message);
    }

    public static class UntrustworthyMailWorker implements MailService {
        private MailService[] mailServices;
        private MailService realMailService = new RealMailService();

        public UntrustworthyMailWorker(MailService[] mailServices) {
            this.mailServices = mailServices;
        }

        public MailService getRealMailService() {
            return realMailService;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            for (MailService mailService : mailServices) {
                mail = mailService.processMail(mail);
            }

            return getRealMailService().processMail(mail);
        }
    }

    public static class Spy implements MailService {
        private Logger logger;

        public Spy(Logger logger) {
            this.logger = logger;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailMessage) {
                if (mail.getFrom().equals(AUSTIN_POWERS) || mail.getTo().equals(AUSTIN_POWERS)) {
                    logger.log(Level.WARNING,
                            "Detected target mail correspondence: from {0} to {1} \"{2}\"",
                            new Object[]{
                                    mail.getFrom(),
                                    mail.getTo(),
                                    ((MailMessage) mail).getMessage()
                            });
                } else {
                    logger.log(Level.INFO,
                            "Usual correspondence: from {0} to {1}",
                            new Object[]{
                                    mail.getFrom(),
                                    mail.getTo()
                            });
                }
            }

            return mail;
        }
    }

    public static class Thief implements MailService {
        private int price;
        private int stolenValue = 0;

        public Thief(int price) {
            this.price = price;
        }

        public int getStolenValue() {
            return stolenValue;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailPackage && ((MailPackage) mail).getContent().getPrice() >= price) {
                Package pack = ((MailPackage) mail).getContent();
                stolenValue += pack.getPrice();
                return new MailPackage(mail.getFrom(), mail.getTo(), new Package("stones instead of " + pack.getContent(), 0));
            }

            return mail;
        }
    }

    public static class Inspector implements MailService {
        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailPackage) {
                Package pack = ((MailPackage) mail).getContent();
                if (pack.getContent().contains("stones")) {
                    throw new StolenPackageException();
                }
                if (pack.getContent().contains(WEAPONS) || pack.getContent().contains(BANNED_SUBSTANCE)) {
                    throw new IllegalPackageException();
                }
            }

            return mail;
        }
    }

    public static class StolenPackageException extends RuntimeException {
    }

    public static class IllegalPackageException extends RuntimeException {
    }

}
