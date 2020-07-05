package pt.ipg.application.testingcovid_19.object;

public class Choice {
    private long id;
    private String choice;
    private long weight;

    private long fk_question = -1;


    public Choice() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public long getFk_question() {
        return fk_question;
    }

    public void setFk_question(long fk_question) {
        this.fk_question = fk_question;
    }

    public String[] Values(){
        return new String[]{
                id+"", choice, weight+"",
                fk_question+""
        };
    }
}
