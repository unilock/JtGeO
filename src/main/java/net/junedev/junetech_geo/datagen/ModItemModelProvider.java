package net.junedev.junetech_geo.datagen;

import net.junedev.junetech_geo.junetech_geo;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, junetech_geo.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
     //   simpleItem(ModItems.ADOBE_BRICK);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(junetech_geo.MOD_ID,"item/" + item.getId().getPath()));
    }
}