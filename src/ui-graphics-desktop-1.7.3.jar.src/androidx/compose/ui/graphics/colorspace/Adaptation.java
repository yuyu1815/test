/*    */ package androidx.compose.ui.graphics.colorspace;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\020\024\n\002\b\005\b&\030\000 \0072\0020\001:\001\007B\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Adaptation;", "", "transform", "", "([F)V", "getTransform$ui_graphics", "()[F", "Companion", "ui-graphics"})
/*    */ public abstract class Adaptation
/*    */ {
/*    */   private Adaptation(float[] transform) {
/* 45 */     this.transform = transform; } @NotNull public final float[] getTransform$ui_graphics() { return this.transform; }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\007\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006¨\006\013"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Adaptation$Companion;", "", "()V", "Bradford", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "getBradford", "()Landroidx/compose/ui/graphics/colorspace/Adaptation;", "Ciecat02", "getCiecat02", "VonKries", "getVonKries", "ui-graphics"})
/*    */   public static final class Companion { private Companion() {}
/*    */     @NotNull
/*    */     public final Adaptation getBradford() {
/* 51 */       return Adaptation.Bradford;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final Adaptation getVonKries() {
/* 64 */       return Adaptation.VonKries;
/*    */     }
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
/*    */     @NotNull
/*    */     public final Adaptation getCiecat02() {
/* 78 */       return Adaptation.Ciecat02; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final float[] transform; @NotNull private static final Adaptation Bradford; static { float[] arrayOfFloat2 = new float[9]; arrayOfFloat2[0] = 0.8951F; arrayOfFloat2[1] = -0.7502F; arrayOfFloat2[2] = 0.0389F; arrayOfFloat2[3] = 0.2664F; arrayOfFloat2[4] = 1.7135F; arrayOfFloat2[5] = -0.0685F; arrayOfFloat2[6] = -0.1614F; arrayOfFloat2[7] = 0.0367F; arrayOfFloat2[8] = 1.0296F; float[] arrayOfFloat1 = arrayOfFloat2; Bradford = new Adaptation$Companion$Bradford$1(arrayOfFloat1); arrayOfFloat2 = new float[9]; arrayOfFloat2[0] = 0.40024F; arrayOfFloat2[1] = -0.2263F; arrayOfFloat2[2] = 0.0F; arrayOfFloat2[3] = 0.7076F; arrayOfFloat2[4] = 1.16532F; arrayOfFloat2[5] = 0.0F; arrayOfFloat2[6] = -0.08081F; arrayOfFloat2[7] = 0.0457F; arrayOfFloat2[8] = 0.91822F; arrayOfFloat1 = arrayOfFloat2;
/*    */     VonKries = new Adaptation$Companion$VonKries$1(arrayOfFloat1);
/* 80 */     arrayOfFloat2 = new float[9]; arrayOfFloat2[0] = 0.7328F; arrayOfFloat2[1] = -0.7036F; arrayOfFloat2[2] = 0.003F; arrayOfFloat2[3] = 
/* 81 */       0.4296F; arrayOfFloat2[4] = 1.6975F; arrayOfFloat2[5] = 0.0136F;
/* 82 */     arrayOfFloat2[6] = -0.1624F; arrayOfFloat2[7] = 0.0061F; arrayOfFloat2[8] = 0.9834F; arrayOfFloat1 = arrayOfFloat2; Ciecat02 = new Adaptation$Companion$Ciecat02$1(arrayOfFloat1); } @NotNull private static final Adaptation VonKries; @NotNull private static final Adaptation Ciecat02; @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"androidx/compose/ui/graphics/colorspace/Adaptation$Companion$Bradford$1", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "toString", "", "ui-graphics"}) public static final class Adaptation$Companion$Bradford$1 extends Adaptation {
/*    */     Adaptation$Companion$Bradford$1(float[] $super_call_param$1) { super($super_call_param$1, null); } @NotNull public String toString() { return "Bradford"; } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"androidx/compose/ui/graphics/colorspace/Adaptation$Companion$VonKries$1", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "toString", "", "ui-graphics"}) public static final class Adaptation$Companion$VonKries$1 extends Adaptation {
/*    */     Adaptation$Companion$VonKries$1(float[] $super_call_param$1) { super($super_call_param$1, null); } @NotNull public String toString() { return "VonKries"; } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"androidx/compose/ui/graphics/colorspace/Adaptation$Companion$Ciecat02$1", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "toString", "", "ui-graphics"}) public static final class Adaptation$Companion$Ciecat02$1 extends Adaptation {
/* 85 */     Adaptation$Companion$Ciecat02$1(float[] $super_call_param$1) { super($super_call_param$1, null); } @NotNull public String toString() { return "Ciecat02"; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\colorspace\Adaptation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */