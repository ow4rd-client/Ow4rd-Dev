package fr.ow4rd.client.button;

import java.awt.Color;

import org.lwjgl.opengl.GL11;

import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.ResourceLocation;

public class ButtonMainMenu extends GuiButton
{
    protected static final ResourceLocation button;
    public int field_146120_f;
    public int field_146121_g;
    public int field_146128_h;
    public int field_146129_i;
    public String field_146126_j;
    public int field_146127_k;
    public boolean field_146124_l;
    public boolean field_146125_m;
    protected boolean field_146123_n;
    public int packedFGColour;
    
    static {
        button = new ResourceLocation("textures/ow4rd/gui/options.png");
    }
    
    public ButtonMainMenu(final int p_i1020_1_, final int p_i1020_2_, final int p_i1020_3_, final String p_i1020_4_) {
        this(p_i1020_1_, p_i1020_2_, p_i1020_3_, 200, 20, p_i1020_4_);
    }
    
    public ButtonMainMenu(final int p_i1021_1_, final int p_i1021_2_, final int p_i1021_3_, final int p_i1021_4_, final int p_i1021_5_, final String p_i1021_6_) {
        super(p_i1021_1_, p_i1021_2_, p_i1021_3_, p_i1021_4_, p_i1021_5_, p_i1021_6_);
        this.field_146120_f = 200;
        this.field_146121_g = 20;
        this.field_146124_l = true;
        this.field_146125_m = true;
        this.field_146127_k = p_i1021_1_;
        this.field_146128_h = p_i1021_2_;
        this.field_146129_i = p_i1021_3_;
        this.field_146120_f = p_i1021_4_;
        this.field_146121_g = p_i1021_5_;
        this.field_146126_j = p_i1021_6_;
    }
    
    public int func_146114_a(final boolean p_146114_1_) {
        byte b0 = 1;
        if (!this.field_146124_l) {
            b0 = 0;
        }
        else if (p_146114_1_) {
            b0 = 2;
        }
        return b0;
    }
    
    @Override
    public void drawButton(final Minecraft p_146112_1_, final int p_146112_2_, final int p_146112_3_) {
        if (this.field_146125_m) {
            final FontRenderer fontrenderer = p_146112_1_.fontRenderer;
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.field_146123_n = (p_146112_2_ >= this.field_146128_h && p_146112_3_ >= this.field_146129_i && p_146112_2_ < this.field_146128_h + this.field_146120_f && p_146112_3_ < this.field_146129_i + this.field_146121_g);
            final int k = this.func_146114_a(this.field_146123_n);
            GL11.glEnable(3042);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            GL11.glBlendFunc(770, 771);
            
            drawRect(this.field_146128_h, this.field_146129_i, this.field_146128_h + this.field_146120_f , this.field_146129_i + 20, new Color(0, 0, 0, 75).getRGB());
            
        //    drawTexturedModalRect(this.field_146128_h, this.field_146129_i, 0, 46 + k * 20, this.field_146120_f / 2, this.field_146121_g);
          //  drawTexturedModalRect(this.field_146128_h + this.field_146120_f / 2, this.field_146129_i, 200 - this.field_146120_f, 46 + k * 20, this.field_146120_f / 2, this.field_146121_g);
            this.func_146119_b(p_146112_1_, p_146112_2_, p_146112_3_);
            int l = 14737632;
            if (this.packedFGColour != 0) {
                l = this.packedFGColour;
            }
            else if (!this.field_146124_l) {
                l = 10526880;
            }
            else if (this.field_146123_n) {
                drawRect(this.field_146128_h, this.field_146129_i, this.field_146128_h - 2 , this.field_146129_i + 20, new Color(213, 0, 0, 125).getRGB());
                drawRect(this.field_146128_h, this.field_146129_i, this.field_146128_h + this.field_146120_f , this.field_146129_i + 20, new Color(255, 255, 255, 125).getRGB());
                this.drawCenteredString(fontrenderer, ChatFormatting.WHITE + this.field_146126_j, this.field_146128_h + this.field_146120_f / 2, this.field_146129_i + (this.field_146121_g - 8) / 2, l);
            }
            else {
                this.drawCenteredString(fontrenderer, ChatFormatting.GRAY + this.field_146126_j, this.field_146128_h + this.field_146120_f / 2, this.field_146129_i + (this.field_146121_g - 8) / 2, l);
            }
        }
    }
    
    protected void func_146119_b(final Minecraft p_146119_1_, final int p_146119_2_, final int p_146119_3_) {
    }
    
    public void func_146118_a(final int p_146118_1_, final int p_146118_2_) {
    }
    
    public boolean func_146116_c(final Minecraft p_146116_1_, final int p_146116_2_, final int p_146116_3_) {
        return this.field_146124_l && this.field_146125_m && p_146116_2_ >= this.field_146128_h && p_146116_3_ >= this.field_146129_i && p_146116_2_ < this.field_146128_h + this.field_146120_f && p_146116_3_ < this.field_146129_i + this.field_146121_g;
    }
    
    @Override
    public boolean func_146115_a() {
        return this.field_146123_n;
    }
    
    @Override
    public void func_146111_b(final int p_146111_1_, final int p_146111_2_) {
    }
    
    @Override
    public void func_146113_a(final SoundHandler p_146113_1_) {
        p_146113_1_.playSound(PositionedSoundRecord.func_147674_a(new ResourceLocation("gui.button.press"), 1.0f));
    }
    
    @Override
    public int func_146117_b() {
        return this.field_146120_f;
    }
    
    @Override
    public int func_154310_c() {
        return this.field_146121_g;
    }
}
