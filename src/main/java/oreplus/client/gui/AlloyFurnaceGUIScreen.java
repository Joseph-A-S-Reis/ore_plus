package oreplus.client.gui;

import oreplus.world.inventory.AlloyFurnaceGUIMenu;

import oreplus.init.OrePlusModScreens;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import com.mojang.blaze3d.systems.RenderSystem;

public class AlloyFurnaceGUIScreen extends AbstractContainerScreen<AlloyFurnaceGUIMenu> implements OrePlusModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;

	public AlloyFurnaceGUIScreen(AlloyFurnaceGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 210;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("ore_plus:textures/screens/alloy_furnace_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(ResourceLocation.parse("ore_plus:textures/screens/ingot_frame.png"), this.leftPos + 78, this.topPos + 74, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(ResourceLocation.parse("ore_plus:textures/screens/cube_frame.png"), this.leftPos + 33, this.topPos + 74, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(ResourceLocation.parse("ore_plus:textures/screens/diamond_frame.png"), this.leftPos + 123, this.topPos + 74, 0, 0, 16, 16, 16, 16);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.ore_plus.alloy_furnace_gui.label_alloy_furnace"), 5, 4, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ore_plus.alloy_furnace_gui.label_dust"), 31, 17, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ore_plus.alloy_furnace_gui.label_ingot"), 75, 17, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ore_plus.alloy_furnace_gui.label_gem"), 124, 18, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
	}
}