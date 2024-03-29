package net.ecocraft.ecoterra.server.block.entity.table;

import net.ecocraft.ecocore.server.block.entity.TableBlockEntity;
import net.ecocraft.ecoterra.server.container.AnvilContainer;
import net.ecocraft.ecoterra.client.gui.table.AnvilGUI;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class AnvilBlockEntity extends TableBlockEntity {
    public AnvilBlockEntity() {
        super(2 + 9 + 1);
    }

    public Container getContainer(int guiMeta, EntityPlayer player, World world, TileEntity te, int x, int y, int z) {
        return new AnvilContainer((AnvilBlockEntity) te, player);
    }

    public Gui getGui(int guiMeta, EntityPlayer player, World world, TileEntity te, int x, int y, int z) {
        return new AnvilGUI((AnvilBlockEntity) te, player);
    }
}
