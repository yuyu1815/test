/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.foundation.layout.PaddingValues;
/*    */ import androidx.compose.foundation.shape.CornerSize;
/*    */ import androidx.compose.runtime.Stable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\t\b\007\030\000 \0162\0020\001:\001\016B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\013\020\nR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\f\020\r¨\006\017"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemMetrics;", "", "innerPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "outerPadding", "selectionBackgroundCornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "<init>", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/shape/CornerSize;)V", "getInnerPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "getOuterPadding", "getSelectionBackgroundCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class SimpleListItemMetrics
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final PaddingValues innerPadding;
/*    */   @NotNull
/*    */   private final PaddingValues outerPadding;
/*    */   @NotNull
/*    */   private final CornerSize selectionBackgroundCornerSize;
/*    */   public static final int $stable;
/*    */   
/*    */   public SimpleListItemMetrics(@NotNull PaddingValues innerPadding, @NotNull PaddingValues outerPadding, @NotNull CornerSize selectionBackgroundCornerSize) {
/* 34 */     this.innerPadding = innerPadding;
/* 35 */     this.outerPadding = outerPadding;
/* 36 */     this.selectionBackgroundCornerSize = selectionBackgroundCornerSize; } @NotNull public final CornerSize getSelectionBackgroundCornerSize() { return this.selectionBackgroundCornerSize; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final PaddingValues getInnerPadding() {
/*    */     return this.innerPadding;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final PaddingValues getOuterPadding() {
/*    */     return this.outerPadding;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SimpleListItemMetrics))
/*    */       return false; 
/*    */     SimpleListItemMetrics simpleListItemMetrics = (SimpleListItemMetrics)other;
/*    */     return !Intrinsics.areEqual(this.innerPadding, simpleListItemMetrics.innerPadding) ? false : (!Intrinsics.areEqual(this.outerPadding, simpleListItemMetrics.outerPadding) ? false : (!!Intrinsics.areEqual(this.selectionBackgroundCornerSize, simpleListItemMetrics.selectionBackgroundCornerSize)));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.innerPadding.hashCode();
/*    */     result = result * 31 + this.outerPadding.hashCode();
/*    */     return result * 31 + this.selectionBackgroundCornerSize.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SimpleListItemMetrics(innerPadding=" + this.innerPadding + ", outerPadding=" + this.outerPadding + ", selectionBackgroundCornerSize=" + this.selectionBackgroundCornerSize + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemMetrics$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\SimpleListItemMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */