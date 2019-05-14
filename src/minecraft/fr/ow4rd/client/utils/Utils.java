package fr.ow4rd.client.utils;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;

public class Utils {
	
	public static void drawImage(int x, int y, int width, int height, ResourceLocation loc) {

        Tessellator tess = Tessellator.instance;
        Minecraft.getMinecraft().getTextureManager().bindTexture(loc);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        tess.startDrawingQuads();
        tess.addVertexWithUV(x, y, 0.0F, 1.0D, 0.0D);
        tess.addVertexWithUV(x, y + height, 0.0F, 1.0D, 1.0D);
        tess.addVertexWithUV(x + width, y + height, 0.0F, 0.0D, 1.0D);
        tess.addVertexWithUV(x + width, y, 0.0F, 0.0D, 0.0D);
        tess.draw();
    }
}