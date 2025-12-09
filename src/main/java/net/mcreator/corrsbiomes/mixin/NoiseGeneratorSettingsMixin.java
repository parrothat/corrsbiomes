package net.mcreator.corrsbiomes.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.corrsbiomes.init.CorrsbiomesModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements CorrsbiomesModBiomes.CorrsbiomesModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> corrsbiomes_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.corrsbiomes_dimensionTypeReference != null) {
			retval = CorrsbiomesModBiomes.adaptSurfaceRule(retval, this.corrsbiomes_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setcorrsbiomesDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.corrsbiomes_dimensionTypeReference = dimensionType;
	}
}