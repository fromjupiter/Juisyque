package org.jsq;

import lombok.Getter;
import lombok.Setter;
import org.jsq.core.TemporalMatrix;
import org.jsq.exception.JsqInvalidAttributeException;

import java.util.HashMap;
import java.util.Map;

public class MusicSheet {

    @Getter
    @Setter
    public TemporalMatrix score;

    @Getter
    @Setter
    private int octaveOffset;

    @Getter
    @Setter
    private double speedMultiplier;

    @Getter
    @Setter
    private String instrument;

    @Getter
    @Setter
    private int tempo;

    private int timeSignNumerator;
    private int timeSignDenominator;

    @Getter
    private Map<String, String> otherInfo;

    public MusicSheet() {
        otherInfo = new HashMap<>();
        instrument = "Acoustic Grand Piano";
        octaveOffset = 0;
        speedMultiplier = 1;
        timeSignDenominator = 4;
        timeSignNumerator = 4;
        tempo = 120;
    }

    public String getTimeSignature() {
        return "" + timeSignNumerator + "/" + timeSignDenominator;
    }

    public void setTimeSignature(String str) throws JsqInvalidAttributeException {
        try {
            String[] res = str.split("/");
            int numerator = Integer.parseInt(res[0]);
            int denominator = Integer.parseInt(res[1]);

            timeSignNumerator = numerator;
            timeSignDenominator = denominator;
        } catch (Exception ex) {
            throw new JsqInvalidAttributeException(String.format("Invalid time sign [%s]!",str));
        }
    }

}
