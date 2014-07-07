package modularmachines.api.misc;

import net.minecraft.item.Item;

public class PairedMaterial {
	public PairedMaterial(Item item, int meta){
		this.item = item;
		this.meta = meta;
	}
	public Item item;
	public int meta;
}