package net.junedev.junetech_geo.datagen.provider;

import net.junedev.junetech_geo.JunetechGeo;
import net.junedev.junetech_geo.block.ModBlocks;
import net.junedev.junetech_geo.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, JunetechGeo.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        // TODO: Add appropiate blocks to tags below
        //this.tag(ModTags.Blocks.caso4).add();
        //this.tag(ModTags.Blocks.fe2o3).add();
        //this.tag(ModTags.Blocks.hornblende).add();
        //this.tag(ModTags.Blocks.kcl).add();
        //this.tag(ModTags.Blocks.kclnacl).add();
        //this.tag(ModTags.Blocks.kspar).add();
        //this.tag(ModTags.Blocks.nacl).add();
        //this.tag(ModTags.Blocks.olivine).add();
        //this.tag(ModTags.Blocks.pspar).add();
        //this.tag(ModTags.Blocks.sio2).add();

        this.tag(ModTags.Blocks.SEDIMENTARY)
                .add(ModBlocks.LIMESTONE.get(),
                        ModBlocks.LIMESTONE_BLACK.get(),
                        ModBlocks.LIMESTONE_FOSSILIFEROUS.get(),
                        ModBlocks.LIMESTONE_COQUINA.get(),
                        ModBlocks.CHALK.get(),
                        ModBlocks.CHERT.get(),
                        ModBlocks.MUDSTONE.get(),
                        ModBlocks.SILTSTONE.get(),
                        ModBlocks.SHALE.get(),
                        ModBlocks.SHALE_HAKATAI.get(),
                        Blocks.SANDSTONE,
                        Blocks.RED_SANDSTONE,
                        ModBlocks.BRECCIA.get());

        this.tag(ModTags.Blocks.METAMORPHIC)
                .add(Blocks.DEEPSLATE,
                        ModBlocks.SCHIST_BLUE.get(),
                        ModBlocks.SCHIST_GREEN.get(),
                        ModBlocks.ANTHRACITE.get(),
                        ModBlocks.GNEISS.get(),
                        ModBlocks.METACONGLOMERATE.get(),
                        ModBlocks.PHYLLITE.get(),
                        ModBlocks.QUARTZITE.get(),
                        ModBlocks.SOAPSTONE.get(),
                        ModBlocks.SERPENTINE.get(),
                        ModBlocks.MARBLE.get());

        this.tag(ModTags.Blocks.IGNEOUS)
                .add(Blocks.ANDESITE,
                    Blocks.GRANITE,
                    Blocks.DIORITE,
                    Blocks.TUFF,
                    Blocks.BASALT,
                    Blocks.OBSIDIAN,
                    Blocks.SMOOTH_BASALT,
                    ModBlocks.RHYOLITE.get());
    }
}