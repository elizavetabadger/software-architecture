package homework4;
import java.util.List;
import java.util.Objects;

public class sUser {

    private long id;
    private String userName;
    private List<Ticket> tickets;
    private String login;
    private long hashcodePassword;
    private long idAcc;

    public sUser(long id, String userName, List<Ticket> tickets, String login, long hashPassword,  long idAcc) {
        this.id = id;
        this.userName = userName;
        this.tickets = tickets;
        this.login = login;
        this.hashcodePassword = hashPassword;
        this.idAcc = idAcc;
    }


    public long getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }
    public List<Ticket> getTickets() {
        return tickets;
    }
    public String getLogin() {
        return login;
    }
    public long getHashcodePassword() {
        return hashcodePassword;
    }


    public long getIdAcc() {
        return idAcc;
    }

    @Override
    public String toString() {
        return "Client { " +
                "id= " + id +
                ", userName= " + userName +
                ", login= " + login +
                ", idAccount= " + (String.format("%016d", idAcc)) +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        sUser client = (sUser) o;
        return this.equals(client);
    }


    public boolean equals(sUser client) {
        return id == client.id && hashcodePassword == client.hashcodePassword && idAcc == client.idAcc && userName.equals(client.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, hashcodePassword, idAcc);
    }


}