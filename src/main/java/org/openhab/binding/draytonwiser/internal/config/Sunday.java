
package org.openhab.binding.draytonwiser.internal.config;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sunday {

    @SerializedName("SetPoints")
    @Expose
    private List<SetPoint______> setPoints = null;

    public List<SetPoint______> getSetPoints() {
        return setPoints;
    }

    public void setSetPoints(List<SetPoint______> setPoints) {
        this.setPoints = setPoints;
    }

}
