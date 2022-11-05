package atomicstryker.ruins.common;

public class RuinStats
{

    public int NumCreated = 0, siteTries = 0, BadBlockFails = 0, LevelingFails = 0, CutInFails = 0, OverhangFails = 0, NoAirAboveFails = 0;

    public int[] biomes = new int[(RuinsMod.BIOME_NONE + 1)];

    public int minDistFails = 0;
}