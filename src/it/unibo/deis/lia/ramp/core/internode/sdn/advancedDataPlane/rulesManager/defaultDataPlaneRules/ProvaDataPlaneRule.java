package it.unibo.deis.lia.ramp.core.internode.sdn.advancedDataPlane.rulesManager.defaultDataPlaneRules;

import it.unibo.deis.lia.ramp.core.e2e.BroadcastPacket;
import it.unibo.deis.lia.ramp.core.e2e.UnicastHeader;
import it.unibo.deis.lia.ramp.core.e2e.UnicastPacket;
import it.unibo.deis.lia.ramp.core.internode.sdn.advancedDataPlane.rulesManager.AbstractDataPlaneRule;

import java.io.Serializable;

/**
 * @author Matteo Mendula
 *
 *
 */
public class ProvaDataPlaneRule extends AbstractDataPlaneRule implements Serializable {

    private static final long serialVersionUID = -2446589988154936840L;

    public ProvaDataPlaneRule() {
    }

    @Override
    public void applyRuleToUnicastHeader(UnicastHeader uh) {
        long dataTypeId = uh.getDataType();
        System.out.println("ProvaDataPlaneRule: dataTypeId: " + dataTypeId);
    }

    @Override
    public void applyRuleToUnicastPacket(UnicastPacket up) {
        long dataTypeId = up.getHeader().getDataType();
        System.out.println("ProvaDataPlaneRule: dataTypeId: " + dataTypeId);
    }

    @Override
    public void applyRuleToBroadcastPacket(BroadcastPacket bp) {
        long dataTypeId = bp.getDataType();
        System.out.println("ProvaDataPlaneRule: dataTypeId: " + dataTypeId);
    }
}
