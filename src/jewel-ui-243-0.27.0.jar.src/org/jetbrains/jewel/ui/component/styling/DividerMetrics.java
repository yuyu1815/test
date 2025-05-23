/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\t\b\007\030\000 \0132\0020\001:\001\013B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006R\023\020\002\032\0020\003¢\006\n\n\002\020\t\032\004\b\007\020\bR\023\020\004\032\0020\003¢\006\n\n\002\020\t\032\004\b\n\020\b¨\006\f"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/DividerMetrics;", "", "thickness", "Landroidx/compose/ui/unit/Dp;", "startIndent", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getThickness-D9Ej5fM", "()F", "F", "getStartIndent-D9Ej5fM", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class DividerMetrics {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final float thickness;
/*    */   private final float startIndent;
/*    */   public static final int $stable;
/*    */   
/* 19 */   private DividerMetrics(float thickness, float startIndent) { this.thickness = thickness; this.startIndent = startIndent; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof DividerMetrics)) return false;  DividerMetrics dividerMetrics = (DividerMetrics)other; return !Dp.equals-impl0(this.thickness, dividerMetrics.thickness) ? false : (!!Dp.equals-impl0(this.startIndent, dividerMetrics.startIndent)); } public final float getThickness-D9Ej5fM() { return this.thickness; } public int hashCode() { result = Dp.hashCode-impl(this.thickness); return result * 31 + Dp.hashCode-impl(this.startIndent); } public final float getStartIndent-D9Ej5fM() { return this.startIndent; } @NotNull public String toString() { return "DividerMetrics(thickness=" + Dp.toString-impl(this.thickness) + ", startIndent=" + Dp.toString-impl(this.startIndent) + ")"; }
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J!\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\007¢\006\004\b\t\020\n¨\006\013"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/DividerMetrics$Companion;", "", "<init>", "()V", "defaults", "Lorg/jetbrains/jewel/ui/component/styling/DividerMetrics;", "thickness", "Landroidx/compose/ui/unit/Dp;", "startIndent", "defaults-YgX7TsA", "(FF)Lorg/jetbrains/jewel/ui/component/styling/DividerMetrics;", "ui"}) @SourceDebugExtension({"SMAP\nDividerStyling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DividerStyling.kt\norg/jetbrains/jewel/ui/component/styling/DividerMetrics$Companion\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,29:1\n149#2:30\n*S KotlinDebug\n*F\n+ 1 DividerStyling.kt\norg/jetbrains/jewel/ui/component/styling/DividerMetrics$Companion\n*L\n21#1:30\n*E\n"})
/*    */   public static final class Companion { @NotNull
/* 22 */     public final DividerMetrics defaults-YgX7TsA(float thickness, float startIndent) { return new DividerMetrics(thickness, startIndent, null); }
/*    */ 
/*    */     
/*    */     private Companion() {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\DividerMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */