/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.foundation.layout.PaddingValues;
/*    */ import androidx.compose.foundation.shape.CornerSize;
/*    */ import androidx.compose.runtime.Stable;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import androidx.compose.ui.unit.DpSize;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\016\b\007\030\000 \0262\0020\001:\001\026B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013R\026\020\002\032\0020\003X\004¢\006\n\n\002\020\016\032\004\b\f\020\rR\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\017\020\020R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\021\020\022R\026\020\b\032\0020\tX\004¢\006\n\n\002\020\025\032\004\b\023\020\024¨\006\027"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/TextFieldMetrics;", "Lorg/jetbrains/jewel/ui/component/styling/InputFieldMetrics;", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "cornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "minSize", "Landroidx/compose/ui/unit/DpSize;", "<init>", "(FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/shape/CornerSize;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBorderWidth-D9Ej5fM", "()F", "F", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "getCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "getMinSize-MYxV2XQ", "()J", "J", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class TextFieldMetrics
/*    */   implements InputFieldMetrics
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final float borderWidth;
/*    */   @NotNull
/*    */   private final PaddingValues contentPadding;
/*    */   @NotNull
/*    */   private final CornerSize cornerSize;
/*    */   private final long minSize;
/*    */   public static final int $stable;
/*    */   
/*    */   private TextFieldMetrics(float borderWidth, PaddingValues contentPadding, CornerSize cornerSize, long minSize) {
/* 52 */     this.borderWidth = borderWidth;
/* 53 */     this.contentPadding = contentPadding;
/* 54 */     this.cornerSize = cornerSize;
/* 55 */     this.minSize = minSize; } public long getMinSize-MYxV2XQ() { return this.minSize; }
/*    */ 
/*    */   
/*    */   public float getBorderWidth-D9Ej5fM() {
/*    */     return this.borderWidth;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public PaddingValues getContentPadding() {
/*    */     return this.contentPadding;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public CornerSize getCornerSize() {
/*    */     return this.cornerSize;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TextFieldMetrics))
/*    */       return false; 
/*    */     TextFieldMetrics textFieldMetrics = (TextFieldMetrics)other;
/*    */     return !Dp.equals-impl0(this.borderWidth, textFieldMetrics.borderWidth) ? false : (!Intrinsics.areEqual(this.contentPadding, textFieldMetrics.contentPadding) ? false : (!Intrinsics.areEqual(this.cornerSize, textFieldMetrics.cornerSize) ? false : (!!DpSize.equals-impl0(this.minSize, textFieldMetrics.minSize))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Dp.hashCode-impl(this.borderWidth);
/*    */     result = result * 31 + this.contentPadding.hashCode();
/*    */     result = result * 31 + this.cornerSize.hashCode();
/*    */     return result * 31 + DpSize.hashCode-impl(this.minSize);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TextFieldMetrics(borderWidth=" + Dp.toString-impl(this.borderWidth) + ", contentPadding=" + this.contentPadding + ", cornerSize=" + this.cornerSize + ", minSize=" + DpSize.toString-impl(this.minSize) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/TextFieldMetrics$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\TextFieldMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */