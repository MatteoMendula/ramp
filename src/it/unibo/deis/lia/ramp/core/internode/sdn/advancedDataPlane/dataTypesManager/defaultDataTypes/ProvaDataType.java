package it.unibo.deis.lia.ramp.core.internode.sdn.advancedDataPlane.dataTypesManager.defaultDataTypes;

import it.unibo.deis.lia.ramp.core.internode.sdn.advancedDataPlane.dataTypesManager.AbstractDataType;

import java.io.Serializable;

/**
 * @author Matteo Mendula
 */
public class ProvaDataType extends AbstractDataType implements Serializable {

    private static final long serialVersionUID = 7332943357871452826L;

    public ProvaDataType() {
        super();
    }

    public ProvaDataType(int seqNumber, int payloadSize) {
        super(seqNumber, payloadSize);
    }
}
