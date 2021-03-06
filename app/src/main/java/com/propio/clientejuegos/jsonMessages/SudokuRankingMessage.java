package com.propio.clientejuegos.jsonMessages;

/**
 * Created by JoseAntonio on 05/05/2016.
 */
import org.json.JSONException;
import org.json.JSONObject;
import edu.uclm.esi.common.jsonMessages.JSONMessage;
import edu.uclm.esi.common.jsonMessages.JSONable;

public class SudokuRankingMessage extends JSONMessage{
    @JSONable
    String rankings;

    public SudokuRankingMessage(String r) {
        super(false);
        this.rankings = r;
    }

    public SudokuRankingMessage (JSONObject jso) throws JSONException {
        this(jso.getString("rankings"));
    }

    public String getMensaje(){
        return this.rankings;
    }
}
