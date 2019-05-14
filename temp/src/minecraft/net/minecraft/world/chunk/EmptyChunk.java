package net.minecraft.world.chunk;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

public class EmptyChunk extends Chunk {

   private static final String __OBFID = "CL_00000372";


   public EmptyChunk(World p_i1994_1_, int p_i1994_2_, int p_i1994_3_) {
      super(p_i1994_1_, p_i1994_2_, p_i1994_3_);
   }

   public boolean func_76600_a(int p_76600_1_, int p_76600_2_) {
      return p_76600_1_ == this.field_76635_g && p_76600_2_ == this.field_76647_h;
   }

   public int func_76611_b(int p_76611_1_, int p_76611_2_) {
      return 0;
   }

   public void func_76590_a() {}

   public void func_76603_b() {}

   public Block func_150810_a(int p_150810_1_, int p_150810_2_, int p_150810_3_) {
      return Blocks.field_150350_a;
   }

   public int func_150808_b(int p_150808_1_, int p_150808_2_, int p_150808_3_) {
      return 255;
   }

   public boolean func_150807_a(int p_150807_1_, int p_150807_2_, int p_150807_3_, Block p_150807_4_, int p_150807_5_) {
      return true;
   }

   public int func_76628_c(int p_76628_1_, int p_76628_2_, int p_76628_3_) {
      return 0;
   }

   public boolean func_76589_b(int p_76589_1_, int p_76589_2_, int p_76589_3_, int p_76589_4_) {
      return false;
   }

   public int func_76614_a(EnumSkyBlock p_76614_1_, int p_76614_2_, int p_76614_3_, int p_76614_4_) {
      return 0;
   }

   public void func_76633_a(EnumSkyBlock p_76633_1_, int p_76633_2_, int p_76633_3_, int p_76633_4_, int p_76633_5_) {}

   public int func_76629_c(int p_76629_1_, int p_76629_2_, int p_76629_3_, int p_76629_4_) {
      return 0;
   }

   public void func_76612_a(Entity p_76612_1_) {}

   public void func_76622_b(Entity p_76622_1_) {}

   public void func_76608_a(Entity p_76608_1_, int p_76608_2_) {}

   public boolean func_76619_d(int p_76619_1_, int p_76619_2_, int p_76619_3_) {
      return false;
   }

   public TileEntity func_150806_e(int p_150806_1_, int p_150806_2_, int p_150806_3_) {
      return null;
   }

   public void func_150813_a(TileEntity p_150813_1_) {}

   public void func_150812_a(int p_150812_1_, int p_150812_2_, int p_150812_3_, TileEntity p_150812_4_) {}

   public void func_150805_f(int p_150805_1_, int p_150805_2_, int p_150805_3_) {}

   public void func_76631_c() {}

   public void func_76623_d() {}

   public void func_76630_e() {}

   public void func_76588_a(Entity p_76588_1_, AxisAlignedBB p_76588_2_, List p_76588_3_, IEntitySelector p_76588_4_) {}

   public void func_76618_a(Class p_76618_1_, AxisAlignedBB p_76618_2_, List p_76618_3_, IEntitySelector p_76618_4_) {}

   public boolean func_76601_a(boolean p_76601_1_) {
      return false;
   }

   public Random func_76617_a(long p_76617_1_) {
      return new Random(this.field_76637_e.func_72905_C() + (long)(this.field_76635_g * this.field_76635_g * 4987142) + (long)(this.field_76635_g * 5947611) + (long)(this.field_76647_h * this.field_76647_h) * 4392871L + (long)(this.field_76647_h * 389711) ^ p_76617_1_);
   }

   public boolean func_76621_g() {
      return true;
   }

   public boolean func_76606_c(int p_76606_1_, int p_76606_2_) {
      return true;
   }
}
