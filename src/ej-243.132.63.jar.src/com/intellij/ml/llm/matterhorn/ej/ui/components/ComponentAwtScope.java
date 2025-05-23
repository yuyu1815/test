/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.ui.unit.Density;
/*    */ import java.awt.Rectangle;
/*    */ import javax.swing.JComponent;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\t\b\007\030\0002\0020\001B!\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\004\b\b\020\tR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/components/ComponentAwtScope;", "", "density", "Landroidx/compose/ui/unit/Density;", "component", "Ljavax/swing/JComponent;", "bounds", "Ljava/awt/Rectangle;", "<init>", "(Landroidx/compose/ui/unit/Density;Ljavax/swing/JComponent;Ljava/awt/Rectangle;)V", "getDensity$ej_ui", "()Landroidx/compose/ui/unit/Density;", "getComponent", "()Ljavax/swing/JComponent;", "getBounds", "()Ljava/awt/Rectangle;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class ComponentAwtScope
/*    */ {
/*    */   @NotNull
/*    */   private final Density density;
/*    */   @NotNull
/*    */   private final JComponent component;
/*    */   @NotNull
/*    */   private final Rectangle bounds;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public ComponentAwtScope(@NotNull Density density, @NotNull JComponent component, @NotNull Rectangle bounds) {
/* 45 */     this.density = density;
/* 46 */     this.component = component;
/* 47 */     this.bounds = bounds; } @NotNull public final Rectangle getBounds() { return this.bounds; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Density getDensity$ej_ui() {
/*    */     return this.density;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final JComponent getComponent() {
/*    */     return this.component;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\ComponentAwtScope.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */