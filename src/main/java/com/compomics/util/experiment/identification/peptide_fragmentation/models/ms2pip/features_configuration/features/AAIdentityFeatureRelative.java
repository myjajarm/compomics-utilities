package com.compomics.util.experiment.identification.peptide_fragmentation.models.ms2pip.features_configuration.features;

/**
 * An amino acid identity feature at a position relative to the end of an ion on the peptide sequence. In this feature, an index of 0 represents the last amino acid of the ion.
 *
 * @author Marc Vaudel
 */
public class AAIdentityFeatureRelative extends AAIdentityFeature {

    /**
     * Constructor. An index of 0 represents the last amino acid of the ion.
     * 
     * @param index the index
     * @param aminoAcid the amino acid targeted
     */
    public AAIdentityFeatureRelative(int index, char aminoAcid) {
        this.index = index;
        this.aminoAcid = aminoAcid;
    }
    
    @Override
    public String getCategory() {
        return this.getClass().getName();
    }

    @Override
    public String getDescription() {
        if (index == 0) {
            return aminoAcid + " as last amino acid of the ion";
        } else {
            String sign = "";
            if (index >= 0) {
                sign = "+";
            }
            return aminoAcid + " as amino acid at the end of the ion " + sign + index;
        }
    }

}
