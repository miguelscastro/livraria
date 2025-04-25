package model;

import java.util.Date;

public class Autor {
    private int id;
    private String nome;
    private Date dataAdicao;

    public Autor(int id, String nome, Date dataAdicao) {
        this.id = id;
        this.nome = nome;
        this.dataAdicao = dataAdicao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getdataAdicao() {
        return dataAdicao;
    }

    public void setdataAdicao(Date dataAdicao) {
        this.dataAdicao = dataAdicao;
    }

}
