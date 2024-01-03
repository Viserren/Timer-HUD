package net.bopbopstudios.timer_hud.commands;

import com.mojang.brigadier.context.CommandContext;
import net.minecraft.entity.Entity;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;

public class HelpCommand {
    public HelpCommand(CommandContext<ServerCommandSource> context) {
        // Get the source. This will always work.
        final ServerCommandSource source = context.getSource();
        // Unchecked, may be null if the sender was the console or the command block.
        final @Nullable Entity sender = source.getEntity();
        assert sender != null;
        sender.sendMessage(Text.literal("Help"));
        //source.sendFeedback(() -> Text.literal("Help"), false);
    }
}
