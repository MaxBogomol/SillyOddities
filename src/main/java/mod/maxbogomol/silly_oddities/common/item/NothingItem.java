package mod.maxbogomol.silly_oddities.common.item;

import mod.maxbogomol.fluffy_fur.client.event.ClientTickHandler;
import mod.maxbogomol.silly_oddities.SillyOdditiesClient;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.TickEvent;

import java.util.ArrayList;
import java.util.List;

public class NothingItem extends SillyOdditiesRenderItem {

    public static List<ItemStack> items = new ArrayList<>();
    public static int itemNumber = 0;

    public NothingItem(Properties properties) {
        super(properties);
    }

    @OnlyIn(Dist.CLIENT)
    public static void clientTick(TickEvent.ClientTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            if (!Minecraft.getInstance().isPaused()) {
                if (!items.isEmpty()) {
                    if (ClientTickHandler.ticksInGame % 20 == 0) {
                        itemNumber = SillyOdditiesClient.random.nextInt(0, items.size());
                    }
                }
            }
        }
    }
}
