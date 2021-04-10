package dominio;

public class TipoDeMaterial {
    public String PELICULA = "Pelicula";
    public String SERIE = "Serie";
    public String DOCUMENTAL = "Documental";
    public String NOVELA = "novela";
    public String ANIMES = "Anime";

    public String getPELICULA() {
        return PELICULA;
    }

    public String getSERIE() {
        return SERIE;
    }

    public String getDOCUMENTAL() {
        return DOCUMENTAL;
    }

    public String getNOVELA() {
        return NOVELA;
    }

    public String getANIMES() {
        return ANIMES;
    }

    public void setPELICULA(String PELICULA) {
        this.PELICULA = PELICULA;
    }

    public void setSERIE(String SERIE) {
        this.SERIE = SERIE;
    }

    public void setDOCUMENTAL(String DOCUMENTAL) {
        this.DOCUMENTAL = DOCUMENTAL;
    }

    public void setNOVELA(String NOVELA) {
        this.NOVELA = NOVELA;
    }

    public void setANIMES(String ANIMES) {
        this.ANIMES = ANIMES;
    }
}
