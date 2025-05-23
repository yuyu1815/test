/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ 
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import androidx.compose.ui.node.ModifierNodeElement;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\t\n\002\020\002\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\b\030\0002\b\022\004\022\0020\0020\001B\031\022\006\020\003\032\0020\004\022\b\b\002\020\005\032\0020\006¢\006\004\b\007\020\bJ\b\020\016\032\0020\002H\026J\020\020\017\032\0020\0202\006\020\021\032\0020\002H\026J\020\020\022\032\0020\004HÆ\003¢\006\004\b\023\020\nJ\t\020\024\032\0020\006HÆ\003J$\020\025\032\0020\0002\b\b\002\020\003\032\0020\0042\b\b\002\020\005\032\0020\006HÆ\001¢\006\004\b\026\020\027J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\033HÖ\003J\t\020\034\032\0020\006HÖ\001J\t\020\035\032\0020\036HÖ\001R\023\020\003\032\0020\004¢\006\n\n\002\020\013\032\004\b\t\020\nR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\f\020\r¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/components/JunieBackgroundElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/components/JunieBackgroundNode;", "color", "Landroidx/compose/ui/graphics/Color;", "maxCapacity", "", "<init>", "(JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "getMaxCapacity", "()I", "create", "update", "", "node", "component1", "component1-0d7_KjU", "component2", "copy", "copy-DxMtmZc", "(JI)Lcom/intellij/ml/llm/matterhorn/ej/ui/components/JunieBackgroundElement;", "equals", "", "other", "", "hashCode", "toString", "", "standalone"})
/*    */ final class JunieBackgroundElement
/*    */   extends ModifierNodeElement<JunieBackgroundNode>
/*    */ {
/*    */   private final long color;
/*    */   private final int maxCapacity;
/*    */   
/*    */   public final long getColor-0d7_KjU() {
/* 63 */     return this.color;
/* 64 */   } public final int getMaxCapacity() { return this.maxCapacity; } private JunieBackgroundElement(long color, int maxCapacity) { this.color = color; this.maxCapacity = maxCapacity; } @NotNull
/*    */   public JunieBackgroundNode create() {
/* 66 */     return new JunieBackgroundNode(this.color, this.maxCapacity, null);
/*    */   }
/*    */   public void update(@NotNull JunieBackgroundNode node) {
/* 69 */     Intrinsics.checkNotNullParameter(node, "node"); node.setColor-8_81llA(this.color);
/* 70 */     node.updateCacheSize(this.maxCapacity);
/*    */   }
/*    */   
/*    */   public final long component1-0d7_KjU() {
/*    */     return this.color;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.maxCapacity;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final JunieBackgroundElement copy-DxMtmZc(long color, int maxCapacity) {
/*    */     return new JunieBackgroundElement(color, maxCapacity, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "JunieBackgroundElement(color=" + Color.toString-impl(this.color) + ", maxCapacity=" + this.maxCapacity + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Color.hashCode-impl(this.color);
/*    */     return result * 31 + Integer.hashCode(this.maxCapacity);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof JunieBackgroundElement))
/*    */       return false; 
/*    */     JunieBackgroundElement junieBackgroundElement = (JunieBackgroundElement)other;
/*    */     return !Color.equals-impl0(this.color, junieBackgroundElement.color) ? false : (!(this.maxCapacity != junieBackgroundElement.maxCapacity));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieBackgroundElement.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */