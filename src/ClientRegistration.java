public class ClientRegistration {
    public String client_name;
    private int id;
    public String phone_number;
    public String email;

    ClientRegistration(int id, String client_name, String phone_number, String email){
        this.id = id;
        this.client_name = client_name;
        this.phone_number = phone_number;
        this.email = email;
    }

    public void registerClient(){
        System.out.println("Client: '" + id + " " + " " + client_name + " " + phone_number + " " + email + "' is succesfully registered");
    }
}
