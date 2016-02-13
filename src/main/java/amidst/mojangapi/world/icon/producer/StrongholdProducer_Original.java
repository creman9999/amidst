package amidst.mojangapi.world.icon.producer;

import java.util.List;

import amidst.mojangapi.world.biome.Biome;
import amidst.mojangapi.world.oracle.BiomeDataOracle;

public class StrongholdProducer_Original extends StrongholdProducer_Base {
	
	public StrongholdProducer_Original(long seed, BiomeDataOracle biomeDataOracle, List<Biome> validBiomes) {
		super(seed, biomeDataOracle, validBiomes);
	}
}
