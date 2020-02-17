package com.company.controller;
import com.company.model.Client;
import com.company.view.ClientView;

public class ClientController {
    private Client _client;
    private ClientView _clientView;

    public ClientController(Client client, ClientView clientView){
        this._client = client;
        this._clientView = clientView;
    }
    public int getId(){
        return _client.get_id();
    }
    public void setId(int id){
        _client.set_id(id);
    }
    public void updateView() {
        _clientView.printClient(_client.get_id(), _client.get_name());
    }
}
