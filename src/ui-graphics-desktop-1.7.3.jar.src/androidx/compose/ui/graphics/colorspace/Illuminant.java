/*    */ package androidx.compose.ui.graphics.colorspace;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\t\n\002\020\024\n\002\b\r\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006R\024\020\r\032\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\021\020\021\032\0020\004¢\006\b\n\000\032\004\b\022\020\006R\021\020\023\032\0020\004¢\006\b\n\000\032\004\b\024\020\006R\021\020\025\032\0020\004¢\006\b\n\000\032\004\b\026\020\006R\021\020\027\032\0020\004¢\006\b\n\000\032\004\b\030\020\006R\021\020\031\032\0020\004¢\006\b\n\000\032\004\b\032\020\006¨\006\033"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Illuminant;", "", "()V", "A", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getA", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "B", "getB", "C", "getC", "D50", "getD50", "D50Xyz", "", "getD50Xyz$ui_graphics", "()[F", "D55", "getD55", "D60", "getD60", "D65", "getD65", "D75", "getD75", "E", "getE", "ui-graphics"})
/*    */ public final class Illuminant
/*    */ {
/*    */   @NotNull
/* 27 */   public static final Illuminant INSTANCE = new Illuminant(); @NotNull private static final WhitePoint A = new WhitePoint(0.44757F, 0.40745F); @NotNull public final WhitePoint getA() { return A; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/* 33 */   private static final WhitePoint B = new WhitePoint(0.34842F, 0.35161F); @NotNull public final WhitePoint getB() { return B; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/* 39 */   private static final WhitePoint C = new WhitePoint(0.31006F, 0.31616F); @NotNull public final WhitePoint getC() { return C; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/* 46 */   private static final WhitePoint D50 = new WhitePoint(0.34567F, 0.3585F); @NotNull public final WhitePoint getD50() { return D50; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/* 52 */   private static final WhitePoint D55 = new WhitePoint(0.33242F, 0.34743F); @NotNull public final WhitePoint getD55() { return D55; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/* 58 */   private static final WhitePoint D60 = new WhitePoint(0.32168F, 0.33767F); @NotNull public final WhitePoint getD60() { return D60; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/* 65 */   private static final WhitePoint D65 = new WhitePoint(0.31271F, 0.32902F); @NotNull public final WhitePoint getD65() { return D65; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/* 71 */   private static final WhitePoint D75 = new WhitePoint(0.29902F, 0.31485F); @NotNull public final WhitePoint getD75() { return D75; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   private static final float[] D50Xyz;
/*    */   @NotNull
/* 77 */   private static final WhitePoint E = new WhitePoint(0.33333F, 0.33333F); @NotNull public final WhitePoint getE() { return E; }
/*    */   @NotNull
/* 79 */   public final float[] getD50Xyz$ui_graphics() { return D50Xyz; } static { float[] arrayOfFloat = new float[3]; arrayOfFloat[0] = 0.964212F; arrayOfFloat[1] = 1.0F; arrayOfFloat[2] = 0.825188F; D50Xyz = arrayOfFloat; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\colorspace\Illuminant.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */