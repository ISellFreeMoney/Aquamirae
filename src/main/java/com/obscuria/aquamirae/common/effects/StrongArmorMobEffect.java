
package com.obscuria.aquamirae.common.effects;

import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

public class StrongArmorMobEffect extends Effect {
	public StrongArmorMobEffect() {
		super(EffectType.BENEFICIAL, -3407668);
		addAttributeModifier(Attributes.ARMOR, "5D6F0BA2-1286-46AC-B896-C61C5CAE91CC", 0.25D, AttributeModifier.Operation.MULTIPLY_BASE);
		addAttributeModifier(Attributes.ARMOR_TOUGHNESS, "5D6F0BA2-1286-46AC-B896-C61C5CAE92CC", 4D, AttributeModifier.Operation.ADDITION);
	}

	@Override
	public String getDescriptionId() {
		return "effect.aquamirae.strong_armor";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
