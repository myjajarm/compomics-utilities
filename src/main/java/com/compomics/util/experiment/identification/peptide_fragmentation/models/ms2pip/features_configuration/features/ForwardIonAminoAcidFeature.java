package com.compomics.util.experiment.identification.peptide_fragmentation.models.ms2pip.features_configuration.features;

import com.compomics.util.experiment.identification.peptide_fragmentation.models.ms2pip.features_configuration.features.generic.AASequenceFeature;
import com.compomics.util.experiment.biology.AminoAcid;

/**
 * Feature based on the amino acid properties of the forward ion.
 *
 * @author Marc Vaudel
 */
public class ForwardIonAminoAcidFeature extends AASequenceFeature {

    /**
     * The index of this ms2pip feature.
     */
    public static final int index = 4;
    /**
     * Constructor.
     *
     * @param aminoAcidProperty the amino acid property to consider
     * @param function the function used to compare the amino acid properties
     */
    public ForwardIonAminoAcidFeature(AminoAcid.Property aminoAcidProperty, AASequenceFeature.Function function) {
        this.aminoAcidProperty = aminoAcidProperty;
        this.function = function;
    }

    @Override
    public String getCategory() {
        return this.getClass().getName();
    }

    @Override
    public String getDescription() {
        return function.name() + " of the " + aminoAcidProperty.name + " of the amino acids of the forward ion.";
    }

    @Override
    public int getIndex() {
        return index;
    }
}
