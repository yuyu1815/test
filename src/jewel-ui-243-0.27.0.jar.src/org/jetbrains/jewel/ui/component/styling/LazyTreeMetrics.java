/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Stable;
/*    */ import androidx.compose.ui.unit.Dp;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\013\b\007\030\000 \0212\0020\001:\001\021B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\007¢\006\004\b\b\020\tR\023\020\002\032\0020\003¢\006\n\n\002\020\f\032\004\b\n\020\013R\023\020\004\032\0020\003¢\006\n\n\002\020\f\032\004\b\r\020\013R\023\020\005\032\0020\003¢\006\n\n\002\020\f\032\004\b\016\020\013R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\017\020\020¨\006\022"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/LazyTreeMetrics;", "", "indentSize", "Landroidx/compose/ui/unit/Dp;", "elementMinHeight", "chevronContentGap", "simpleListItemMetrics", "Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemMetrics;", "<init>", "(FFFLorg/jetbrains/jewel/ui/component/styling/SimpleListItemMetrics;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIndentSize-D9Ej5fM", "()F", "F", "getElementMinHeight-D9Ej5fM", "getChevronContentGap-D9Ej5fM", "getSimpleListItemMetrics", "()Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemMetrics;", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class LazyTreeMetrics
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final float indentSize;
/*    */   private final float elementMinHeight;
/*    */   private final float chevronContentGap;
/*    */   @NotNull
/*    */   private final SimpleListItemMetrics simpleListItemMetrics;
/*    */   public static final int $stable;
/*    */   
/*    */   private LazyTreeMetrics(float indentSize, float elementMinHeight, float chevronContentGap, SimpleListItemMetrics simpleListItemMetrics) {
/* 41 */     this.indentSize = indentSize;
/* 42 */     this.elementMinHeight = elementMinHeight;
/* 43 */     this.chevronContentGap = chevronContentGap;
/* 44 */     this.simpleListItemMetrics = simpleListItemMetrics; } @NotNull public final SimpleListItemMetrics getSimpleListItemMetrics() { return this.simpleListItemMetrics; }
/*    */ 
/*    */   
/*    */   public final float getIndentSize-D9Ej5fM() {
/*    */     return this.indentSize;
/*    */   }
/*    */   
/*    */   public final float getElementMinHeight-D9Ej5fM() {
/*    */     return this.elementMinHeight;
/*    */   }
/*    */   
/*    */   public final float getChevronContentGap-D9Ej5fM() {
/*    */     return this.chevronContentGap;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LazyTreeMetrics))
/*    */       return false; 
/*    */     LazyTreeMetrics lazyTreeMetrics = (LazyTreeMetrics)other;
/*    */     return !Dp.equals-impl0(this.indentSize, lazyTreeMetrics.indentSize) ? false : (!Dp.equals-impl0(this.elementMinHeight, lazyTreeMetrics.elementMinHeight) ? false : (!Dp.equals-impl0(this.chevronContentGap, lazyTreeMetrics.chevronContentGap) ? false : (!!Intrinsics.areEqual(this.simpleListItemMetrics, lazyTreeMetrics.simpleListItemMetrics))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Dp.hashCode-impl(this.indentSize);
/*    */     result = result * 31 + Dp.hashCode-impl(this.elementMinHeight);
/*    */     result = result * 31 + Dp.hashCode-impl(this.chevronContentGap);
/*    */     return result * 31 + this.simpleListItemMetrics.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LazyTreeMetrics(indentSize=" + Dp.toString-impl(this.indentSize) + ", elementMinHeight=" + Dp.toString-impl(this.elementMinHeight) + ", chevronContentGap=" + Dp.toString-impl(this.chevronContentGap) + ", simpleListItemMetrics=" + this.simpleListItemMetrics + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/LazyTreeMetrics$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\LazyTreeMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */